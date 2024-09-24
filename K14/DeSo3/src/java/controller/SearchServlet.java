package controller;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DBConnect;
import model.SinhVien;

@WebServlet(name = "SearchServlet", urlPatterns = {"/search"})
public class SearchServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        int status = (int) session.getAttribute("status");
        if (status == 0) {
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        } else {
            List<SinhVien> list = new ArrayList<>();
            String ten = request.getParameter("ten");
            try {
                DBConnect connect = new DBConnect();
                ResultSet rs = connect.searchName(ten);
                while (rs.next()) {
                    SinhVien sinhVien = new SinhVien(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4));
                    list.add(sinhVien);
                }
                connect.close();
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(WelcomeServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            request.setAttribute("list", list);
            request.getRequestDispatcher("/search.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    
}
