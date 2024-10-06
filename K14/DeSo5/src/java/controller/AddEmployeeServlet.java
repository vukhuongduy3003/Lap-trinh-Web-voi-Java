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

@WebServlet(name = "AddEmployeeServlet", urlPatterns = {"/add"})
public class AddEmployeeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String ten = request.getParameter("ten");
        String queQuan = request.getParameter("queQuan");
        int tuoi = Integer.parseInt(request.getParameter("tuoi"));
        Employee newEmployee = new Employee(id, ten, queQuan, tuoi);
        boolean check = true;
        try {
            DBConnect connect = new DBConnect();
            ResultSet rs = connect.getData();
            while (rs.next()) {                
                if (id == rs.getInt(1)) {
                    check = false;
                    break;
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
        }
        HttpSession session = request.getSession();
        if (check == false) {
            session.setAttribute("res", "Mã nhân viên đã tồn tại");
        } else {
            try {
                DBConnect connect = new DBConnect();
                connect.insert(newEmployee);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(AddEmployeeServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            session.setAttribute("res", "Thêm thành công");
        }
        response.sendRedirect("/DeSo5/welcome");
    }

}
