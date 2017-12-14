package org.dracula.ht2017g8.service;

import org.dracula.ht2017g8.bo.CommonBO;

public interface ModelService {

    CommonBO<String> predict(String payload);

}
