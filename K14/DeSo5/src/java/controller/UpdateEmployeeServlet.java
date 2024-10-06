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

@WebServlet(name = "UpdateEmployeeServlet", urlPatterns = {"/update"})
public class UpdateEmployeeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Employee employee = new Employee();
        try {
            DBConnect connect = new DBConnect();
            ResultSet rs = connect.findById(id);
            while (rs.next()) {
                employee = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UpdateEmployeeServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.setAttribute("employee", employee);
        request.getRequestDispatcher("/updateEmployee.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String ten = request.getParameter("ten");
        String queQuan = request.getParameter("queQuan");
        int tuoi = Integer.parseInt(request.getParameter("tuoi"));
        Employee editEmployee = new Employee(id, ten, queQuan, tuoi);
        try {
            DBConnect connect = new DBConnect();
            connect.update(editEmployee);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UpdateEmployeeServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        response.sendRedirect("/DeSo5/welcome");
    }

}
