package servlet;

import domain.Post;
import domain.PostImpl;
import domain.User;
import domain.UserImpl;
import lombok.extern.slf4j.Slf4j;
import repository.PostRepository;
import repository.PostRepositoryImpl;
import repository.UserRepository;
import repository.UserRepositoryImpl;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.time.LocalDateTime;
import java.util.List;

@Slf4j
public class PostBoardServlet implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        request.setCharacterEncoding("UTF-8");

        UserRepository userRepository = (UserRepositoryImpl)request.getServletContext().getAttribute("userRepository");

        PostRepository postRepository = (PostRepositoryImpl) request.getServletContext().getAttribute("postRepository");

        String httpSession = request.getSession().getId();
        String id = (String) request.getSession().getAttribute("id");

        Post post1 = new PostImpl();

        Post post = new PostImpl(
                post1.getId(),
                request.getParameter("title"),
               id,
                request.getParameter("content"),
                post1.getWriteTime()
        );




        postRepository.register(post);

        List<Post> posts = postRepository.getPosts();

        for(int i = 0 ; i < posts.size(); i++){

            posts.get(i).setId(i+1);

        }




        request.setAttribute("posts", posts);

        return "writeAction.jsp";
    }
}
