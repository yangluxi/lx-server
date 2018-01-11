
<%@ include file="/WEB-INF/jsp/includes/taglibs.jsp" %>
<%@ page import="java.net.InetAddress" %>
<%@ page import="java.net.UnknownHostException" %><%--<%
    String base = request.getContextPath() + "/";
    request.setAttribute("base", base);
%>
<script>
    var base = "${base}";
</script>--%>
<%--<base href="${base}">--%>


<%


    String baseUrl;
    String ip = request.getHeader("x-forwarded-for");
    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
        ip = request.getHeader("Proxy-Client-IP");
    }
    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
        ip = request.getHeader("WL-Proxy-Client-IP");
    }
    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
       /* ip = request.getRemoteAddr();*/
         /*ip = request.getRemoteAddr();*/
        try {
            ip = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }


    String path = request.getContextPath();
    String host = request.getHeader("X-Forwarded-Host");
    StringBuffer basePath = new StringBuffer();
    if ("".equals(host) || host == null) {
        baseUrl = basePath.append(request.getScheme()).append("://").append(ip).append(":").append(request.getServerPort()).append(path).toString();
    } else {
        baseUrl = basePath.append(request.getScheme()).append("://").append(host).append(path).toString();
    }

    session.setAttribute("base", baseUrl + "/");
    session.setAttribute("version", "1.0.1");
%>

<script>
    var base = "${base}";
</script>