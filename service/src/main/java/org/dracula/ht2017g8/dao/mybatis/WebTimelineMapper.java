package org.dracula.ht2017g8.dao.mybatis;

import org.apache.ibatis.annotations.Param;
import org.dracula.ht2017g8.po.mybatis.WebTimeline;
import org.dracula.ht2017g8.po.mybatis.WebTimelineExample;

import java.util.List;

public interface WebTimelineMapper {
    long countByExample(WebTimelineExample example);

    int deleteByExample(WebTimelineExample example);

    int insert(WebTimeline record);

    int insertSelective(WebTimeline record);

    List<WebTimeline> selectByExample(WebTimelineExample example);

    int updateByExampleSelective(@Param("record") WebTimeline record, @Param("example") WebTimelineExample example);

    int updateByExample(@Param("record") WebTimeline record, @Param("example") WebTimelineExample example);
}