<%--
  Created by IntelliJ IDEA.
  User: yangluxi
  Date: 2017/12/28
  Time: 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/jsp/includes/common.jsp" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="ThemeBucket">
    <link rel="shortcut icon" href="#" type="image/png">

    <title>404 Page</title>

    <link href="${base}css/style.css" rel="stylesheet">
    <link href="${base}css/style-responsive.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->
</head>

<body class="error-page">

<section>
    <div class="container ">

        <section class="error-wrapper text-center">
            <h1><img alt="" src="${base}images/404-error.png"></h1>
            <h2>page not found</h2>
            <h3>We Couldn’t Find This Page</h3>
            <a class="back-btn" href="${base}system/main.htm"> 返回主页</a>
        </section>

    </div>
</section>

<!-- Placed js at the end of the document so the pages load faster -->
<script src="${base}js/jquery-1.10.2.min.js"></script>
<script src="${base}js/jquery-migrate-1.2.1.min.js"></script>
<script src="${base}js/bootstrap.min.js"></script>
<script src="${base}js/modernizr.min.js"></script>


<!--common scripts for all pages-->
<!--<script src="js/scripts.js"></script>-->

</body>
</html>
