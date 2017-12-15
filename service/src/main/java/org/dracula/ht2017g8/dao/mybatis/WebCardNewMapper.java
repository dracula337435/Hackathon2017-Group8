package org.dracula.ht2017g8.dao.mybatis;

import org.apache.ibatis.annotations.Param;
import org.dracula.ht2017g8.po.mybatis.WebCard;

import java.util.List;

public interface WebCardNewMapper {

    List<WebCard> getByProduct(@Param("product") String product);

}
