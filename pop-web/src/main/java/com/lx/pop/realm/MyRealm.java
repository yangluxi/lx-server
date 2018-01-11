package com.lx.pop.realm;

import com.lx.pop.dto.SAdminDto;
import com.lx.pop.dto.SPrivilegeDto;
import com.lx.pop.dto.SRoleDto;
import com.lx.pop.service.ISystemService;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Description
 * ProjectName pop
 * Created by lucy on 2017/12/22 17:18.
 * Version 1.0
 */
public class MyRealm extends AuthorizingRealm {


    @Autowired
    private ISystemService systemService;


    @Override
    public void setName(String name) {
        super.setName("MyRealm");
    }

    /**
     * 授权
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SAdminDto sAdminDto = (SAdminDto) getAvailablePrincipal(principalCollection);

        SRoleDto roleDto = systemService.findPrivByRoleId("10");
        //单独定一个集合对象
        List<String> permissions = new ArrayList<String>();
        if(roleDto != null && CollectionUtils.isNotEmpty(roleDto.getPrivilegeDtos())){
            for(SPrivilegeDto privilegeDto :roleDto.getPrivilegeDtos()){
                permissions.add(privilegeDto.getPrivName());
            }
        }

        System.out.println("获取权限");
        //查到权限数据，返回授权信息(要包括 上边的permissions)
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        //将上边查询到授权信息填充到simpleAuthorizationInfo对象中
        simpleAuthorizationInfo.addStringPermissions(permissions);
        return simpleAuthorizationInfo;
    }


    /**
     * 认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //1.得到令牌
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        SAdminDto adminUser = new SAdminDto();
        adminUser.setUserName(token.getUsername());
        adminUser.setPasswd(String.valueOf(token.getPassword()));
        try {
            adminUser = systemService.findAdmin(adminUser);
            if(adminUser == null){
                return null;
            }
        } catch (Exception e){
            e.printStackTrace();
        }

        return new SimpleAuthenticationInfo(adminUser, adminUser.getPasswd(), getName());
    }



    //清除缓存
    public void clearCached() {
        PrincipalCollection principals = SecurityUtils.getSubject().getPrincipals();
        super.clearCache(principals);
    }

}
