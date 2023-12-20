package controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.DBconnect;
import model.SinhVien;

@WebServlet(urlPatterns = {"/welcome"})
public class WelcomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        int tt = (Integer) session.getAttribute("tt");
        ArrayList<SinhVien> list = new ArrayList<SinhVien>();
        try {
            DBconnect my = new DBconnect();
            ResultSet rs = my.GetData();
            while (rs.next()) {
                SinhVien sv = new SinhVien(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4));
                list.add(sv);
            }
            my.Close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (tt == 1) {
            req.setAttribute("list", list);
            req.getRequestDispatcher("/display.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
        }
    }

}
