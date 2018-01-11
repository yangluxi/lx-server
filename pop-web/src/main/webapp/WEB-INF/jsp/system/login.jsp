<%--
  Created by IntelliJ IDEA.
  User: yangluxi
  Date: 2017/12/22
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html lang="en">
<%@ include file="/WEB-INF/jsp/includes/common.jsp" %>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="ThemeBucket">
    <link rel="shortcut icon" href="#" type="image/png">

    <title>Login</title>

    <link href="${base}css/style.css" rel="stylesheet">
    <link href="${base}css/style-responsive.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="${base}js/html5shiv.js" type="text/javascript" charset="utf-8"></script>
    <script src="${base}js/respond.min.js" type="text/javascript" charset="utf-8"></script>

    <![endif]-->

    <script type="text/javascript">

        //登录提示方法
        function loginSubmit() {

            if (!$('#username').val() || !$('#password').val()) {
                alert('用户名密码不能为空');
                return;
            }
            var _name = $('#username').val();
            var _pwd = $('#password').val();
            $.ajax({
                url: base + "system/ajax/login.htm",
                type: "post",
                data: {
                    username: _name,
                    password: _pwd
                },
                success: function (data) {
                    if (data.status == 1) {
                        window.location = base + "system/main.htm";
                    } else {
                        alert('用户名密码错误');
                    }
                }
            })


        }

    </SCRIPT>

</head>

<body class="login-body">

<div class="container">

    <form class="form-signin">
        <div class="form-signin-heading text-center">
            <h1 class="sign-title">Sign In</h1>
            <img src="${base}images/login-logo.png" alt=""/>
        </div>
        <div class="login-wrap">
            <input type="text" name="username" id="username" class="form-control" placeholder="User ID" autofocus>
            <input type="password" name="password" id="password" class="form-control" placeholder="Password">

            <button class="btn btn-lg btn-login btn-block" type="button" onclick="loginSubmit()">
                <i class="fa fa-check"></i>
            </button>

            <div class="registration">
                Not a member yet?
                <a class="" href="registration.html">
                    Signup
                </a>
            </div>
            <label class="checkbox">
                <input type="checkbox" value="remember-me"> Remember me
                <span class="pull-right">
                    <a data-toggle="modal" href="#myModal"> Forgot Password?</a>

                </span>
            </label>

        </div>
    </form>

    <!-- Modal -->
    <div aria-hidden="true" aria-labelledby="myModalLabel" role="dialog" tabindex="-1" id="myModal"
         class="modal fade">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    <h4 class="modal-title">Forgot Password ?</h4>
                </div>
                <div class="modal-body">
                    <p>Enter your e-mail address below to reset your password.</p>
                    <input type="text" name="email" placeholder="Email" autocomplete="off"
                           class="form-control placeholder-no-fix">

                </div>
                <div class="modal-footer">
                    <button data-dismiss="modal" class="btn btn-default" type="button">Cancel</button>
                    <button class="btn btn-primary" type="button">Submit</button>
                </div>
            </div>
        </div>
    </div>
    <!-- modal -->


</div>


<!-- Placed js at the end of the document so the pages load faster -->

<!-- Placed js at the end of the document so the pages load faster -->
<script src="${base}js/jquery-1.10.2.min.js"></script>
<script src="${base}js/bootstrap.min.js"></script>
<script src="${base}js/modernizr.min.js"></script>

</body>
</html>

