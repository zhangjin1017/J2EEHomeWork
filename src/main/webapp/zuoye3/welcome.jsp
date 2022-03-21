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
    <title>welcome</title>
</head>
<body>
<h1>欢迎登录本系统</h1>
<c:choose>
    <c:when test="${empty sessionScope.userSession}">滚</c:when>
    <c:otherwise>
        ${sessionScope.userSession}
    </c:otherwise>
</c:choose>
</body>
</html>
