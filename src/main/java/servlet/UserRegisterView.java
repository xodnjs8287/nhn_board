package servlet;

import domain.User;
import domain.UserImpl;
import repository.UserRepository;
import repository.UserRepositoryImpl;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

public class UserRegisterView implements Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        ServletContext servletContext = request.getServletContext();

        UserRepository userRepository = (UserRepository) servletContext.getAttribute("userRepository");
        String id = request.getParameter("id");


        User user = userRepository.getUser(id);
        if(Objects.isNull(user)){
            return "error.jsp";
        }else{
            request.setAttribute("user",user);
            return "userlist.jsp";
        }
    }
}