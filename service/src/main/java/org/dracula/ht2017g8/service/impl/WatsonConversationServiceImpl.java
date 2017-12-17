package org.dracula.ht2017g8.service.impl;

import com.ibm.watson.developer_cloud.conversation.v1.Conversation;
import com.ibm.watson.developer_cloud.conversation.v1.model.*;
import org.dracula.ht2017g8.bo.CommonBO;
import org.dracula.ht2017g8.bo.ReturnCodeAndMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@ManagedResource
public class WatsonConversationServiceImpl implements org.dracula.ht2017g8.service.WatsonConversationService {

    @Value("${conversation.username}")
    private String username;

    @Value("${conversation.password}")
    private String password;

    @Value("${conversation.workspace-id}")
    private String workspaceId;

    private static Logger logger = LoggerFactory.getLogger(WatsonConversationServiceImpl.class);

    private Map<String, MessageResponse> idToRespones = new HashMap<>();

    //TODO 很多异常情况没有处理
    @Override
    public CommonBO<List<String>> talk(String id, String inputText){
        CommonBO<List<String>> rslt = new CommonBO();
        //
        MessageResponse lastResponse = idToRespones.get(id);
        //
        MessageOptions options;
        if(lastResponse == null){
            InputData input = new InputData.Builder("hello, world").build();
            options = new MessageOptions.Builder(workspaceId).input(input).build();
        }else{
            InputData input = new InputData.Builder(inputText).build();
            MessageOptions.Builder builder = new MessageOptions.Builder(workspaceId).input(input);
            // 踩了坑，设置且仅设置input,alter...,context
            // 意图和实体不要送，否则一直第一句
            Context context = lastResponse.getContext();
            if(context != null){
                builder.context(context);
            }
            builder.alternateIntents(true);
            options = builder.build();
        }
        //
        Conversation service = new Conversation(Conversation.VERSION_DATE_2017_05_26);
        service.setUsernameAndPassword(username, password);
        MessageResponse response = service.message(options).execute();
        //
        logger.info(response.toString());
//        System.out.println(response);
        idToRespones.put(id, response);
        rslt.setCodeAndMsg(ReturnCodeAndMsg.SUCCESS);
        return rslt;
    }

    @Override
    public CommonBO<String> endDialog(String id){
        idToRespones.remove(id);
        CommonBO<String> rslt = new CommonBO<>();
        rslt.setCodeAndMsg(ReturnCodeAndMsg.SUCCESS);
        return rslt;
    }

    @ManagedAttribute
    public String getUsername() {
        return username;
    }

    @ManagedAttribute
    public void setUsername(String username) {
        this.username = username;
    }

    @ManagedAttribute
    public String getPassword() {
        return password;
    }

    @ManagedAttribute
    public void setPassword(String password) {
        this.password = password;
    }

    @ManagedAttribute
    public String getWorkspaceId() {
        return workspaceId;
    }

    @ManagedAttribute
    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }
}
