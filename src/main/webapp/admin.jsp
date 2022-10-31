<%--
  Created by IntelliJ IDEA.
  User: jangtaewon
  Date: 2022/10/27
  Time: 5:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--<%--%>
<%--    int counter = (int) application.getAttribute("counter");--%>

<%--%>--%>

<h1>  관리자 계정 </h1>
<a href="userlist.jsp"> 사용자 목록 </a>
<br>
<br>
<a href="adduser.jsp"> 사용자 추가 </a>

<br>
<br>

<a href="deleteUser.jsp"> 사용자 삭제 </a>
<br>
<br>
<a href="userModify.jsp"> 사용자 정보 수정 </a>

조회수 :  ${counter}

</body>
</html>
