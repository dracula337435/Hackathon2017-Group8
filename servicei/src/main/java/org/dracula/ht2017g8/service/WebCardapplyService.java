package org.dracula.ht2017g8.service;

import org.dracula.ht2017g8.bo.CommonBO;
import org.dracula.ht2017g8.bo.WebCardapplyBO;

/**
 * @author dk
 */
public interface WebCardapplyService {

    /**
     *
     * @param id
     * @return
     */
    CommonBO<WebCardapplyBO> getById(Integer id);

    /**
     *
     * @param webCardapplyBO
     * @return
     */
    CommonBO<Integer> add(WebCardapplyBO webCardapplyBO);

}
