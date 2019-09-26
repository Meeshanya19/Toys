<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Michail
  Date: 9/1/2019
  Time: 1:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <td>age</td>
    <td>price</td>
    <td>country</td>
    <td>sex</td>
    <td>delete</td>
    <td>update</td>

  </tr>
  <c:forEach var="toy" items="${allToys}">
    <tr align="center">
      <td>${toy.brand}</td>
      <td>${toy.description}</td>
      <td>${toy.name}</td>
      <td>${toy.age}</td>
      <td>${toy.price}</td>
      <td>${toy.country.name}</td>
      <td>${toy.sex}</td>
      <td><a href="/deleteToy/${toy.id}">delete</a></td>
      <td><a href="/updateToy/${toy.id}">update</a></td>

    </tr>
  </c:forEach>

</table>

<form:form modelAttribute="newToys" method="post">
  <form:input path="name" placeholder="name"/>
  <form:input path="price" placeholder="price"/>
  <form:input path="description" placeholder="description"/>
  <form:input path="age" placeholder="age"/>
  <form:input path="brand" placeholder="brand"/>
  <form:select path="sex" items="<%=toys.entity.Enum.Sex.values()%>"  />
  <form:select path="country" items="${countries}" itemLabel="name" itemValue="id"/>
  <button>save</button>
</form:form>

</body>
</html>

