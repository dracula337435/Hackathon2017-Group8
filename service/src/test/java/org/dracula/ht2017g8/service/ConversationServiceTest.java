package org.dracula.ht2017g8.service;

import org.dracula.ht2017g8.bo.CommonBO;
import org.dracula.ht2017g8.service.impl.WatsonConversationServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Scanner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ConversationServiceTest.Config.class)
public class ConversationServiceTest {

    @Autowired
    private WatsonConversationService watsonConversationService;

    @Test
    public void testNew(){
        watsonConversationService.talk("1", "");
    }

    @Test
    public void testDialog(){
        testDialog0(watsonConversationService);
    }

    private static void testDialog0(WatsonConversationService impl){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            String[] strings = line.split(",");
            if(strings.length == 1){
                strings = new String[]{"1", strings[0]};
            }
            CommonBO<List<String>> listCommonBO = impl.talk(strings[0], strings[1]);
            System.out.println(listCommonBO);
        }
    }

    /**
     * 发现一个小坑，用junit没有System.in，用传统main启动有
     * @param args
     */
    public static void main(String[] args){
        WatsonConversationService impl = new Config().watsonConversationService();
        testDialog0(impl);
    }

    public static class Config{

        @Bean
        public WatsonConversationService watsonConversationService(){
            WatsonConversationServiceImpl impl = new WatsonConversationServiceImpl();
            impl.setUsername("dd561000-d615-485d-9ada-ba8fe90090ba");
            impl.setPassword("jM7LzJJAzgBt");
            impl.setWorkspaceId("43bce0c8-a28d-44d5-a501-c1f62f57f06f");
            return impl;
        }

    }

}
