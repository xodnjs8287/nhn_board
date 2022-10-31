package servlet;

import domain.Post;
import domain.User;
import repository.PostRepository;
import repository.PostRepositoryImpl;
import repository.UserRepository;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.Objects;

public class PostBoardView implements Command{
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        ServletContext servletContext = request.getServletContext();

        PostRepository postRepository =
                (PostRepository) servletContext.getAttribute("postRepository");
        String title = request.getParameter("title");

        Post post = postRepository.getPost(title);

        if(Objects.isNull(post)){
            return "nullerror.jsp";
        }else{
            request.setAttribute("post",post);
            return "writeAction.jsp";
        }
    }
}
