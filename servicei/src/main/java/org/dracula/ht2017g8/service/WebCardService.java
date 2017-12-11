package org.dracula.ht2017g8.service;

import org.dracula.ht2017g8.bo.CommonBO;
import org.dracula.ht2017g8.bo.WebCardBO;

public interface WebCardService {

    CommonBO<WebCardBO> getById(Integer id);

}
