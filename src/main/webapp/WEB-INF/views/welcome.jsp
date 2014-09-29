<%--
  Created by IntelliJ IDEA.
  User: Shishkov
  Date: 29.09.2014
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Welcome page</title>
</head>
<body>
    <h1>Welcome dear fucken user!!!</h1>
    <c:out value="${question.getAuthorName()}"/>
</body>
</html>
