package controller;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Delete", urlPatterns = {"/Delete"})
public class Delete extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String maNV = request.getParameter("MaNV");

        try {
            final String dbName = "qlcongnhan";
            Connection conn = null;
            String path = "jdbc:mysql://localhost:3306/" + dbName;
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            try {
                conn = (Connection) DriverManager.getConnection(path, user, pass);
                String sql = "DELETE FROM employee WHERE ID = " + maNV + "";

                Statement sta = (Statement) conn.createStatement();
                sta.executeUpdate(sql);

            } catch (SQLException ex) {
                Logger.getLogger(employeeMax.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(employeeMax.class.getName()).log(Level.SEVERE, null, ex);
        }
        response.sendRedirect("./welcome");
    }
}
