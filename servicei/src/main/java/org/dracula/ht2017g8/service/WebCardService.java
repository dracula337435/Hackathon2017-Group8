package org.dracula.ht2017g8.service;

import org.dracula.ht2017g8.bo.CommonBO;
import org.dracula.ht2017g8.bo.WebCardBO;

import java.util.List;

public interface WebCardService {

    CommonBO<WebCardBO> getById(Integer id);

    CommonBO<List<WebCardBO>> getSome(int limit);

    CommonBO<List<WebCardBO>> getByProduct(String product);

}
