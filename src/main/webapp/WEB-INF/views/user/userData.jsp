<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Michail
  Date: 9/22/2019
  Time: 2:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

 <table border="1" >
   <tr align="center" ><th>user name</th><th>user password</th><th>user email</th> <th>user shipping addres</th></tr>
   <tr><td>${user.name}</td><td>${user.pssword}</td><td>${user.email}</td><td>${user.shippindAddress}</td></tr>
 </table>
 <button>ok</button>




</ol>
</body>
</html>
