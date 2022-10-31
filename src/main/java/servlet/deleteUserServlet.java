package servlet;

import domain.User;
import repository.UserRepository;
import repository.UserRepositoryImpl;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Objects;

public class deleteUserServlet implements Command{
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        ServletContext servletContext = request.getServletContext();

        UserRepository userRepository = (UserRepositoryImpl)servletContext.getAttribute("userRepository");
        String id = request.getParameter("id");

        User user = userRepository.remove(id);

        if(Objects.isNull(id)){
            return "nullerror.jsp";
        }else{
            request.setAttribute("user",user);
            return "/deleteUser.do";
        }
    }
}
