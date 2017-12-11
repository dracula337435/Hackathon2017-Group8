package org.dracula.ht2017g8.service;

import org.dracula.ht2017g8.bo.CommonBO;
import org.dracula.ht2017g8.bo.WebCustomerBO;

public interface WebCustomerService {

    CommonBO<WebCustomerBO> getByCustId(String custId);

}
