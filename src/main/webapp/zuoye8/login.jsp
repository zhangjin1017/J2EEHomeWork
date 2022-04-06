<%--
  Created by IntelliJ IDEA.
  User: 1216916137
  Date: 2022-01-17
  Time: 14:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/Zuoye8Servlet" method="post">
    用户名：<input type="text" name="ucode" value="${sessionScope.user.ucode}"/><br/>
    密  码：<input type="password" name="password" value="${sessionScope.user.password}"/><br/>
    <button type="submit">登录</button>
</form>
</body>
</html>
