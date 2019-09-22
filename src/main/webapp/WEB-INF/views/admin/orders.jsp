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
    <title>Orders</title>
  <style>
    .inputsStyle {
      text-align: left;
      width: 200px;
      border-radius: 5px;
      margin: 10px;
    }

    .customTableWidth {
      width: 100%;
    }
  </style>
</head>
<body>
<div style="text-align:center; margin-top:10%">
  <form action="/saveorder" method="post">

    <select class="inputsStyle" name="userId">
      <c:forEach var="users" items="${users}">
        <option value="${users.id}">${users.name}</option>
      </c:forEach>
    </select>
    <br>
    <input class="inputsStyle" type="text" name="shippingAddress" placeholder="shippingAddress">
    <br>
    <br>
    <input class="inputsStyle" type="text" name="totalAmount" placeholder="totalAmount">
    <br>
    <select class="inputsStyle" name="clothingId">
      <c:forEach var="clothing" items="${clothing}">
        <option value="${clothing.id}">${clothing.brand} ${clothing.description} </option>
      </c:forEach>
    </select>
    <br>
    <button>save order</button>

  </form>


<a href="/home">home</a>
<table class="customTableWidth">
    <thead>
        <tr>
          <td>ID</td>
          <td>User Name</td>
          <td>Amount</td>
          <td>Date</td>
          <td>Delete</td>
          <td>Details</td>
        </tr>
    </thead>
    <tbody>
      <c:forEach var="order" items="${orders}">
        <tr>
          <td>${order.id}</td>
          <td>${order.user.name}</td>
          <td>${order.totalAmount}</td>
          <td>${order.date}</td>
          <td><a href="/deleteOrder/${order.id}">delete</a></td>
          <td><a href="/orderDetails/${order.id}">details</a></td>
        </tr>
      </c:forEach>
    </tbody>
</table>
<%--<ol>--%>
  <%--<c:forEach var="order" items="${orders}">--%>
    <%--<li>Order id ${order.id} User name ${order.user.name} Amount ${order.totalAmount}  Date ${order.date}<br>--%>
      <%--<a href="/deleteOrder/${order.id}">delete</a>--%>
       <%--<a href="/orderDetails/${order.id}">details</a>--%>
    <%--</li>--%>
  <%--</c:forEach>--%>
<%--</ol>--%>
</div>
</body>
</html>
