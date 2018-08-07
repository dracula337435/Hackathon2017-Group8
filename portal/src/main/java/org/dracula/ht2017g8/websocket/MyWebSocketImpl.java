package org.dracula.ht2017g8.websocket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author dk
 */
@ServerEndpoint(value = "/websocket/connection")
@Component
public class MyWebSocketImpl implements MyWebSocket {

    private static Logger logger = LoggerFactory.getLogger(MyWebSocketImpl.class);

    /**
     * 静态变量，用来记录当前在线连接数。应该把它设计成线程安全的。
     */
    private static int onlineCount = 0;

    /**
     * concurrent包的线程安全Set，用来存放每个客户端对应的MyWebSocket对象。
     */
    private static CopyOnWriteArraySet<SessionContainer> webSocketSet = new CopyOnWriteArraySet<>();

    /**
     * 连接建立成功调用的方法
     */
    @OnOpen
    public void onOpen(Session session) {
        SessionContainer sessionContainer = new SessionContainer(session);
        //加入set中
        webSocketSet.add(sessionContainer);
        addOnlineCount();           //在线数加1
        logger.info("有新连接加入！当前在线人数为" + getOnlineCount());
        try {
//            sendMessage(CommonConstant.CURRENT_WANGING_NUMBER.toString());
            sessionContainer.sendMessage("当前在线人数为" + getOnlineCount());
        } catch (IOException e) {
            logger.error("IO异常", e);
        }
    }

    /**
     * 连接关闭调用的方法
     */
    @OnClose
    public void onClose(Session session) {
        for(SessionContainer sc: webSocketSet){
            if(sc.getSession().equals(session)){
                webSocketSet.remove(sc);
            }
        }
        //从set中删除
        webSocketSet.remove(this);
        //在线数减1
        subOnlineCount();
        logger.info("有一连接关闭！当前在线人数为" + getOnlineCount());
    }

    /**
     * 收到客户端消息后调用的方法
     *
     * @param message 客户端发送过来的消息
     */
    @OnMessage
    public void onMessage(String message, Session session) {
        logger.info("来自客户端的消息:" + message);
        broadcast(message);
    }

    @Override
    public void broadcast(String message){
        //群发消息
        for (SessionContainer item : webSocketSet) {
            try {
                item.sendMessage(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 发生错误时调用
     */
    @OnError
    public void onError(Session session, Throwable error) {
        logger.error("发生错误", error);
    }

    public static synchronized int getOnlineCount() {
        return onlineCount;
    }

    public static synchronized void addOnlineCount() {
        MyWebSocketImpl.onlineCount++;
    }

    public static synchronized void subOnlineCount() {
        MyWebSocketImpl.onlineCount--;
    }

    static class SessionContainer{

        //与某个客户端的连接会话，需要通过它来给客户端发送数据

        private Session session;

        public SessionContainer(Session session){
            this.session = session;
        }

        public void sendMessage(String message) throws IOException {
            this.session.getBasicRemote().sendText(message);
            //this.session.getAsyncRemote().sendText(message);
        }

        public Session getSession() {
            return session;
        }

        public void setSession(Session session) {
            this.session = session;
        }
    }

}
