package com.lx.pop.service;

import com.lx.pop.dto.SAdminDto;
import com.lx.pop.dto.SPrivilegeDto;
import com.lx.pop.dto.SRoleDto;

import java.util.List;

/**
 * Description
 * ProjectName pop
 * Created by lucy on 2017/12/22 19:30.
 * Version 1.0
 */
public interface ISystemService {



    SAdminDto findAdmin(SAdminDto adminDto);


    SRoleDto findPrivByRoleId(String roleId);


    List<SPrivilegeDto> findPrivilegeList();




}
