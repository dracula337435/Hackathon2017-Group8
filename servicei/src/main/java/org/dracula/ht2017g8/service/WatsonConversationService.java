package org.dracula.ht2017g8.service;

import org.dracula.ht2017g8.bo.CommonBO;

import java.util.List;

/**
 * @author dk
 */
public interface WatsonConversationService {

    /**
     *
     * @param id
     * @param inputText
     * @return
     */
    CommonBO<List<String>> talk(String id, String inputText);

    /**
     *
     * @param id
     * @return
     */
    CommonBO<String> endDialog(String id);
}
