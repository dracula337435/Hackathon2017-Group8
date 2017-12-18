package org.dracula.ht2017g8.controller;

import org.dracula.ht2017g8.bo.CommonBO;
import org.dracula.ht2017g8.bo.ReturnCodeAndMsg;
import org.dracula.ht2017g8.service.WatsonConversationService;
import org.dracula.ht2017g8.vo.BroadcastReqVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class ConversationController {

    private static Logger logger = LoggerFactory.getLogger(ConversationController.class);

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
            attribute = Long.toString(count);
            logger.info("新会话，分配新id。talk-id="+attribute);
            session.setAttribute(CONVERSATION_TALK_ID_NAME, attribute);
        }else{
            logger.info("老会话，继续使用原有id。talk-id="+attribute);
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

    @RequestMapping(value="/conversation/ending", method=RequestMethod.POST)
    public CommonBO<String> end(HttpSession session){
        CommonBO<String> rslt;
        Object attribute = session.getAttribute(CONVERSATION_TALK_ID_NAME);
        if(attribute == null){  //没有就没有吧。。。办法了。。。//或者context存在session中。。。
            rslt = new CommonBO<>();
            rslt.setCodeAndMsg(ReturnCodeAndMsg.SUCCESS);
            return rslt;
        }
        if(attribute instanceof String){
            String talkId = (String)attribute;
            rslt = watsonConversationService.endDialog(talkId);
            if(rslt != null){
                return rslt;
            }else{
                rslt = new CommonBO<>();
                rslt.setCodeAndMsg(ReturnCodeAndMsg.FAIL_00036);
                return rslt;
            }
        }else{
            rslt = new CommonBO<>();
            rslt.setCodeAndMsg(ReturnCodeAndMsg.FAIL_00037);
            return rslt;
        }
    }

}
