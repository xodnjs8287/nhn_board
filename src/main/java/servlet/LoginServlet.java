package servlet;

import domain.User;
import lombok.extern.slf4j.Slf4j;
import repository.UserRepository;
import repository.UserRepositoryImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Objects;

@Slf4j

public class LoginServlet implements Command {

    private String initId;
    private String initPwd;

    public LoginServlet(String initId, String initPwd) {
        this.initId = initId;
        this.initPwd = initPwd;
    }

    public String getInitId() {
        return initId;
    }

    public String getInitPwd() {
        return initPwd;
    }

    @Override
   public String execute (HttpServletRequest req, HttpServletResponse resp) {

        UserRepository userRepository = (UserRepositoryImpl) req.getServletContext().getAttribute("userRepository");



        String id = req.getParameter("id");
        String pwd = req.getParameter("pwd");

        List<User> user = userRepository.getUser();


        if( id != null && pwd != null && initId.equals(id) && initPwd.equals(pwd)){

            HttpSession httpSession = req.getSession();
            httpSession.setAttribute("id",id);


          return "user.jsp";
        }else if(id.equals("admin") && pwd.equals("12345")){

            HttpSession httpSession = req.getSession();
            httpSession.setAttribute("id","admin");

         return "admin.jsp";

        }else if(id.equals(userRepository.getUser(id).getId())&&pwd.equals(userRepository.getUser(id).getPassward())){

            HttpSession httpSession = req.getSession();
            httpSession.setAttribute("id",id);


            return "user.jsp";


        }


        else {

            req.getSession().setAttribute("loginFail", "로그인이 실패하였습니다! ");

            return "/index.jsp";
        }
    }

}
