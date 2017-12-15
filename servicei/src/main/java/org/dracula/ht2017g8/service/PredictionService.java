package org.dracula.ht2017g8.service;

import org.dracula.ht2017g8.bo.CommonBO;

public interface PredictionService {

    CommonBO<String> getPayLoad(String custId);

    CommonBO<String> predict(String custId);

}
