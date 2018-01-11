package com.lx.pop.entity;

import com.lx.pop.common.BaseEntity;


public class SPrivilegeEntity extends BaseEntity {


    private String privName;

    private Long menuId;

    private Long menuPid;

    private Integer sort;

    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPrivName() {
        return privName;
    }

    public void setPrivName(String privName) {
        this.privName = privName == null ? null : privName.trim();
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public Long getMenuPid() {
        return menuPid;
    }

    public void setMenuPid(Long menuPid) {
        this.menuPid = menuPid;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }




}