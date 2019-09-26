<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Michail
  Date: 9/22/2019
  Time: 5:30 PM
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
      <td><a href="/deleteClothing/${toy.id}">delete</a></td>
      <td><a href="/updateClothing/${toy.id}">update</a></td>

    </tr>
  </c:forEach>

</table>

</body>
</html>
