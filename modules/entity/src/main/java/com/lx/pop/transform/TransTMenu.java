package com.lx.pop.transform;


import com.lx.pop.common.TransBase;
import com.lx.pop.dto.SMenuDto;
import com.lx.pop.entity.SMenuEntity;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thinkpad on 2017/4/30.
 */
public class TransTMenu  extends TransBase {

    public static SMenuDto toTMenuDto(SMenuEntity tMenuEntity){
        SMenuDto tMenuDto = new SMenuDto();
        tMenuDto.setmName(tMenuEntity.getmName());
        tMenuDto.setUrl(tMenuEntity.getUrl());
        tMenuDto.setpId(tMenuEntity.getpId());
        tMenuDto.setSort(tMenuEntity.getSort());
//        tMenuDto.setBelongMenu(tMenuEntity.getBelongMenu());
//        List<TPrivilegeEntity> privilegeEntities=tMenuEntity.getPrivileges();
//        List<TPrivilegeDto> privileges=new ArrayList<>();
//        if (CollectionUtils.isNotEmpty(privilegeEntities)){
//            for (TPrivilegeEntity privilegeEntity:privilegeEntities){
//                TPrivilegeDto privilegeDto=TransTPrivilege.toDto(privilegeEntity);
//                privileges.add(privilegeDto);
//            }
//        }
//        tMenuDto.setPrivileges(privileges);
//        new TransTMenu().toDto(tMenuDto,tMenuEntity);
        return tMenuDto;
    }

    public static SMenuEntity toTMenuEntity(SMenuDto tMenuDto){
        SMenuEntity tMenuEntity = new SMenuEntity();
        tMenuEntity.setmName(tMenuDto.getmName());
        tMenuEntity.setUrl(tMenuDto.getUrl());
        tMenuEntity.setpId(tMenuDto.getpId());
        tMenuEntity.setSort(tMenuDto.getSort());
//        new TransTMenu().toEntity(tMenuDto,tMenuEntity);
        return tMenuEntity;
    }
}
