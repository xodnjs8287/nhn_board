<%@ page import="domain.Post" %>
<%@ page import="repository.PostRepository" %>
<%@ page import="repository.PostRepositoryImpl" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: jangtaewon
  Date: 2022/10/27
  Time: 5:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<li><a href="/index.jsp">로그아웃</a></li>
<br>
<br>
<body>

<h1> 게시판 </h1>
<br>

<a href="boardlist.jsp"> 게시판 목록</a>
<br>
<br>
<a href="deleteBoard.jsp"> 게시판 삭제 </a>
<br>
<br>
<a href="postModify.jsp"> 게시판 수정 </a>

<br>
<br>
<a href="write.jsp"> 글쓰기</a>
</body>
</html>
