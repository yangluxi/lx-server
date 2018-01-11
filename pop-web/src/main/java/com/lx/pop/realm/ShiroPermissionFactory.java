package com.lx.pop.realm;

import com.lx.pop.dto.SPrivilegeDto;
import com.lx.pop.service.ISystemService;
import org.apache.shiro.config.Ini;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.util.CollectionUtils;
import org.apache.shiro.web.config.IniFilterChainResolverFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Description 动态获取权限
 * ProjectName pop
 * Created by lucy on 2017/12/27 17:39.
 * Version 1.0
 */
public class ShiroPermissionFactory extends ShiroFilterFactoryBean {


    /**
     * 配置中的过滤链
     */
    public static String definitions;

    // 注意/r/n前不能有空格
    private static final String CRLF = "\r\n";

    @Autowired
    private ISystemService systemService;

    /**
     * @Description description
     * @MethodName 获取权限
     * @Param
     * @ReturnType
     * @Date 2017/12/27 17:49
     * @Author lucy
     * @Since 1.0
     */
    @Override
    public void setFilterChainDefinitions(String definitions) {
        ShiroPermissionFactory.definitions = definitions;

        List<SPrivilegeDto> permissions = systemService.findPrivilegeList();
        for (SPrivilegeDto po : permissions) {
            //字符串拼接权限 必须URL和权限名称同时存在
            definitions = definitions + CRLF + po.getUrl() + " =  "+"perms["+po.getPrivName()+"]";
        }
        //从配置文件加载权限配置
        Ini ini = new Ini();
        ini.load(definitions);
        Ini.Section section = ini.getSection(IniFilterChainResolverFactory.URLS);
        if (CollectionUtils.isEmpty(section)) {
            section = ini.getSection(Ini.DEFAULT_SECTION_NAME);
        }

        //加入权限集合
        setFilterChainDefinitionMap(section);
    }

}
