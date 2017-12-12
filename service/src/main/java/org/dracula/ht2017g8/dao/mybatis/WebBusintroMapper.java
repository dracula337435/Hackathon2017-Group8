package org.dracula.ht2017g8.dao.mybatis;

import org.apache.ibatis.annotations.Param;
import org.dracula.ht2017g8.po.mybatis.WebBusintro;
import org.dracula.ht2017g8.po.mybatis.WebBusintroExample;

import java.util.List;

public interface WebBusintroMapper {
    long countByExample(WebBusintroExample example);

    int deleteByExample(WebBusintroExample example);

    int insert(WebBusintro record);

    int insertSelective(WebBusintro record);

    List<WebBusintro> selectByExampleWithBLOBs(WebBusintroExample example);

    List<WebBusintro> selectByExample(WebBusintroExample example);

    int updateByExampleSelective(@Param("record") WebBusintro record, @Param("example") WebBusintroExample example);

    int updateByExampleWithBLOBs(@Param("record") WebBusintro record, @Param("example") WebBusintroExample example);

    int updateByExample(@Param("record") WebBusintro record, @Param("example") WebBusintroExample example);
}