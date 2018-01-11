package com.lx.pop.service.dao;

import com.lx.pop.entity.RefRolePrivEntity;
import com.lx.pop.query.RefRolePrivEntityQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RefRolePrivEntityDao {
    int countByExample(RefRolePrivEntityQuery example);

    int deleteByExample(RefRolePrivEntityQuery example);

    int insert(RefRolePrivEntity record);

    int insertSelective(RefRolePrivEntity record);

    List<RefRolePrivEntity> selectByExample(RefRolePrivEntityQuery example);

    int updateByExampleSelective(@Param("record") RefRolePrivEntity record, @Param("example") RefRolePrivEntityQuery example);

    int updateByExample(@Param("record") RefRolePrivEntity record, @Param("example") RefRolePrivEntityQuery example);


}