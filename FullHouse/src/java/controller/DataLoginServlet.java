package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/login"})
public class DataLoginServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		int tt = 0;
		if(email.equals("admin@gmail.com") == true && password.equals("123") == true) {
			tt = 1;
		}
		HttpSession session = req.getSession();
		session.setAttribute("tt", tt);
		resp.sendRedirect("/FullHouse/welcome");
	}
}
