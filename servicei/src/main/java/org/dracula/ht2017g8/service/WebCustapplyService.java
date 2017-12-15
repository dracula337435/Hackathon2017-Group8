package org.dracula.ht2017g8.service;

import org.dracula.ht2017g8.bo.CommonBO;
import org.dracula.ht2017g8.bo.WebCustapplyBO;

public interface WebCustapplyService {

    CommonBO<WebCustapplyBO> getById(String custId);

}
