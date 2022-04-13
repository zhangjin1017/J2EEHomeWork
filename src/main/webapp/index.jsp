<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a><br>
<h2>作业9:</h2>
<a href="ServletShiYan1/login.jsp">学生信息管理系统</a><br>

<h2>作业8:</h2>
<a href="zuoye8/login.jsp">Go</a><br>

<h2>作业7:</h2>
<a href="hello.jsp">Go</a><br>

<h2>作业6:</h2>
<a href="Zuoye6">Go</a><br>
<h2>作业4_5:</h2>
<a href="Zuoye4_5">Go</a><br>
<h2>作业3:</h2>
<a href="zuoye3/login.jsp">Go</a><br>
<h2>作业2:</h2>
<form action="${pageContext.request.contextPath}/Zuoye2" method="post">
    行：<input type="text" name="hang"/><br/>
    列：<input type="text" name="lie"/><br/>
    内容：<input type="text" name="neirong"/><br/>
    <input type="submit" value="完成"/>
</form>
<h2>作业1:</h2>
<a href="Zuoye1">显示时间</a><br>
</body>
</html>