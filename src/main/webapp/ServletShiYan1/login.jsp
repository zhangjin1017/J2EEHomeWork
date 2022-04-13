<%--
  Created by IntelliJ IDEA.
  User: 1216916137
  Date: 2022-04-13
  Time: 10:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<%--登录--%>
<form action="${pageContext.request.contextPath}/AdminServlet" method="post">
    <table>
        <tr><td>用户名：</td><td><input type="text" name="name"/></td></tr>
        <tr><td>密码：</td><td><input type="password" name="password"/></td></tr>
        <tr><td><input type="submit" value="登录"/></td><td><input type="reset" value="重置"/></td>
        </tr>
    </table>
</body>
</html>
