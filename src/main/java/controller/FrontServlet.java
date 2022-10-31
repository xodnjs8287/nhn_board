package controller;

import java.io.IOException;
import java.util.ConcurrentModificationException;
import java.util.Objects;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import servlet.*;

@Slf4j
@WebServlet(name="frontServlet", urlPatterns = "*.do"
)
public class FrontServlet extends HttpServlet {
    private static final String REDIRECT_PREFIX = "redirect:";


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {

        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");


//        req.getServletContext().setInitParameter("id","twjang");
//        req.getServletContext().setInitParameter("pwd","8287");
//        req.getServletContext().setInitParameter("adminId","admin");
//        req.getServletContext().setInitParameter("adminPwd","12345");


//
//        req.setAttribute("id","twjang");
//        req.setAttribute("pwd","8287");
//        req.setAttribute("adminId","admin");
//        req.setAttribute("adminPwd","12345");

        try {
            // 실제 처리를 위한 command
            Command command = resolveCommand(req.getServletPath(),req.getMethod());

            // 요청이 잘못됐을 경우 혹은 지원하지 않는 메소드일 경우
            if(Objects.isNull(command)) {
                throw new NullPointerException(" 다시 똑바로 보세요!!");
            }
            // 요청을 처리한 다음 view 를 가져온다.
            String view = command.execute(req, resp);

            // 리다이렉트 처리
            if(view.startsWith(REDIRECT_PREFIX)) {
                resp.sendRedirect(view.substring(REDIRECT_PREFIX.length()));
            } else {
                req.getRequestDispatcher(view).include(req,resp);
            }
        } catch (ConcurrentModificationException e) {
            // exception 내용 저장하고
            log.error("", e);
            req.setAttribute("exception", e.getMessage());

            // error 페이지로 제어권 넘긴다.
            req.getRequestDispatcher("nullerror.jsp").forward(req,resp);
        }
    }

    private Command resolveCommand(String servletPath, String method) {
        Command command = null;

        if(servletPath.equals("/login.do") && method.equals("POST")) {
            command = new LoginServlet("twja", "8287");
        } else if(servletPath.equals("/registry.do") && method.equalsIgnoreCase("POST")) {
            command = new UserRegisterServlet();
        } else if(servletPath.equals("/view.do") && method.equalsIgnoreCase("GET")) {
            command = new UserRegisterView();
        } else if(servletPath.equals("/deleteUser.do") && method.equalsIgnoreCase("POST")) {
            command = new deleteUserServlet();
        } else if(servletPath.equals("/modifyUser.do") && method.equalsIgnoreCase("POST")) {
            command = new UserModifyServlet();
        } else if(servletPath.equals("/write.do") && method.equalsIgnoreCase("POST")) {
            command = new PostBoardServlet();
        } else if(servletPath.equals("/view.do") && method.equalsIgnoreCase("POST")) {
            command = new PostBoardView();
        } else if(servletPath.equals("/deleteBoard.do") && method.equalsIgnoreCase("POST")) {
            command = new DeletePost();
        } else if(servletPath.equals("/modifyPost.do") && method.equalsIgnoreCase("POST")) {
            command = new PostModify();
        }

//        /change-lang?lang=ko.do

        return command;
    }
}
