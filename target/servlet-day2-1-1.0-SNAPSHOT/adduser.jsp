<%--
  Created by IntelliJ IDEA.
  User: jangtaewon
  Date: 2022/10/28
  Time: 9:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> 사용자 추가</h1>

<form method="post" action="/registry.do">
    아이디 : <input type="text" name="id"/><br/>
    비밀번호 : <input type="password" name="pwd"/><br/>
    이름 : <input type="text" name="name"/><br/>
    프로필 이미지 : <input type="file" name="img"/><br/>
    <input type="submit" value="추가">
</form>

</body>
</html>
