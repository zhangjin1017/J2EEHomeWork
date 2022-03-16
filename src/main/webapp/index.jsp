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
<h2>作业1:</h2>
<a href="Zuoye1">显示时间</a><br>
<h2>作业2:</h2>
<form action="${pageContext.request.contextPath}/Zuoye2" method="post">
    行：<input type="text" name="hang"/><br/>
    列：<input type="text" name="lie"/><br/>
    内容：<input type="text" name="neirong"/><br/>
    <input type="submit" value="完成"/>
</form>
</body>
</html>