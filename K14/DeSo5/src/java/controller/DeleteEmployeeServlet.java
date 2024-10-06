package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DBConnect;
import model.Employee;

@WebServlet(name = "DeleteEmployeeServlet", urlPatterns = {"/delete"})
public class DeleteEmployeeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        try {
            DBConnect connect = new DBConnect();
            connect.delete(id);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DeleteEmployeeServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        response.sendRedirect("/DeSo5/welcome");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}
