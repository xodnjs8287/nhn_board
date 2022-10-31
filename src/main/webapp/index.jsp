
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: jangtaewon
  Date: 2022/10/27
  Time: 3:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form method="post" action="/login.do">
      아이디 : <input type="text" name="id"/><br/>
    비밀번호 : <input type="password" name="pwd"/><br/>
    <input type="submit" value="로그인">
</form>

<c:choose>
<c:when test="${not empty loginFail}" > ${loginFail} </c:when>
    </c:choose>
</body>
</html>
