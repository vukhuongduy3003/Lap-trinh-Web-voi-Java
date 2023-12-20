package controller;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "welcome", urlPatterns = {"/welcome"})
public class welcome extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession ss = request.getSession();
        String status = ss.getAttribute("status").toString();
        if (status.equals("ThanhCong")) {
            try {
                final String dbName = "qlcongnhan";
                Connection conn = null;
                String path = "jdbc:mysql://localhost:3306/" + dbName;
                String user = "root";
                String pass = "";
                Class.forName("com.mysql.jdbc.Driver");
                try {
                    conn = (Connection) DriverManager.getConnection(path, user, pass);
                    String sql = "Select * from employee";
                    ResultSet rs = null;
                    Statement sta = (Statement) conn.createStatement();
                    rs = sta.executeQuery(sql);
                    if (rs != null && rs.next()) {
                        request.setAttribute("list", rs);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(welcome.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(welcome.class.getName()).log(Level.SEVERE, null, ex);
            }
            RequestDispatcher re = request.getRequestDispatcher("./Views/displayemployee.jsp");
            re.forward(request, response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            final String dbName = "qlcongnhan";
            Connection conn = null;
            String path = "jdbc:mysql://localhost:3306/" + dbName;
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            try {
                conn = (Connection) DriverManager.getConnection(path, user, pass);
                String ten = request.getParameter("ten");
                ResultSet rs = null;
                String sql = "Select * from employee Where Ten LIKE ?";
                PreparedStatement pre = conn.prepareStatement(sql);
                pre.setString(1, "%" + ten + "%");
                rs = pre.executeQuery();
                if (rs != null && rs.next()) {
                    request.setAttribute("list", rs);
                }
            } catch (SQLException ex) {
                Logger.getLogger(welcome.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(welcome.class.getName()).log(Level.SEVERE, null, ex);
        }
        RequestDispatcher re = request.getRequestDispatcher("./Views/displayemployee.jsp");
        re.forward(request, response);
    }
}
