<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yy
  Date: 2022/4/24
  Time: 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ss练习</title>
</head>
<body>
    <c:forEach items="${list}" var="user">
        ${user.id}--${user.username}--${user.password}--${user.sex}--${user.age}--${user.email}
    </c:forEach>
</body>
</html>
