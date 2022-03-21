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
    <script type="text/javascript">
        function _change(){
            var img=document.getElementById("verifyCode");
            img.src="${pageContext.request.contextPath}/VerifyCodeServlet?a="+new Date().getTime();
        }
    </script>
</head>
<body>
<span style="color: red; ">${msg}</span>
<form action="${pageContext.request.contextPath}/LoginServlet" method="post">

    用户名：<input type="text" name="username" value="${user.username}"/>${errors.username}<br/>
    密  码：<input type="password" name="password" value="${user.password}"/>${errors.password}<br/>
    验证码：<input type="text" name="verifyCode" value="${user.verifyCode}" size="3"/><br/>
    <img id="verifyCode" src="${pageContext.request.contextPath}/VerifyCodeServlet" style="border: 1px"/>
    <a href="javascript:_change()">刷新</a>${errors.verifyCode}<br/>
    <button type="submit">登录</button>
</form>
</body>
</html>
