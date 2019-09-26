<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Michail
  Date: 9/1/2019
  Time: 11:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title></title>
</head>
<body>

<a href="/home">home</a>

<table align="center">
  <tr align="center">
    <td>brand</td>
    <td>description</td>
    <td>name</td>
    <td>price</td>
    <td>country</td>
    <td>sex</td>
    <td>delete</td>
    <td>update</td>

  </tr>
  <c:forEach var="mams" items="${allMams}">
    <tr align="center">
      <td>${mams.brand}</td>
      <td>${mams.description}</td>
      <td>${mams.name}</td>
      <td>${mams.price}</td>
      <td>${mams.country.name}</td>
      <td>${mams.sex}</td>
      <td><a href="/deleteMams/${mams.id}">delete</a></td>
      <td><a href="/updateMams/${mams.id}">update</a></td>

    </tr>
  </c:forEach>

</table>

<form:form modelAttribute="newMams" method="post">
  <form:input path="name" placeholder="name"/>
  <form:input path="price" placeholder="price"/>
   <form:input path="description" placeholder="description"/>
  <form:input path="brand" placeholder="brand"/>
  <form:select path="sex" items="<%=toys.entity.Enum.Sex.values()%>"  />
   <form:select path="country" items="${countries}" itemLabel="name" itemValue="id"/>
  <button>save</button>
</form:form>

</body>
</html>
