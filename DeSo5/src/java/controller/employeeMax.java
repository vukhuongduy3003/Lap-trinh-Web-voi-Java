package controller;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
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

@WebServlet(name = "employeeMax", urlPatterns = {"/employeeMax"})
public class employeeMax extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
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
                    String sql = "SELECT ID, ten, quequan, MAX(Tuoi) FROM employee";
                    ResultSet rs = null;
                    Statement sta = (Statement) conn.createStatement();
                    rs = sta.executeQuery(sql);
                    if (rs != null && rs.next()) {
                        request.setAttribute("list", rs);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(employeeMax.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(employeeMax.class.getName()).log(Level.SEVERE, null, ex);
            }
            RequestDispatcher re = request.getRequestDispatcher("./Views/displayemployee.jsp");
            re.forward(request, response);
        }
    }

}
