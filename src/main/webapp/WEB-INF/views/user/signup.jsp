<%--
  Created by IntelliJ IDEA.
  User: Michail
  Date: 7/30/2019
  Time: 6:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>

</head>
<body>
<a href="/home">home</a>

<form:form modelAttribute="user" action="/user/signup" method="post">
   <form:input path="name" placeholder="name"/>
  <form:input path="pssword"  placeholder="password"/>
  <form:input path="email"  placeholder="email"/>
  <form:input path="shippindAddress"  placeholder="shippingAddres"/>
  <button>save</button>
</form:form>
<span style="color: red">${userNameException}</span>




</body>
</html>
