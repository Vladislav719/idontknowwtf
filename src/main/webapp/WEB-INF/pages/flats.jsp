<%--
  Created by IntelliJ IDEA.
  User: Владислав
  Date: 02.12.2014
  Time: 1:38
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
<c:if test="${!empty listFlats}">
  <table class="tg">
    <tr>
      <th width="80">User name</th>
    </tr>
    <c:forEach items="${listFlats}" var="flat">
      <tr>
        <td>${flat.rooms}</td>
      </tr>
    </c:forEach>
  </table>
</c:if>

<c:if test="${!empty test}">
  <h1>  ${test} </h1>
</c:if>

</body>
</html>
