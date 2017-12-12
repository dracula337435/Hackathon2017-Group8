package org.dracula.ht2017g8.service;

import org.dracula.ht2017g8.bo.CommonBO;
import org.dracula.ht2017g8.bo.WebRateBO;

import java.util.List;

public interface WebRateService {

    CommonBO<List<WebRateBO>> getAll();

}
