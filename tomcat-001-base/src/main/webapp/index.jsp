<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<h1>Welcome to the Tomcat Training #1</h1>
<ul>
    <li><a href="${pageContext.request.contextPath}/base?base-param=123">Say Base</a></li>
    <li><a href="${pageContext.request.contextPath}/annotation">Say Annotation</a></li>
    <li><a href="${pageContext.request.contextPath}/dynamic">Say Dynamic</a></li>
</ul>
</body>
</html>