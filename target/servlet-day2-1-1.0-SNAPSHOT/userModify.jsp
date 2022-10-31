<%--
  Created by IntelliJ IDEA.
  User: jangtaewon
  Date: 2022/10/29
  Time: 3:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
수정하실  아이디를 입력하고 비밀번호를 변경하세요
<form method="post" action="/modifyUser.do">
    아이디 : <input type="text" name="id"/><br/>
    <br>
    사용 할 비밀번호 입력  :  <input type="password" name="pwd"/><br/>
    <input type="submit" value="수정">
</form>


</body>
</html>
