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

public class PostModify implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        ServletContext servletContext = request.getServletContext();

        PostRepository postRepository = (PostRepositoryImpl) servletContext.getAttribute("postRepository");

        int modifyBoardNum = Integer.parseInt(request.getParameter("modifyBoardNum"));
        String boardTitle = request.getParameter("boardTitle");

        String boardContent = request.getParameter("boardContent");

        List<Post> posts = postRepository.getPosts();

        for (Post post : posts) {
            if(post.getId()==modifyBoardNum){
                post.setTitle(boardTitle);
                post.setContent(boardContent);
            }
        }

        List<Post> posts1 = postRepository.getPosts();

        if (Objects.isNull(modifyBoardNum)) {
            return "nullerror.jsp";
        } else {
            request.setAttribute("posts1", posts1);
            return "/completeModifyBoard.jsp";
        }



    }
}
