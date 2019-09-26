<%--
  Created by IntelliJ IDEA.
  User: Michail
  Date: 8/6/2019
  Time: 7:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title></title>
</head>
<body>
<a href="/home">home</a>

<%--<c:forEach var="country" items="${countries}"/>--%>

<table align="center">
    <tr align="center">
        <td>brand</td>
        <td>description</td>
        <td>name</td>
        <td>age</td>
        <td>price</td>
        <td>country</td>
        <td>sex</td>
        <td>size</td>
        <td>delete</td>
        <td>update</td>

    </tr>
    <c:forEach var="clothing" items="${clothin}">
        <tr align="center">
            <td>${clothing.brand}</td>
            <td>${clothing.description}</td>
            <td>${clothing.name}</td>
            <td>${clothing.age}</td>
            <td>${clothing.price}</td>
            <td>${clothing.country.name}</td>
            <td>${clothing.sex}</td>
            <td>${clothing.size}</td>
            <td><a href="/deleteClothing/${clothing.id}">delete</a></td>
            <td><a href="/updateClothing/${clothing.id}">update</a></td>

        </tr>
    </c:forEach>
    <%--<a href="/deleteClothing/${clothing.id}">delete</a>
    <a href="/updateClothing/${clothing.id}">update</a>--%>
</table>


</body>
</html>