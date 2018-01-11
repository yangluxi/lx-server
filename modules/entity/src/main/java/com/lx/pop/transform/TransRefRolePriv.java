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


import com.lx.pop.dto.RefRolePrivDto;
import com.lx.pop.entity.RefRolePrivEntity;

/**
 * Description
 * ProjectName cams
 * Created by ljq on 2017/6/23 17:15.
 * Version 1.0
 */
public class TransRefRolePriv {
    public  static RefRolePrivEntity toEntity(RefRolePrivDto dto){
        RefRolePrivEntity entity = new RefRolePrivEntity();
        entity.setPrivId(dto.getPrivId());
        entity.setRoleId(dto.getRoleId());
        return entity;
    }


    public  static RefRolePrivDto toDto(RefRolePrivEntity entity){
        RefRolePrivDto dto = new RefRolePrivDto();
        dto.setPrivId(entity.getPrivId());
        dto.setRoleId(entity.getRoleId());
        return dto;
    }
}
