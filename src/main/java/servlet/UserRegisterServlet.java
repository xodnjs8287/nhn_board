package servlet;

import domain.User;
import domain.UserImpl;
import lombok.extern.slf4j.Slf4j;
import repository.UserRepository;
import repository.UserRepositoryImpl;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Objects;

@Slf4j
public class UserRegisterServlet implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        request.setCharacterEncoding("UTF-8");


        User member = new UserImpl(
                request.getParameter("id"),
                request.getParameter("pwd"),
                request.getParameter("name"),
               null
               // request.getParameter("img")
        );

//        UserRepositoryImpl userRepository = (UserRepositoryImpl) request.getAttribute("userRepository");

        UserRepository userRepository = (UserRepositoryImpl) request.
                getServletContext().getAttribute("userRepository");

        userRepository.
                add(member);
        List<User> user = userRepository.getUser();
        ;request.setAttribute("user", user);
        ;
        ;

        return "userlist.jsp" ;
    }
}
