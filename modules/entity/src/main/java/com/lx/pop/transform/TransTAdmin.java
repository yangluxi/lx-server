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
 */

package com.lx.pop.transform;


import com.lx.pop.common.TransBase;
import com.lx.pop.dto.SAdminDto;
import com.lx.pop.entity.SAdminEntity;

/**
 * Created by Thinkpad on 2017/4/30.
 */
public class TransTAdmin extends TransBase {

    public static SAdminDto toTAdminDto(SAdminEntity tAdminEntity){
        SAdminDto tAdminDto = new SAdminDto();
        tAdminDto.setUserName(tAdminEntity.getUserName());
        tAdminDto.setPasswd(tAdminEntity.getPasswd());
        tAdminDto.setNickName(tAdminEntity.getNickName());
        tAdminDto.setRealName(tAdminEntity.getRealName());
        tAdminDto.setGender(tAdminEntity.getGender());
        tAdminDto.setMobile(tAdminEntity.getMobile());
        tAdminDto.setEmail(tAdminEntity.getEmail());
        tAdminDto.setPortraitUrl(tAdminEntity.getPortraitUrl());
        tAdminDto.setpId(tAdminEntity.getpId());
        tAdminDto.setcId(tAdminEntity.getcId());
        tAdminDto.setoId(tAdminEntity.getoId());

        new TransTAdmin().toDto(tAdminDto,tAdminEntity);
        return tAdminDto;
    }

    public static SAdminEntity toTAdminEntity(SAdminDto tAdminDto){
        SAdminEntity tAdminEntity = new SAdminEntity();
        tAdminEntity.setUserName(tAdminDto.getUserName());
        tAdminEntity.setPasswd(tAdminDto.getPasswd());
        tAdminEntity.setNickName(tAdminDto.getNickName());
        tAdminEntity.setRealName(tAdminDto.getRealName());
        tAdminEntity.setGender(tAdminDto.getGender());
        tAdminEntity.setMobile(tAdminDto.getMobile());
        tAdminEntity.setEmail(tAdminDto.getEmail());
        tAdminEntity.setPortraitUrl(tAdminDto.getPortraitUrl());
        tAdminEntity.setpId(tAdminDto.getpId());
        tAdminEntity.setcId(tAdminDto.getcId());
        tAdminEntity.setoId(tAdminDto.getoId());

        new TransTAdmin().toEntity(tAdminDto,tAdminEntity);
        return tAdminEntity;
    }

}
/*
    private String userName;
    private String passwd;
    private String nickName;
    private String realName;
    private Byte gender;
    private String mobile;
    private String email;
    private String portraitUrl;
private Long pId;
    private Long cId;
    private Long oId;
 */