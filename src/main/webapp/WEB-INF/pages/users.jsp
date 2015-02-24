<%--
  Created by IntelliJ IDEA.
  User: Владислав
  Date: 28.11.2014
  Time: 22:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title></title>
</head>
<body>

<h3>Persons List</h3>
<c:if test="${!empty listUsers}">
  <table class="tg">
    <tr>
      <th width="80">User name</th>
    </tr>
    <c:forEach items="${listUsers}" var="user">
      <tr>
        <td>${user.name}</td>
      </tr>
    </c:forEach>
  </table>
</c:if>

</body>
</html>
