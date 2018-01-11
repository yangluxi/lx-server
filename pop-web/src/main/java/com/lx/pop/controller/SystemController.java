package com.lx.pop.controller;

import com.lx.pop.RedisUtil;
import com.lx.pop.dto.SAdminDto;
import com.lx.pop.exception.CustomException;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description
 * ProjectName pop
 * Created by lucy on 2017/12/22 15:45.
 * Version 1.0
 */
@Controller
@RequestMapping(value = "/system")
public class SystemController {

    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping(value = "/loginView", method = RequestMethod.GET)
    public ModelAndView loginView() {
        ModelAndView mv = new ModelAndView();

        redisUtil.setCacheObject("1","我们是和已个算盘想啊哦是");
        Object o = redisUtil.getCacheObject("1");
        System.out.println(o);
        mv.setViewName("system/login");
        return mv;
    }

    @RequestMapping(value = "/indexView", method = RequestMethod.GET)
    public ModelAndView indexView() {
        ModelAndView mv = new ModelAndView();
        //从shiro 获取用户信息
        Subject subject = SecurityUtils.getSubject();
        SAdminDto adminUser = (SAdminDto) subject.getPrincipal();
        mv.addObject("adminUser", adminUser);
        mv.setViewName("system/index");
        return mv;
    }

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public ModelAndView main() {
        ModelAndView mv = new ModelAndView();
        //从shiro 获取用户信息
        Subject subject = SecurityUtils.getSubject();
        SAdminDto adminUser = (SAdminDto) subject.getPrincipal();
        mv.addObject("adminUser", adminUser);
        mv.setViewName("includes/main");
        return mv;
    }

    @RequestMapping(value = "/defaultPage")
    public ModelAndView defaultPage() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("includes/defaultPage");
        return mv;
    }


    @RequestMapping(value = "/adminList", method = RequestMethod.GET)
    public ModelAndView adminList() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("system/admin_list");
        return mv;
    }


    /**
     * @Description description
     * @MethodName 用户登录
     * @Param
     * @ReturnType
     * @Date 2017/12/28 10:12
     * @Author lucy
     * @Since 1.0
     */
    @RequestMapping(value = "/ajax/login", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> login(@RequestParam("username") String name,
                                     @RequestParam("password") String password) {
        Map<String, Object> result = new HashMap<>();
        try {
            //SHIRO 认证开始
            UsernamePasswordToken token = new UsernamePasswordToken(name, password);
            Subject subject = SecurityUtils.getSubject();
            subject.login(token);
            //提取用户实体
//            SAdminDto userDto = (SAdminDto) subject.getPrincipal();
            result.put("status", 1);
            return result;
        } catch (Exception e) {
            result.put("status", 0);
        }

        return result;
    }


    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public ModelAndView logout() {
        // 创建一个Subject实例，该实例认证要使用上边创建的securityManager进行
        Subject subject = SecurityUtils.getSubject();
        // 用户退出
        subject.logout();
        boolean isAuthenticated = subject.isAuthenticated();
        System.out.println("用户认证状态：" + isAuthenticated);

        return new ModelAndView("system/login");
    }


}
