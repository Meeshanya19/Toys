<%--
  Created by IntelliJ IDEA.
  User: Michail
  Date: 8/6/2019
  Time: 6:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title></title>
</head>
<body>
<a href="/home">home</a>
<ol>
  <c:forEach var="order" items="${orders}">
    <li>Order id ${order.id} User name ${order.user.name} Amount ${order.totalAmount}  Date ${order.date}<br>
      <a href="/deleteOrder/${order.id}">delete</a>
       <a href="/orderDetails/${order.id}">details</a>
    </li>
  </c:forEach>
</ol>
<div style="text-align:center; margin-top:10%">
  <form action="/saveorder" method="post">

    <select name="userId">
<c:forEach var="users" items="${users}">
  <option value="${users.id}">${users.name}</option>
  </c:forEach>
    </select>
    <br>
    <input type="text" name="shippingAddress" placeholder="shippingAddress">
    <br>
    <br>
    <input type="text" name="totalAmount" placeholder="totalAmount">
    <br>
         <select name="clothingId">
        <c:forEach var="clothing" items="${clothing}">
          <option value="${clothing.id}">${clothing.brand} ${clothing.description} </option>
        </c:forEach>
      </select>


    <button>save order</button>

  </form>
</div>
</body>
</html>
