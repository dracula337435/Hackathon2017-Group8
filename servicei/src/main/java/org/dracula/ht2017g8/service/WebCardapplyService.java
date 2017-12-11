package org.dracula.ht2017g8.service;

import org.dracula.ht2017g8.bo.CommonBO;
import org.dracula.ht2017g8.bo.WebCardapplyBO;

public interface WebCardapplyService {

    CommonBO<WebCardapplyBO> getById(Integer id);

    CommonBO<Integer> add(WebCardapplyBO webCardapplyBO);

}
