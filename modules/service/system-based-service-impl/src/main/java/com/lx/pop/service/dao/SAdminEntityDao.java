package com.lx.pop.service.dao;

import com.lx.pop.entity.SAdminEntity;
import com.lx.pop.query.SAdminEntityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SAdminEntityDao {
    int countByExample(SAdminEntityQuery example);

    int deleteByExample(SAdminEntityQuery example);

    int deleteByPrimaryKey(Long id);

    int insert(SAdminEntity record);

    int insertSelective(SAdminEntity record);

    List<SAdminEntity> selectByExample(SAdminEntityQuery example);

    SAdminEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SAdminEntity record, @Param("example") SAdminEntityQuery example);

    int updateByExample(@Param("record") SAdminEntity record, @Param("example") SAdminEntityQuery example);

    int updateByPrimaryKeySelective(SAdminEntity record);

    int updateByPrimaryKey(SAdminEntity record);
}