<%@ page import="repository.PostRepository" %>
<%@ page import="repository.PostRepositoryImpl" %>
<%@ page import="domain.Post" %>
<%@ page import="java.util.List" %>
<%@ page import="domain.PostImpl" %><%--
  Created by IntelliJ IDEA.
  User: jangtaewon
  Date: 2022/10/29
  Time: 9:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    PostRepository postRepository = (PostRepositoryImpl) request.getServletContext().getAttribute("postRepository");

    List<Post> posts = postRepository.getPosts();

%>



<%
    for(int i = 0 ; i < posts.size() ; i++){
        out.println("<br>");
        out.println("게시물 아이디 : " + posts.get(i).getId()+ "<br>");
        out.println("게시물 제목 : " + posts.get(i).getTitle() + "<br>");
        out.println("유저 아이디 : " + posts.get(i).getWriterUserId() + "<br>");
        out.println("게시물 내용 : " + posts.get(i).getContent() + " <br> ");
        out.println(" 작성 시간 : " + posts.get(i).getWriteTime() + "<br> ") ;
        out.println("<br>");

    }

%>
조회수 :  ${counter}
<br>
</body>
</html>
