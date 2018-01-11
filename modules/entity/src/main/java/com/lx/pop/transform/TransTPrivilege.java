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
import com.lx.pop.entity.SPrivilegeEntity;

/**
 * Description
 * ProjectName cams
 * Created by ljq on 2017/6/23 17:13.
 * Version 1.0
 */
public class TransTPrivilege extends TransBase {
    public  static SPrivilegeEntity toEntity(SPrivilegeDto dto){
        SPrivilegeEntity entity = new SPrivilegeEntity();
        entity.setPrivName(dto.getPrivName());
        entity.setMenuId(dto.getMenuId());
        entity.setMenuPid(dto.getMenuPid());
        entity.setSort(dto.getSort());
        entity.setUrl(dto.getUrl());
        new TransTPrivilege().toEntity(dto,entity);
        return entity;
    }

    public  static SPrivilegeDto toDto(SPrivilegeEntity entity){
        SPrivilegeDto dto = new SPrivilegeDto();
        dto.setPrivName(entity.getPrivName());
        dto.setMenuId(entity.getMenuId());
        dto.setMenuPid(entity.getMenuPid());
        dto.setSort(entity.getSort());
        dto.setUrl(entity.getUrl());
        new TransTPrivilege().toDto(dto,entity);
        return dto;
    }
}
