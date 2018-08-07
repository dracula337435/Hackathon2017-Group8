package org.dracula.ht2017g8.service;

import org.dracula.ht2017g8.bo.CommonBO;
import org.dracula.ht2017g8.bo.WebCardBO;

import java.util.List;

/**
 * @author dk
 */
public interface WebCardService {

    /**
     *
     * @param cardCode
     * @return
     */
    CommonBO<WebCardBO> getByCardCode(String cardCode);

    /**
     *
     * @param limit
     * @return
     */
    CommonBO<List<WebCardBO>> getSome(int limit);

    /**
     *
     * @param product
     * @return
     */
    CommonBO<List<WebCardBO>> getByProduct(String product);

}
