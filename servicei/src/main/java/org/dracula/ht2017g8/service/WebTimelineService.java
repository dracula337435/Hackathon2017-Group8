package org.dracula.ht2017g8.service;

import org.dracula.ht2017g8.bo.CommonBO;
import org.dracula.ht2017g8.bo.WebTimelineBO;

import java.util.List;
import java.util.Map;

/**
 * @author dk
 */
public interface WebTimelineService {

    CommonBO<Map<String, List<WebTimelineBO>>> getByCustId(String custId);

}
