package org.dracula.ht2017g8.dao.mybatis;

import org.apache.ibatis.annotations.Param;
import org.dracula.ht2017g8.po.mybatis.WebCustapply;
import org.dracula.ht2017g8.po.mybatis.WebCustapplyExample;

import java.util.List;

public interface WebCustapplyMapper {
    long countByExample(WebCustapplyExample example);

    int deleteByExample(WebCustapplyExample example);

    int insert(WebCustapply record);

    int insertSelective(WebCustapply record);

    List<WebCustapply> selectByExample(WebCustapplyExample example);

    int updateByExampleSelective(@Param("record") WebCustapply record, @Param("example") WebCustapplyExample example);

    int updateByExample(@Param("record") WebCustapply record, @Param("example") WebCustapplyExample example);
}