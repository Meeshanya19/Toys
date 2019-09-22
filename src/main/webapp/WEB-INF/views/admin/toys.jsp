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
<ol>
  <c:forEach var="toy" items="${allToys}">

    <li>${toy.id}  name: ${toy.name}    price: ${toy.price}  description: ${toy.description} brand: ${toy.brand}
      age:${toy.age}   ${toy.sex} ${toy.country.name}
      <a href="/deleteToys/${toy.id}">delete</a>
      <a href="/updateToys/${toy.id}">update</a>  </li>
  </c:forEach>
</ol>

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

