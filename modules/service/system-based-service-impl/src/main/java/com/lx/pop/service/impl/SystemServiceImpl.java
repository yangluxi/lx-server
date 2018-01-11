package com.lx.pop.service.impl;

import com.lx.pop.dto.*;
import com.lx.pop.entity.SAdminEntity;
import com.lx.pop.entity.SPrivilegeEntity;
import com.lx.pop.entity.SRoleEntity;
import com.lx.pop.query.SAdminEntityQuery;
import com.lx.pop.query.SPrivilegeEntityQuery;
import com.lx.pop.service.ISystemService;
import com.lx.pop.service.dao.RefRolePrivEntityDao;
import com.lx.pop.service.dao.SAdminEntityDao;
import com.lx.pop.service.dao.SPrivilegeEntityDao;
import com.lx.pop.service.dao.SRoleEntityDao;
import com.lx.pop.transform.TransTAdmin;
import com.lx.pop.transform.TransTPrivilege;
import com.lx.pop.transform.TransTRole;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Description
 * ProjectName pop
 * Created by lucy on 2017/12/22 19:30.
 * Version 1.0
 */
@Service
public class SystemServiceImpl implements ISystemService {

    @Autowired
    private SAdminEntityDao adminEntityDao;

    @Autowired
    private RefRolePrivEntityDao refRolePrivEntityDao;

    @Autowired
    private SRoleEntityDao roleEntityDao;

    @Autowired
    private SPrivilegeEntityDao privilegeEntityDao;

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Override
    public SAdminDto findAdmin(SAdminDto adminDto) {
        SAdminEntityQuery adminEntityQuery = new SAdminEntityQuery();
        SAdminEntityQuery.Criteria criteria = adminEntityQuery.createCriteria();
        criteria.andUserNameEqualTo(adminDto.getUserName());
        criteria.andPasswdEqualTo(adminDto.getPasswd());
        List<SAdminEntity> adminEntities =  adminEntityDao.selectByExample(adminEntityQuery);
        if(CollectionUtils.isNotEmpty(adminEntities)){
            return TransTAdmin.toTAdminDto(adminEntities.get(0));
        }

        return null;
    }

    @Override
    public SRoleDto findPrivByRoleId(String roleId) {
        SRoleEntity roleEntity = roleEntityDao.findPrivByRoleId(roleId);
        if(roleEntity == null){
            return null;
        }
        return TransTRole.toDto(roleEntity);
    }

    @Override
    public List<SPrivilegeDto> findPrivilegeList() {

        redisTemplate.opsForValue().set("111111","redis连接成功,哈哈  ！");
        String aa = (String) redisTemplate.opsForValue().get("111111");
        System.out.println(aa);
        List<SPrivilegeDto> list = new ArrayList<>();
        List<SPrivilegeEntity> entities = privilegeEntityDao.selectByExample(new SPrivilegeEntityQuery());
        if(CollectionUtils.isNotEmpty(entities)){
            for(SPrivilegeEntity entity:entities){
                list.add(TransTPrivilege.toDto(entity));
            }
        }
        return list;
    }


}
