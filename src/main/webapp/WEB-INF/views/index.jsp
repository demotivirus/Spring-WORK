<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<p><h1>Spring MVC minimal starter project loaded</h1></p>
<spring:form method="post"  modelAttribute="user" action="check-user">

    <p>Name: <spring:input path="name"/> </p>
    <p>Password: <spring:input path="password"/> </p>
    <spring:button>Next Page</spring:button>

</spring:form>
</body>
</html>
