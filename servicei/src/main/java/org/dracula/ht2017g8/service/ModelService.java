package org.dracula.ht2017g8.service;

import org.dracula.ht2017g8.bo.CommonBO;

/**
 * @author dk
 */
public interface ModelService {

    /**
     *
     * @param payload
     * @return
     */
    CommonBO<String> predict(String payload);

}
