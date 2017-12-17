package org.dracula.ht2017g8.controller;

import org.dracula.ht2017g8.bo.CommonBO;
import org.dracula.ht2017g8.bo.ReturnCodeAndMsg;
import org.dracula.ht2017g8.vo.BroadcastReqVO;
import org.dracula.ht2017g8.websocket.MyWebSocket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BroadcastingController {

    @Autowired
    private MyWebSocket myWebSocket;

    @RequestMapping(value="/websocket/broadcast", method= RequestMethod.GET)
    public CommonBO<String> broadcast(BroadcastReqVO reqVO){
        myWebSocket.broadcast(reqVO.getMsg());
        CommonBO<String> rslt = new CommonBO<>();
        rslt.setCodeAndMsg(ReturnCodeAndMsg.SUCCESS);
        return rslt;
    }

}
