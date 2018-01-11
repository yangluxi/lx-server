package com.lx.pop.entity;

import com.lx.pop.common.BaseEntity;

import java.util.ArrayList;
import java.util.List;


public class SRoleEntity extends BaseEntity {

    private String rName;

    private Integer sort;

    private List<SPrivilegeEntity> privilegeEntityList;


    public List<SPrivilegeEntity> getPrivilegeEntityList() {
        return privilegeEntityList;
    }

    public void setPrivilegeEntityList(List<SPrivilegeEntity> privilegeEntityList) {
        this.privilegeEntityList = privilegeEntityList;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName == null ? null : rName.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }


}