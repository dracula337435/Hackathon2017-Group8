package org.dracula.ht2017g8.service;

import org.dracula.ht2017g8.bo.CommonBO;
import org.dracula.ht2017g8.bo.WebBusintroBO;

import java.util.List;

public interface WebBusintroService {

    CommonBO<List<WebBusintroBO>> getAll();

}
