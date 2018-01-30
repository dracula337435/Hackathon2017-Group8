package org.dracula.ht2017g8.speechandtext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

@ServerEndpoint(value = "/speechandtext/websocket")
@Component
public class MyWebSocket2 {

    private static Logger logger = LoggerFactory.getLogger(MyWebSocket2.class);

    /**
     * 连接建立成功调用的方法
     */
    @OnOpen
    public void onOpen(Session session) {
        logger.info("有新连接加入！");
        try {
//            sendMessage(CommonConstant.CURRENT_WANGING_NUMBER.toString());
            session.getBasicRemote().sendText("服务端已建立连接");
        } catch (IOException e) {
            logger.error("IO异常", e);
        }
    }

    /**
     * 连接关闭调用的方法
     */
    @OnClose
    public void onClose(Session session) {
        logger.info("有一连接关闭！");
    }

    /**
     * 收到客户端消息后调用的方法
     *
     * @param message 客户端发送过来的消息
     */
    @OnMessage
    public void onMessage(String message, Session session) {
        logger.info("来自客户端的消息，由string接到:" + message);
    }

    /**
     * 收到客户端消息后调用的方法
     *
     * @param message 客户端发送过来的消息
     */
    @OnMessage
    public void onMessage(byte[] message, Session session) {
        logger.info("来自客户端的消息，由byte[]接到:" + message);
    }

}
