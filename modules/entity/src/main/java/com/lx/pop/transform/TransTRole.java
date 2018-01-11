/*
 * *
 *  *
 *  * Copyright (c) 2017 by Beijing Chuang Xin Qu Cheng Technology Co., Ltd
 *  * All rights reserved.
 *  *
 *  * The information contained herein is confidential and proprietary to
 *  * Beijing Beijing Chuang Xin Qu Cheng Technology Co., Ltd, and 
 *  * considered a trade secret as defined under civil and criminal statutes. 
 *  * Beijing Chuang Xin Qu Cheng Technology Co., Ltd shall pursue its
 *  * civil and criminal remedies in the event of unauthorized use or
 *  * misappropriation of its trade secrets.  Use of this information
 *  * by anyone other than authorized employees of Beijing Chuang Xin Qu Cheng 
 *  * Technology Co., Ltd is granted only under a written non-disclosure
 *  * agreement, expressly prescribing the scope and manner of such use.
 *  * 
 *  
 *
 */

package com.lx.pop.transform;

import com.lx.pop.common.TransBase;
import com.lx.pop.dto.SPrivilegeDto;
import com.lx.pop.dto.SRoleDto;
import com.lx.pop.entity.SPrivilegeEntity;
import com.lx.pop.entity.SRoleEntity;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Description
 * ProjectName cams
 * Created by ljq on 2017/6/23 17:18.
 * Version 1.0
 */
public class TransTRole extends TransBase {


    public static SRoleEntity toEntity(SRoleDto dto) {
        SRoleEntity entity = new SRoleEntity();
        entity.setrName(dto.getrName());
        entity.setSort(dto.getSort());
        new TransTRole().toEntity(dto, entity);
        return entity;
    }


    public static SRoleDto toDto(SRoleEntity entity) {
        SRoleDto dto = new SRoleDto();
        dto.setrName(entity.getrName());
        dto.setSort(entity.getSort());
        List<SPrivilegeEntity> privilegeEntities = entity.getPrivilegeEntityList();
        List<SPrivilegeDto> privilegeDtos = new ArrayList<>();
        if (CollectionUtils.isNotEmpty(privilegeEntities)) {
            for (SPrivilegeEntity privilegeEntity : privilegeEntities) {
                privilegeDtos.add(TransTPrivilege.toDto(privilegeEntity));
            }
            dto.setPrivilegeDtos(privilegeDtos);
        }
        new TransTRole().toDto(dto, entity);
        return dto;
    }
}
