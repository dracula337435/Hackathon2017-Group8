package org.dracula.ht2017g8.dao.mybatis;

import org.apache.ibatis.annotations.Param;
import org.dracula.ht2017g8.po.mybatis.WebCardapply;
import org.dracula.ht2017g8.po.mybatis.WebCardapplyExample;

import java.util.List;

public interface WebCardapplyMapper {
    long countByExample(WebCardapplyExample example);

    int deleteByExample(WebCardapplyExample example);

    int insert(WebCardapply record);

    int insertSelective(WebCardapply record);

    List<WebCardapply> selectByExample(WebCardapplyExample example);

    int updateByExampleSelective(@Param("record") WebCardapply record, @Param("example") WebCardapplyExample example);

    int updateByExample(@Param("record") WebCardapply record, @Param("example") WebCardapplyExample example);
}