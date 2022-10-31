package servlet;

import domain.User;
import domain.UserImpl;
import repository.UserRepository;
import repository.UserRepositoryImpl;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Objects;

public class UserModifyServlet implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        ServletContext servletContext = request.getServletContext();

        UserRepository userRepository = (UserRepositoryImpl) servletContext.getAttribute("userRepository");
        User user = (UserImpl) servletContext.getAttribute("user");

        String id = request.getParameter("id");
       String pwd = request.getParameter("pwd");
        List<User> user1 = userRepository.getUser();

        for (User user2 : user1) {
            if(user2.getId().equals(id)){
                user2.setPassword(pwd);
            }
        }

        List<User> user2 = userRepository.getUser();

        if (Objects.isNull(id)) {
            return "nullerror.jsp";
        } else {
            request.setAttribute("user2", user2);
            return "/modifyMember.jsp";
        }
    }
}
