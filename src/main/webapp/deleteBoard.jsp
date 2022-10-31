<%--
  Created by IntelliJ IDEA.
  User: jangtaewon
  Date: 2022/10/31
  Time: 12:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> 게시물 삭제</h1>
게시물 번호를 입력하고 삭제하세요.
<form method="post" action="/deleteBoard.do">
    게시물 번호 : <input type="number" name="boardNum"/><br/>
    <input type="submit" value="삭제">
</form>

</body>
</html>
