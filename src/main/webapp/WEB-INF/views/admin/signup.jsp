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

<span style="color: red">${userNameException}</span>
<form:form modelAttribute="user" action="/admin/signup" method="post">
   <form:input path="name"/>
  <form:input path="pssword"/>
  <form:input path="email"/>
  <form:input path="shippindAddress"/>
  <button>save</button>
</form:form>



<ol>
  <c:forEach var="user" items="${users}">
   <li>${user.id} ${user.name} ${user.email} ${user.pssword} ${user.shippindAddress}  <a href="/deleteUser/${user.id}">delete</a>  <a href="/updateUser/${user.id}">update</a>  </li>
  </c:forEach>
</ol>


</body>
</html>
