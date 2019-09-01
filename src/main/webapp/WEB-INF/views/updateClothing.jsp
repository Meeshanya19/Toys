<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Michail
  Date: 8/7/2019
  Time: 7:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form:form modelAttribute="currentClothing"  method="post">
    <form:input path="brand"/>
    <form:input path="description"/>
    <form:input path="name"/>
    <form:input path="price"/>
    <form:input path="age"/>

    <form:select path="country" items="${countries}" itemLabel="name" itemValue="id"/>
    <form:select path="sex" items="<%=toys.entity.Enum.Sex.values()%>"  />
    <form:select path="size" items="<%=toys.entity.Enum.Size.values()%>"/>
    <button>save</button>

</form:form>
</body>
</html>
