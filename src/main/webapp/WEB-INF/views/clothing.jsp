<%--
  Created by IntelliJ IDEA.
  User: Michail
  Date: 8/6/2019
  Time: 7:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title></title>
</head>
<body>
<a href="/home">home</a>
<ol>
  <c:forEach var="country" items="${countries}"/>
    <c:forEach var="clothing" items="${clothin}">
  <li>${clothing.id} ${clothing.brand} ${clothing.description} ${clothing.name} ${clothing.age} ${clothing.price}
   ${clothing.country.name} ${clothing.sex} ${clothing.size}
    <a href="/deleteClothing/${clothing.id}">delete</a>
    <a href="/updateClothing/${clothing.id}">update</a>  </li>
    </c:forEach>
</ol>
<div style="text-align:center; margin-top:10%">
<%--  <form action="/saveclothing" method="post">
    <input type="text" name="brand" placeholder="brand">
    <br>
    <br>
    <input type="text" name="description" placeholder="description">
    <br>
    <br>
    <input type="text" name="name" placeholder="name">
    <br>
    <br>
    <input type="text" name="price" placeholder="price">
    <br>
    <br>
    <input type="text" name="age" placeholder="age">
    <br>

    <select name="sizeValue" >
      <option>size</option>
      <c:forEach var="sz" items="${size}">
        <option value="${sz}">${sz}</option>
      </c:forEach>
            </select >
    <br>
    <br>
    <select name="sexValue" >
      <option>sex</option>
      <c:forEach var="sex" items="${sex}">
        <option value="${sex}">${sex}</option>
      </c:forEach>
    </select >
<br>
    <button>save </button>

  </form>--%>
  <form:form modelAttribute="clothing" method="post">
    <form:input path="brand"/>
    <form:input path="description"/>
    <form:input path="name"/>
    <form:input path="price"/>   
    <form:input path="age"/>
    <form:select path="country" items="${countries}" itemLabel="name" itemValue="id"/>
    <form:select path="sex" items="${sex}"  />
    <form:select path="size" items="${size}"/>
    <button>save</button>
    
  </form:form>
</div>
</body>
</html>