package com.lx.pop.entity;

import java.io.Serializable;

public class RefRolePrivEntity implements Serializable {


    private Long roleId;

    private Long privId;

    private static final long serialVersionUID = 1L;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getPrivId() {
        return privId;
    }

    public void setPrivId(Long privId) {
        this.privId = privId;
    }

}