package com.lx.pop.service.dao;

import com.lx.pop.entity.SPrivilegeEntity;
import com.lx.pop.query.SPrivilegeEntityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SPrivilegeEntityDao {
    int countByExample(SPrivilegeEntityQuery example);

    int deleteByExample(SPrivilegeEntityQuery example);

    int deleteByPrimaryKey(Long id);

    int insert(SPrivilegeEntity record);

    int insertSelective(SPrivilegeEntity record);

    List<SPrivilegeEntity> selectByExample(SPrivilegeEntityQuery example);

    SPrivilegeEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SPrivilegeEntity record, @Param("example") SPrivilegeEntityQuery example);

    int updateByExample(@Param("record") SPrivilegeEntity record, @Param("example") SPrivilegeEntityQuery example);

    int updateByPrimaryKeySelective(SPrivilegeEntity record);

    int updateByPrimaryKey(SPrivilegeEntity record);
}