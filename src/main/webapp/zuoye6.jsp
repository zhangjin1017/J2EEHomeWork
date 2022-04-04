<%--
  Created by IntelliJ IDEA.
  User: 1216916137
  Date: 2022-04-04
  Time: 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>作业6</title>
</head>
<body>
<h2>江苏省13地级市</h2>
<ol>
    <c:forTokens items="${sessionScope.cities}" delims=";" var="city" varStatus="st">
        <li
                <c:if test="${st.count%2==0}">style="background-color:red"</c:if>
                <c:if test="${st.count%2==1}">style="background-color:green"</c:if>
        >
                ${city}
        </li>
    </c:forTokens>
</ol>
</body>
</html>
