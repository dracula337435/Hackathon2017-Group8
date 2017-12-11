package org.dracula.ht2017g8.dao.mybatis;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.dracula.ht2017g8.po.mybatis.WebCustomer;
import org.dracula.ht2017g8.po.mybatis.WebCustomerExample;

public interface WebCustomerMapper {
    long countByExample(WebCustomerExample example);

    int deleteByExample(WebCustomerExample example);

    int insert(WebCustomer record);

    int insertSelective(WebCustomer record);

    List<WebCustomer> selectByExample(WebCustomerExample example);

    int updateByExampleSelective(@Param("record") WebCustomer record, @Param("example") WebCustomerExample example);

    int updateByExample(@Param("record") WebCustomer record, @Param("example") WebCustomerExample example);
}