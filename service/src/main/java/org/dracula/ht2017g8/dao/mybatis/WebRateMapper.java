package org.dracula.ht2017g8.dao.mybatis;

import org.apache.ibatis.annotations.Param;
import org.dracula.ht2017g8.po.mybatis.WebRate;
import org.dracula.ht2017g8.po.mybatis.WebRateExample;

import java.util.List;

public interface WebRateMapper {
    long countByExample(WebRateExample example);

    int deleteByExample(WebRateExample example);

    int insert(WebRate record);

    int insertSelective(WebRate record);

    List<WebRate> selectByExample(WebRateExample example);

    int updateByExampleSelective(@Param("record") WebRate record, @Param("example") WebRateExample example);

    int updateByExample(@Param("record") WebRate record, @Param("example") WebRateExample example);
}