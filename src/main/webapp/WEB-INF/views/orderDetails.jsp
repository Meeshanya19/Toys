<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Michail
  Date: 8/15/2019
  Time: 6:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
Order id ${order.id} User name ${order.user.name} Amount ${order.totalAmount}  Date ${order.date}


<ol>

  <li>

  </li>

</ol>
<table style="width:100%">
  <tr>
    <th>Type</th>
    <th>Name</th>
    <th>Brand</th>
  </tr>
  <tr>
    <td>Jill</td>
    <td>Smith</td>
    <td>50</td>
  </tr>
  <tr>
    <td>Eve</td>
    <td>Jackson</td>
    <td>94</td>
  </tr>
</table>
</body>
</html>
