<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Michail
  Date: 9/1/2019
  Time: 1:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<form:form modelAttribute="toy" method="post">
  <form:input path="name" placeholder="name"/>
  <form:input path="price" placeholder="price"/>
  <form:input path="description" placeholder="description"/>
  <form:input path="age" placeholder="age"/>
  <form:input path="brand" placeholder="brand"/>
  <form:select path="sex" items="<%=toys.entity.Enum.Sex.values()%>"  />
  <form:select path="country" items="${countries}" itemLabel="name" itemValue="id"/>
  <button>update</button>
</form:form>
</body>
</html>
