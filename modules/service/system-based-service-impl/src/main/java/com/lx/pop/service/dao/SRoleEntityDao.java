package com.lx.pop.service.dao;

import com.lx.pop.entity.SRoleEntity;
import com.lx.pop.query.SRoleEntityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SRoleEntityDao {
    int countByExample(SRoleEntityQuery example);

    int deleteByExample(SRoleEntityQuery example);

    int deleteByPrimaryKey(Long id);

    int insert(SRoleEntity record);

    int insertSelective(SRoleEntity record);

    List<SRoleEntity> selectByExample(SRoleEntityQuery example);

    SRoleEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SRoleEntity record, @Param("example") SRoleEntityQuery example);

    int updateByExample(@Param("record") SRoleEntity record, @Param("example") SRoleEntityQuery example);

    int updateByPrimaryKeySelective(SRoleEntity record);

    int updateByPrimaryKey(SRoleEntity record);


    SRoleEntity findPrivByRoleId(String roleId);
}