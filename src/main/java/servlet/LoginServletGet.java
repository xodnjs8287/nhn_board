package servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;

public class LoginServletGet implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession(false);
        if (Objects.isNull(session)) {
//            RequestDispatcher rd = req.getRequestDispatcher("/login.html");
//            rd.forward(req, resp);
            return "index.jsp";
        } else {
            response.setContentType("text/html");

            try (PrintWriter out = response.getWriter()) {
//                out.println("login success: id=" + session.getAttribute("id") + "<br />");
//                out.println("<a href='/logout'>logout</a>");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        return "index.jsp";
    }
}