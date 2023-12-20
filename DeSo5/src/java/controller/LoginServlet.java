package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "LoginServlet", urlPatterns = {"/dang-nhap"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
        if (email.equals("admin@gmail.com") && pass.equals("123")) {
            HttpSession ss = request.getSession();
            ss.getCreationTime();
            ss.setAttribute("status", "ThanhCong");
            response.sendRedirect("./welcome");
        } else {
            RequestDispatcher re = request.getRequestDispatcher("./Views/login.jsp");
            re.forward(request, response);
        }
    }
}
