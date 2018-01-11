<%--
  Created by IntelliJ IDEA.
  User: yangluxi
  Date: 2017/12/27
  Time: 13:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
    <meta name="keywords"
          content="admin, dashboard, bootstrap, template, flat, modern, theme, responsive, fluid, retina, backend, html5, css, css3">
    <meta name="description" content="">
    <meta name="author" content="ThemeBucket">
    <link rel="shortcut icon" href="#" type="image/png">
    <!--icheck-->
    <link href="${base}js/iCheck/skins/minimal/minimal.css" rel="stylesheet">
    <link href="${base}js/iCheck/skins/square/square.css" rel="stylesheet">
    <link href="${base}js/iCheck/skins/square/red.css" rel="stylesheet">
    <link href="${base}js/iCheck/skins/square/blue.css" rel="stylesheet">

    <!--dashboard calendar-->
    <link href="${base}css/clndr.css" rel="stylesheet">

    <!--Morris Chart CSS -->
    <link rel="stylesheet" href="${base}js/morris-chart/morris.css">

    <!--common-->
    <link href="${base}css/style.css" rel="stylesheet">
    <link href="${base}css/style-responsive.css" rel="stylesheet">

</head>
<body class="sticky-header">
<section>
    <jsp:include page="left.jsp"></jsp:include>
    <!-- main content start-->
    <div class="main-content">
        <jsp:include page="header.jsp"></jsp:include>

        <!--body wrapper start-->
        <div class="wrapper">
            <iframe name="left" id="leftMain" src="../system/defaultPage.htm" frameborder="false" style="border:none;"
            width="100%" height="100%" noresize="auto" scrolling="yes" allowtransparency="true"></iframe>
        </div>
        <!--body wrapper end-->

    </div>
    <!-- main content end-->


</section>
<jsp:include page="footer.jsp"></jsp:include>

</body>


<!-- Placed js at the end of the document so the pages load faster -->
<script src="${base}js/jquery-1.10.2.min.js"></script>
<script src="${base}js/jquery-ui-1.9.2.custom.min.js"></script>
<script src="${base}js/jquery-migrate-1.2.1.min.js"></script>
<script src="${base}js/bootstrap.min.js"></script>
<script src="${base}js/modernizr.min.js"></script>
<script src="${base}js/jquery.nicescroll.js"></script>

<!--common scripts for all pages  左侧菜单-->
<script src="${base}js/scripts.js"></script>


<!--Dashboard Charts-->
<script src="${base}js/dashboard-chart-init.js"></script>
</html>
