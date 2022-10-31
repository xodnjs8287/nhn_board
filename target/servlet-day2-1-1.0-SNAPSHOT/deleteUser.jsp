<%--
  Created by IntelliJ IDEA.
  User: jangtaewon
  Date: 2022/10/29
  Time: 2:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> 사용자 삭제</h1>
아이디를 입력하고 삭제하세요.
<form method="post" action="/deleteUser.do">
    아이디 : <input type="text" name="id"/><br/>
    <input type="submit" value="삭제">
</form>

</body>
</html>
