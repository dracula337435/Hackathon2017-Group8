package org.dracula.ht2017g8.service;

import org.dracula.ht2017g8.bo.CommonBO;
import org.dracula.ht2017g8.bo.WebTimelineBO;

public interface WebTimelineService {

    CommonBO<WebTimelineBO> getByCustId(String custId);

}
