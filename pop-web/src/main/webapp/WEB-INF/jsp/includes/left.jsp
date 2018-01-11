<%--
  Created by IntelliJ IDEA.
  User: yangluxi
  Date: 2017/12/27
  Time: 13:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>左侧菜单</title>


    <script type="text/javascript">


        function onClick(srcUrl) {

            $(window.parent.document).find("#leftMain").attr("src", srcUrl);
        }


    </script>
</head>
<body>
<!-- left side start-->
<div class="left-side sticky-left-side">

    <!--logo and iconic logo start-->
    <div class="logo">
        <a href="index.html"><img src="${base}images/logo.png" alt=""></a>
    </div>

    <div class="logo-icon text-center">
        <a href="index.html"><img src="${base}images/logo_icon.png" alt=""></a>
    </div>
    <!--logo and iconic logo end-->

    <div class="left-side-inner">

        <!-- visible to small devices only -->
        <div class="visible-xs hidden-sm hidden-md hidden-lg">
            <div class="media logged-user">
                <img alt="" src="${base}images/photos/user-avatar.png" class="media-object">
                <div class="media-body">
                    <h4><a href="#">111111</a></h4>
                    <span>"Hello There..."</span>
                </div>
            </div>

            <h5 class="left-nav-title">Account Information</h5>
            <ul class="nav nav-pills nav-stacked custom-nav">
                <li><a href="#"><i class="fa fa-user"></i> <span>Profile</span></a></li>
                <li><a href="#"><i class="fa fa-cog"></i> <span>Settings</span></a></li>
                <li><a href="#"><i class="fa fa-sign-out"></i> <span>Sign Out</span></a></li>
            </ul>
        </div>

        <!--sidebar nav start-->
        <ul class="nav nav-pills nav-stacked custom-nav">

            <li class="active">
                <a href="${base}system/indexView.htm">
                    <i class="fa fa-home"></i>
                    <span>控制面板</span>
                </a>
            </li>

            <%--<shiro:hasPermission name="user:select">--%>
            <li class="menu-list"><a href=""><i class="fa fa-laptop"></i>
                <span>系统管理</span></a>
                <ul class="sub-menu-list">
                    <li><a onclick="onClick('${base}system/adminList.htm')" href="javascript:void (0)"> 用户管理</a></li>
                    <li><a href="boxed_view.html"> 菜单管理</a></li>
                    <li><a href="leftmenu_collapsed_view.html"> 权限管理</a></li>
                    <li><a href="horizontal_menu.html"> 角色管理</a></li>

                </ul>
            </li>
            <%--</shiro:hasPermission>--%>


            <li class="menu-list">
                <a href="">
                    <i class="fa fa-book"></i>
                    <span>商品管理</span>
                </a>
                <ul class="sub-menu-list">
                    <li><a href="general.html"> General</a></li>
                    <li><a href="buttons.html"> Buttons</a></li>
                    <li><a href="tabs-accordions.html"> Tabs & Accordions</a></li>
                    <li><a href="typography.html"> Typography</a></li>
                    <li><a href="slider.html"> Slider</a></li>
                    <li><a href="panels.html"> Panels</a></li>
                </ul>
            </li>


            <li><a href="${base}system/logout.htm"><i class="fa fa-sign-in"></i> <span>退出登录</span></a></li>

        </ul>
        <!--sidebar nav end-->

    </div>
</div>
<!-- left side end-->
</body>
</html>
