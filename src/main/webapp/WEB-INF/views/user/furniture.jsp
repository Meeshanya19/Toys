<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Michail
  Date: 8/27/2019
  Time: 7:39 AM
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
     <c:forEach var="furniture" items="${allFurniture}">

    <li>${furniture.id}  name: ${furniture.name}    price: ${furniture.price} age: ${furniture.age} description: ${furniture.description} brand: ${furniture.brand}
            material: ${furniture.material} ${furniture.sex} ${furniture.country.name}
      <a href="/deleteFurniture/${furniture.id}">delete</a>
      <a href="/updateFurniture/${furniture.id}">update</a>  </li>
  </c:forEach>
</ol>


</body>
</html>
