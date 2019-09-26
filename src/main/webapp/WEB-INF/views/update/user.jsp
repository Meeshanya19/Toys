<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Michail
  Date: 9/25/2019
  Time: 6:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<span style="color: red">${userNameException}</span>

<form:form modelAttribute="currentUser" method="post">
    <form:input path="name"/>
    <form:input path="pssword"/>
    <form:input path="email"/>
    <form:input path="shippindAddress"/>
    <button>save</button>
</form:form>

</body>
</html>
