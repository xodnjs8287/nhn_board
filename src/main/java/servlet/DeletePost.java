package servlet;

import domain.Post;
import repository.PostRepository;
import repository.PostRepositoryImpl;


import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Objects;

public class DeletePost implements Command{
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        ServletContext servletContext =request.getServletContext();

       PostRepository postRepository = (PostRepositoryImpl)servletContext.getAttribute("postRepository");

       int boardNum = Integer.parseInt(request.getParameter("boardNum"));

       Post post = postRepository.remove(boardNum);



        if(Objects.isNull(boardNum)){
            return "nullBoardError.jsp";
        }else{
           request.setAttribute("post",post);
            return "/deletePost.do";
        }


    }
}
