<%--
  Created by IntelliJ IDEA.
  User: 1216916137
  Date: 2022-04-13
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>主页</title>

</head>
<body>
<%--学生信息表格--%>
<table border="1" text-align="center">
    <tr>
        <td>ID</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>性别</td>
        <td>区域</td>
        <td>操作</td>
    </tr>
    <%--循环输出学生信息--%>
    <c:forEach items="${sessionScope.studentList}" var="student">
        <tr>
            <td>${student.getId()}</td>
            <td>${student.getName()}</td>
            <td>${student.getAge()}</td>
            <td>${student.getGender()}</td>
            <td>${student.getPlace()}</td>
            <td>
                <a href="#">添加</a>
                <a href="${pageContext.request.contextPath}/StudentServlet?method=delete&id=${student.getId()}">删除</a>
                <a href="#">修改</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
