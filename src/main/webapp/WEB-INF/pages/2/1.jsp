<%--
  Created by IntelliJ IDEA.
  User: Владислав
  Date: 27.12.2014
  Time: 3:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
  <meta charset="utf-8" />
    <title>first</title>
</head>
<body>

<c:if test="${!empty userList}">
  <table class="tg">
    <tr>
      <th width="80">Паспорт</th>
      <th width="80">Кадастр</th>
      <th width="80">Мксимальная дата</th>
      <th width="80">Площадь</th>
    </tr>
    <c:forEach items="${userList}" var="user">
      <tr>
        <td>${user.passport}</td>
        <td>${user.kadastr}</td>
        <td>${user.date}</td>
        <td>${user.square}</td>
      </tr>
    </c:forEach>
  </table>
</c:if>

</body>
</html>
