package org.dracula.ht2017g8.dao.mybatis;

import org.dracula.ht2017g8.po.mybatis.WebTimeLine;

import java.util.List;

public interface WebTimeLineDAO {

    List<WebTimeLine> selectAll();

}
