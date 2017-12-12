package org.dracula.ht2017g8.dao.mybatis;

import org.apache.ibatis.annotations.Param;
import org.dracula.ht2017g8.po.mybatis.WebCard;
import org.dracula.ht2017g8.po.mybatis.WebCardExample;

import java.util.List;

public interface WebCardMapper {
    long countByExample(WebCardExample example);

    int deleteByExample(WebCardExample example);

    int insert(WebCard record);

    int insertSelective(WebCard record);

    List<WebCard> selectByExampleWithBLOBs(WebCardExample example);

    List<WebCard> selectByExample(WebCardExample example);

    int updateByExampleSelective(@Param("record") WebCard record, @Param("example") WebCardExample example);

    int updateByExampleWithBLOBs(@Param("record") WebCard record, @Param("example") WebCardExample example);

    int updateByExample(@Param("record") WebCard record, @Param("example") WebCardExample example);
}