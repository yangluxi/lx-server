package com.lx.pop.service.dao;

import com.lx.pop.entity.SMenuEntity;
import com.lx.pop.query.SMenuEntityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SMenuEntityDao {
    int countByExample(SMenuEntityQuery example);

    int deleteByExample(SMenuEntityQuery example);

    int deleteByPrimaryKey(Long id);

    int insert(SMenuEntity record);

    int insertSelective(SMenuEntity record);

    List<SMenuEntity> selectByExample(SMenuEntityQuery example);

    SMenuEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SMenuEntity record, @Param("example") SMenuEntityQuery example);

    int updateByExample(@Param("record") SMenuEntity record, @Param("example") SMenuEntityQuery example);

    int updateByPrimaryKeySelective(SMenuEntity record);

    int updateByPrimaryKey(SMenuEntity record);
}