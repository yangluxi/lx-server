<%--
  Created by IntelliJ IDEA.
  User: yangluxi
  Date: 2017/12/27
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/jsp/includes/common.jsp" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
    <meta name="keywords"
          content="admin, dashboard, bootstrap, template, flat, modern, theme, responsive, fluid, retina, backend, html5, css, css3">
    <meta name="description" content="">
    <meta name="author" content="ThemeBucket">
    <link rel="shortcut icon" href="#" type="image/png">

    <title>AdminX</title>

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


    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->
</head>

<body>


<div class="row">
    <div class="col-sm-12">
        <section class="panel">
            <header class="panel-heading">
                Dynamic Table
                <span class="tools pull-right">
                <a href="javascript:;" class="fa fa-chevron-down"></a>
                <a href="javascript:;" class="fa fa-times"></a>
             </span>
            </header>
            <div class="panel-body">
                <div class="adv-table">
                    <table class="display table table-bordered table-striped" id="dynamic-table">
                        <thead>
                        <tr>
                            <th>Rendering engine</th>
                            <th>Browser</th>
                            <th>Platform(s)</th>
                            <th class="hidden-phone">Engine version</th>
                            <th class="hidden-phone">CSS grade</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr class="gradeX">
                            <td>Trident</td>
                            <td>Internet
                                Explorer 4.0
                            </td>
                            <td>Win 95+</td>
                            <td class="center hidden-phone">4</td>
                            <td class="center hidden-phone">X</td>
                        </tr>
                        <tr class="gradeC">
                            <td>Trident</td>
                            <td>Internet
                                Explorer 5.0
                            </td>
                            <td>Win 95+</td>
                            <td class="center hidden-phone">5</td>
                            <td class="center hidden-phone">C</td>
                        </tr>
                        <tr class="gradeA">
                            <td>Trident</td>
                            <td>Internet
                                Explorer 5.5
                            </td>
                            <td>Win 95+</td>
                            <td class="center hidden-phone">5.5</td>
                            <td class="center hidden-phone">A</td>
                        </tr>
                        <tr class="gradeA">
                            <td>Trident</td>
                            <td>Internet
                                Explorer 6
                            </td>
                            <td>Win 98+</td>
                            <td class="center hidden-phone">6</td>
                            <td class="center hidden-phone">A</td>
                        </tr>
                        <tr class="gradeA">
                            <td>Trident</td>
                            <td>Internet Explorer 7</td>
                            <td>Win XP SP2+</td>
                            <td class="center hidden-phone">7</td>
                            <td class="center hidden-phone">A</td>
                        </tr>
                        <tr class="gradeA">
                            <td>Trident</td>
                            <td>AOL browser (AOL desktop)</td>
                            <td>Win XP</td>
                            <td class="center hidden-phone">6</td>
                            <td class="center hidden-phone">A</td>
                        </tr>
                        <tr class="gradeA">
                            <td>Gecko</td>
                            <td>Firefox 1.0</td>
                            <td>Win 98+ / OSX.2+</td>
                            <td class="center hidden-phone">1.7</td>
                            <td class="center hidden-phone">A</td>
                        </tr>
                        <tr class="gradeA">
                            <td>Gecko</td>
                            <td>Firefox 1.5</td>
                            <td>Win 98+ / OSX.2+</td>
                            <td class="center hidden-phone">1.8</td>
                            <td class="center hidden-phone">A</td>
                        </tr>
                        <tr class="gradeA">
                            <td>Gecko</td>
                            <td>Firefox 2.0</td>
                            <td>Win 98+ / OSX.2+</td>
                            <td class="center hidden-phone">1.8</td>
                            <td class="center hidden-phone">A</td>
                        </tr>
                        <tr class="gradeA">
                            <td>Gecko</td>
                            <td>Firefox 3.0</td>
                            <td>Win 2k+ / OSX.3+</td>
                            <td class="center hidden-phone">1.9</td>
                            <td class="center hidden-phone">A</td>
                        </tr>
                        <tr class="gradeA">
                            <td>Gecko</td>
                            <td>Camino 1.0</td>
                            <td>OSX.2+</td>
                            <td class="center hidden-phone">1.8</td>
                            <td class="center hidden-phone">A</td>
                        </tr>
                        <tr class="gradeA">
                            <td>Gecko</td>
                            <td>Camino 1.5</td>
                            <td>OSX.3+</td>
                            <td class="center hidden-phone">1.8</td>
                            <td class="center hidden-phone">A</td>
                        </tr>
                        <tr class="gradeA">
                            <td>Gecko</td>
                            <td>Netscape 7.2</td>
                            <td>Win 95+ / Mac OS 8.6-9.2</td>
                            <td class="center hidden-phone">1.7</td>
                            <td class="center hidden-phone">A</td>
                        </tr>
                        <tr class="gradeA">
                            <td>Gecko</td>
                            <td>Netscape Browser 8</td>
                            <td>Win 98SE+</td>
                            <td class="center hidden-phone">1.7</td>
                            <td class="center hidden-phone">A</td>
                        </tr>
                        <tr class="gradeA">
                            <td>Gecko</td>
                            <td>Netscape Navigator 9</td>
                            <td>Win 98+ / OSX.2+</td>
                            <td class="center hidden-phone">1.8</td>
                            <td class="center hidden-phone">A</td>
                        </tr>
                        <tr class="gradeA">
                            <td>Gecko</td>
                            <td>Mozilla 1.0</td>
                            <td>Win 95+ / OSX.1+</td>
                            <td class="center hidden-phone">1</td>
                            <td class="center hidden-phone">A</td>
                        </tr>
                        <tr class="gradeA">
                            <td>Gecko</td>
                            <td>Mozilla 1.1</td>
                            <td>Win 95+ / OSX.1+</td>
                            <td class="center hidden-phone">1.1</td>
                            <td class="center hidden-phone">A</td>
                        </tr>
                        <tr class="gradeA">
                            <td>Gecko</td>
                            <td>Mozilla 1.2</td>
                            <td>Win 95+ / OSX.1+</td>
                            <td class="center hidden-phone">1.2</td>
                            <td class="center hidden-phone">A</td>
                        </tr>
                        <tr class="gradeA">
                            <td>Gecko</td>
                            <td>Mozilla 1.3</td>
                            <td>Win 95+ / OSX.1+</td>
                            <td class="center hidden-phone">1.3</td>
                            <td class="center hidden-phone">A</td>
                        </tr>
                        <tr class="gradeA">
                            <td>Gecko</td>
                            <td>Mozilla 1.4</td>
                            <td>Win 95+ / OSX.1+</td>
                            <td class="center hidden-phone">1.4</td>
                            <td class="center hidden-phone">A</td>
                        </tr>
                        <tr class="gradeA">
                            <td>Gecko</td>
                            <td>Mozilla 1.5</td>
                            <td>Win 95+ / OSX.1+</td>
                            <td class="center hidden-phone">1.5</td>
                            <td class="center hidden-phone">A</td>
                        </tr>
                        <tr class="gradeA">
                            <td>Gecko</td>
                            <td>Mozilla 1.6</td>
                            <td>Win 95+ / OSX.1+</td>
                            <td class="center hidden-phone">1.6</td>
                            <td class="center hidden-phone">A</td>
                        </tr>
                        <tr class="gradeA">
                            <td>Gecko</td>
                            <td>Mozilla 1.7</td>
                            <td>Win 98+ / OSX.1+</td>
                            <td class="center hidden-phone">1.7</td>
                            <td class="center hidden-phone">A</td>
                        </tr>
                        <tr class="gradeA">
                            <td>Gecko</td>
                            <td>Mozilla 1.8</td>
                            <td>Win 98+ / OSX.1+</td>
                            <td class="center hidden-phone">1.8</td>
                            <td class="center hidden-phone">A</td>
                        </tr>
                        <tr class="gradeA">
                            <td>Gecko</td>
                            <td>Seamonkey 1.1</td>
                            <td>Win 98+ / OSX.2+</td>
                            <td class="center hidden-phone">1.8</td>
                            <td class="center hidden-phone">A</td>
                        </tr>
                        <tr class="gradeA">
                            <td>Gecko</td>
                            <td>Epiphany 2.20</td>
                            <td>Gnome</td>
                            <td class="center hidden-phone">1.8</td>
                            <td class="center hidden-phone">A</td>
                        </tr>
                        <tr class="gradeA">
                            <td>Webkit</td>
                            <td>Safari 1.2</td>
                            <td>OSX.3</td>
                            <td class="center hidden-phone">125.5</td>
                            <td class="center hidden-phone">A</td>
                        </tr>
                        <tr class="gradeA">
                            <td>Webkit</td>
                            <td>Safari 1.3</td>
                            <td>OSX.3</td>
                            <td class="center hidden-phone">312.8</td>
                            <td class="center hidden-phone">A</td>
                        </tr>
                        <tr class="gradeA">
                            <td>Webkit</td>
                            <td>Safari 2.0</td>
                            <td>OSX.4+</td>
                            <td class="center hidden-phone">419.3</td>
                            <td class="center hidden-phone">A</td>
                        </tr>
                        <tr class="gradeA">
                            <td>Webkit</td>
                            <td>Safari 3.0</td>
                            <td>OSX.4+</td>
                            <td class="center hidden-phone">522.1</td>
                            <td class="center hidden-phone">A</td>
                        </tr>
                        <tr class="gradeA">
                            <td>Webkit</td>
                            <td>OmniWeb 5.5</td>
                            <td>OSX.4+</td>
                            <td class="center hidden-phone">420</td>
                            <td class="center hidden-phone">A</td>
                        </tr>
                        <tr class="gradeA">
                            <td>Webkit</td>
                            <td>iPod Touch / iPhone</td>
                            <td>iPod</td>
                            <td class="center hidden-phone">420.1</td>
                            <td class="center hidden-phone">A</td>
                        </tr>
                        <tr class="gradeA">
                            <td>Webkit</td>
                            <td>S60</td>
                            <td>S60</td>
                            <td class="center hidden-phone">413</td>
                            <td class="center hidden-phone">A</td>
                        </tr>
                        <tr class="gradeA">
                            <td>Presto</td>
                            <td>Opera 7.0</td>
                            <td>Win 95+ / OSX.1+</td>
                            <td class="center hidden-phone">-</td>
                            <td class="center hidden-phone">A</td>
                        </tr>
                        <tr class="gradeA">
                            <td>Presto</td>
                            <td>Opera 7.5</td>
                            <td>Win 95+ / OSX.2+</td>
                            <td class="center hidden-phone">-</td>
                            <td class="center hidden-phone">A</td>
                        </tr>
                        <tr class="gradeA">
                            <td>Presto</td>
                            <td>Opera 8.0</td>
                            <td>Win 95+ / OSX.2+</td>
                            <td class="center hidden-phone">-</td>
                            <td class="center hidden-phone">A</td>
                        </tr>
                        <tr class="gradeA">
                            <td>Presto</td>
                            <td>Opera 8.5</td>
                            <td>Win 95+ / OSX.2+</td>
                            <td class="center hidden-phone">-</td>
                            <td class="center hidden-phone">A</td>
                        </tr>
                        <tr class="gradeA">
                            <td>Presto</td>
                            <td>Opera 9.0</td>
                            <td>Win 95+ / OSX.3+</td>
                            <td class="center hidden-phone">-</td>
                            <td class="center hidden-phone">A</td>
                        </tr>
                        <tr class="gradeA">
                            <td>Presto</td>
                            <td>Opera 9.2</td>
                            <td>Win 88+ / OSX.3+</td>
                            <td class="center hidden-phone">-</td>
                            <td class="center hidden-phone">A</td>
                        </tr>
                        <tr class="gradeA">
                            <td>Presto</td>
                            <td>Opera 9.5</td>
                            <td>Win 88+ / OSX.3+</td>
                            <td class="center hidden-phone">-</td>
                            <td class="center hidden-phone">A</td>
                        </tr>
                        <tr class="gradeA">
                            <td>Presto</td>
                            <td>Opera for Wii</td>
                            <td>Wii</td>
                            <td class="center hidden-phone">-</td>
                            <td class="center hidden-phone">A</td>
                        </tr>
                        <tr class="gradeA">
                            <td>Presto</td>
                            <td>Nokia N800</td>
                            <td>N800</td>
                            <td class="center hidden-phone">-</td>
                            <td class="center hidden-phone">A</td>
                        </tr>
                        <tr class="gradeA">
                            <td>Presto</td>
                            <td>Nintendo DS browser</td>
                            <td>Nintendo DS</td>
                            <td class="center hidden-phone">8.5</td>
                            <td class="center hidden-phone">C/A<sup>1</sup></td>
                        </tr>
                        <tr class="gradeC">
                            <td>KHTML</td>
                            <td>Konqureror 3.1</td>
                            <td>KDE 3.1</td>
                            <td class="center hidden-phone">3.1</td>
                            <td class="center hidden-phone">C</td>
                        </tr>
                        <tr class="gradeA">
                            <td>KHTML</td>
                            <td>Konqureror 3.3</td>
                            <td>KDE 3.3</td>
                            <td class="center hidden-phone">3.3</td>
                            <td class="center hidden-phone">A</td>
                        </tr>
                        <tr class="gradeA">
                            <td>KHTML</td>
                            <td>Konqureror 3.5</td>
                            <td>KDE 3.5</td>
                            <td class="center hidden-phone">3.5</td>
                            <td class="center hidden-phone">A</td>
                        </tr>
                        <tr class="gradeX">
                            <td>Tasman</td>
                            <td>Internet Explorer 4.5</td>
                            <td>Mac OS 8-9</td>
                            <td class="center hidden-phone">-</td>
                            <td class="center hidden-phone">X</td>
                        </tr>
                        <tr class="gradeC">
                            <td>Tasman</td>
                            <td>Internet Explorer 5.1</td>
                            <td>Mac OS 7.6-9</td>
                            <td class="center hidden-phone">1</td>
                            <td class="center hidden-phone">C</td>
                        </tr>
                        <tr class="gradeC">
                            <td>Tasman</td>
                            <td>Internet Explorer 5.2</td>
                            <td>Mac OS 8-X</td>
                            <td class="center hidden-phone">1</td>
                            <td class="center hidden-phone">C</td>
                        </tr>
                        <tr class="gradeA">
                            <td>Misc</td>
                            <td>NetFront 3.1</td>
                            <td>Embedded devices</td>
                            <td class="center hidden-phone">-</td>
                            <td class="center hidden-phone">C</td>
                        </tr>
                        <tr class="gradeA">
                            <td>Misc</td>
                            <td>NetFront 3.4</td>
                            <td>Embedded devices</td>
                            <td class="center hidden-phone">-</td>
                            <td class="center hidden-phone">A</td>
                        </tr>
                        <tr class="gradeX">
                            <td>Misc</td>
                            <td>Dillo 0.8</td>
                            <td>Embedded devices</td>
                            <td class="center hidden-phone">-</td>
                            <td class="center hidden-phone">X</td>
                        </tr>
                        <tr class="gradeX">
                            <td>Misc</td>
                            <td>Links</td>
                            <td>Text only</td>
                            <td class="center hidden-phone">-</td>
                            <td class="center hidden-phone">X</td>
                        </tr>
                        <tr class="gradeX">
                            <td>Misc</td>
                            <td>Lynx</td>
                            <td>Text only</td>
                            <td class="center hidden-phone">-</td>
                            <td class="center hidden-phone">X</td>
                        </tr>
                        <tr class="gradeC">
                            <td>Misc</td>
                            <td>IE Mobile</td>
                            <td>Windows Mobile 6</td>
                            <td class="center hidden-phone">-</td>
                            <td class="center hidden-phone">C</td>
                        </tr>
                        <tr class="gradeC">
                            <td>Misc</td>
                            <td>PSP browser</td>
                            <td>PSP</td>
                            <td class="center hidden-phone">-</td>
                            <td class="center hidden-phone">C</td>
                        </tr>
                        <tr class="gradeU">
                            <td>Other browsers</td>
                            <td>All others</td>
                            <td>-</td>
                            <td class="center hidden-phone">-</td>
                            <td class="center hidden-phone">U</td>
                        </tr>
                        </tbody>
                        <tfoot>
                        <tr>
                            <th>Rendering engine</th>
                            <th>Browser</th>
                            <th>Platform(s)</th>
                            <th class="hidden-phone">Engine version</th>
                            <th class="hidden-phone">CSS grade</th>
                        </tr>
                        </tfoot>
                    </table>
                </div>
            </div>
        </section>
    </div>
</div>

<!-- main content end-->
</section>

<!-- Placed js at the end of the document so the pages load faster -->
<script src="${base}js/jquery-1.10.2.min.js"></script>
<script src="${base}js/jquery-ui-1.9.2.custom.min.js"></script>
<script src="${base}js/jquery-migrate-1.2.1.min.js"></script>
<script src="${base}js/bootstrap.min.js"></script>
<script src="${base}js/modernizr.min.js"></script>
<script src="${base}js/jquery.nicescroll.js"></script>

<!--common scripts for all pages  左侧菜单-->
<script src="${base}js/scripts.js"></script>

<!--easy pie chart-->
<script src="${base}js/easypiechart/jquery.easypiechart.js"></script>
<script src="${base}js/easypiechart/easypiechart-init.js"></script>

<!--Sparkline Chart-->
<script src="${base}js/sparkline/jquery.sparkline.js"></script>
<script src="${base}js/sparkline/sparkline-init.js"></script>

<!--icheck -->
<script src="${base}js/iCheck/jquery.icheck.js"></script>
<script src="${base}js/icheck-init.js"></script>

<!-- jQuery Flot Chart-->
<script src="${base}js/flot-chart/jquery.flot.js"></script>
<script src="${base}js/flot-chart/jquery.flot.tooltip.js"></script>
<script src="${base}js/flot-chart/jquery.flot.resize.js"></script>


<!--Morris Chart-->
<script src="js/morris-chart/morris.js"></script>
<script src="js/morris-chart/raphael-min.js"></script>

<!--Calendar-->
<script src="js/calendar/clndr.js"></script>
<script src="js/calendar/evnt.calendar.init.js"></script>
<script src="js/calendar/moment-2.2.1.js"></script>
<script src="http://cdnjs.cloudflare.com/ajax/libs/underscore.js/1.5.2/underscore-min.js"></script>


<!--Dashboard Charts-->
<script src="${base}js/dashboard-chart-init.js"></script>
</body>
</html>
