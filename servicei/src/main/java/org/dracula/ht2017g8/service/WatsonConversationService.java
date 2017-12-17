package org.dracula.ht2017g8.service;

import org.dracula.ht2017g8.bo.CommonBO;

import java.util.List;

public interface WatsonConversationService {
    CommonBO<List<String>> talk(String id, String inputText);

    CommonBO<String> endDialog(String id);
}
