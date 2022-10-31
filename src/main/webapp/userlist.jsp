<%@ page import="repository.UserRepository" %>
<%@ page import="repository.UserRepositoryImpl" %>
<%@ page import="domain.User" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: jangtaewon
  Date: 2022/10/28
  Time: 9:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> 사용자 목록 </h1>
<%
    UserRepository userRepository = (UserRepositoryImpl) request.getServletContext().getAttribute("userRepository");

    List<User> user = userRepository.getUser();
    for (User user1 : user) {
        out.println();
        out.println("아이디 :  " + user1.getId() + "<br>");
        out.println();
        out.println("이름  :  " + user1.getName() + "<br>");
        out.println();
        out.println(" 프로필 이름 : " + user1.getProfileFileName() + "<br>");
        out.println("<br>");
        out.println("<br>");

    }

%>


</body>
</html>
