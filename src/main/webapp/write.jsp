<%--
  Created by IntelliJ IDEA.
  User: jangtaewon
  Date: 2022/10/29
  Time: 5:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <div class="row">
        <form method="post" action="/write.do">
        <table  style="text-align: center" border="2px">
            <thead>
            <tr>
                <th> 게시판 글쓰기 </th>

            </tr>
            </thead>
            <tbody>
            <tr>
                <td><input type ="text" placeholder="제목" name="title"></td>
            </tr>
            <tr>
                <td><input type="text" placeholder="글 내용 " name="content" style="height: 270px;"></td>
            </tr>
            </tbody>

        </table>

            <br>
            <br>
            <input type="submit"  value="글쓰기" >

        </form>
        <br>
        <br>

    </div>


</div>

</body>
</html>
