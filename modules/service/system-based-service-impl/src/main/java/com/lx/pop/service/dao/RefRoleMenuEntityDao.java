package com.lx.pop.service.dao;

import com.lx.pop.entity.RefRoleMenuEntity;
import com.lx.pop.query.RefRoleMenuEntityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RefRoleMenuEntityDao {
    int countByExample(RefRoleMenuEntityQuery example);

    int deleteByExample(RefRoleMenuEntityQuery example);

    int insert(RefRoleMenuEntity record);

    int insertSelective(RefRoleMenuEntity record);

    List<RefRoleMenuEntity> selectByExample(RefRoleMenuEntityQuery example);

    int updateByExampleSelective(@Param("record") RefRoleMenuEntity record, @Param("example") RefRoleMenuEntityQuery example);

    int updateByExample(@Param("record") RefRoleMenuEntity record, @Param("example") RefRoleMenuEntityQuery example);
}