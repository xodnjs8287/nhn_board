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
수정하실  게시물 번호를 입력하고 수정하세요
<form method="post" action="/modifyPost.do">
        게시물 번호 : <input type="number" name="modifyBoardNum"/><br/>
    <br>
    수정할 게시물 제목  :  <input type="text" name="boardTitle"/><br/>
    <br>
    수정할 게시물 내용  :  <input type="text" name="boardContent"/><br/>
    <input type="submit" value="수정">
</form>


</body>
</html>
