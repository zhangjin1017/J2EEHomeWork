<%--
  Created by IntelliJ IDEA.
  User: 1216916137
  Date: 2022-03-30
  Time: 13:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>作业4_5</title>
</head>
<body>
<%int i=0;%>
<h2>中国各大海洋大学</h2>
<ol>
    <c:forTokens items="${sessionScope.schools}" delims="," var="school">
        <li
            <c:if test="${school.equals('中国海洋大学')}">style="color:red"</c:if>
        >
                ${school}
        </li>
    </c:forTokens>
</ol>
<table border="1">
    <tr>
        <th>序号</th>
        <th>分数</th>
        <th>等第</th>
    </tr>
    <tr>
    <c:forEach items="${sessionScope.scoreList}" var="score" varStatus="st">
    <tr
        <c:if test="${st.count%2==0}">style="background-color:grey"</c:if>
        <c:if test="${st.count%2==1}">style="background-color:darkseagreen"</c:if>
    >
        <td><c:out value="${st.index}"/></td>
        <td><c:out value="${score}"/></td>
        <c:choose>
            <c:when test="${score>=90}"><td>优秀</td></c:when>
            <c:when test="${score>=80}"><td>良好</td></c:when>
            <c:when test="${score>=60}"><td>及格</td></c:when>
            <c:otherwise><td>不及格</td></c:otherwise>
        </c:choose>
    </tr>
    </c:forEach>


</table>

</body>
</html>
