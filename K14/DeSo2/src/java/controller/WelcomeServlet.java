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
import model.Sach;

@WebServlet(name = "WelcomeServlet", urlPatterns = {"/welcome"})
public class WelcomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        int status = (int) session.getAttribute("status");
        if (status == 0) {
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        } else {
            List<Sach> list = new ArrayList<>();
            try {
                DBConnect connect = new DBConnect();
                ResultSet rs = connect.getData();
                while (rs.next()) {
                    Sach sach = new Sach(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
                    list.add(sach);
                }
                connect.close();
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(WelcomeServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            request.setAttribute("list", list);
            request.getRequestDispatcher("/displaybook.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    
}
