<%--
  Created by IntelliJ IDEA.
  User: Michail
  Date: 8/12/2019
  Time: 7:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="/updateUser/${currentUser.id}" method="post">
  <input type="text" name="username" value="${currentUser.name}">
  <br>
  <br>
  <input type="text" name="usermail"  value="${currentUser.email}">
  <br>
  <br>
  <input type="text" name="userpassword"  value="${currentUser.pssword}">
  <br>
  <br>
  <input type="text" name="usershipadres"  value="${currentUser.shippindAddress}">
  <br>
  <br>
  <button>save user</button>
</form>
</body>
</html>
