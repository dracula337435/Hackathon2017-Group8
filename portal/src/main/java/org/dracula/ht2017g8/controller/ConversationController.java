package org.dracula.ht2017g8.controller;

import org.dracula.ht2017g8.bo.CommonBO;
import org.dracula.ht2017g8.bo.ReturnCodeAndMsg;
import org.dracula.ht2017g8.service.WatsonConversationService;
import org.dracula.ht2017g8.vo.BroadcastReqVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class ConversationController {

    private static long count;

    private static final Object MONITOR_OBJ = new Object();

    public static final String CONVERSATION_TALK_ID_NAME = "talk-id";

    @Autowired
    private WatsonConversationService watsonConversationService;

    @RequestMapping(value="/conversation/dialog", method=RequestMethod.POST)
    public CommonBO<List<String>> talk(BroadcastReqVO reqVO, HttpSession session){
        Object attribute = session.getAttribute(CONVERSATION_TALK_ID_NAME);
        if(attribute == null){
            synchronized(MONITOR_OBJ){
                count++;
            }
            session.setAttribute(CONVERSATION_TALK_ID_NAME, Long.valueOf(count));
        }
        if(attribute instanceof String){
            String talkId = (String)attribute;
            CommonBO<List<String>> listCommonBO = watsonConversationService.talk(talkId, reqVO.getMsg());
            if(listCommonBO != null){
                return listCommonBO;
            }else{
                listCommonBO = new CommonBO<>();
                listCommonBO.setCodeAndMsg(ReturnCodeAndMsg.FAIL_00034);
                return listCommonBO;
            }
        }else{
            CommonBO<List<String>> rslt = new CommonBO<>();
            rslt.setCodeAndMsg(ReturnCodeAndMsg.FAIL_00035);
            return rslt;
        }
    }

}
