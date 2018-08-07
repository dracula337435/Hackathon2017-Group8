package org.dracula.ht2017g8.service;

import org.dracula.ht2017g8.bo.CommonBO;

public interface PredictionService {

    /**
     *
     * @param custId
     * @return
     */
    CommonBO<String> getPayLoad(String custId);

    /**
     *
     * @param custId
     * @return
     */
    CommonBO<String> predict(String custId);

}
