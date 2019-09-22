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
<ol>
  <c:forEach var="toy" items="${allToys}">

    <li>${toy.id}  name: ${toy.name}    price: ${toy.price}  description: ${toy.description} brand: ${toy.brand}
      age:${toy.age}   ${toy.sex} ${toy.country.name}
      <a href="/deleteToys/${toy.id}">delete</a>
      <a href="/updateToys/${toy.id}">update</a>  </li>
  </c:forEach>
</ol>

</body>
</html>
