package com.lx.pop.dto;

import com.lx.pop.common.BaseDto;

import java.util.List;


public class SRoleDto extends BaseDto {

    private String rName;

    private Integer sort;


    private List<SPrivilegeDto> privilegeDtos;

    public List<SPrivilegeDto> getPrivilegeDtos() {
        return privilegeDtos;
    }

    public void setPrivilegeDtos(List<SPrivilegeDto> privilegeDtos) {
        this.privilegeDtos = privilegeDtos;
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