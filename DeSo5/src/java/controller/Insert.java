package controller;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Insert", urlPatterns = {"/Insert"})
public class Insert extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String ID = request.getParameter("ID");
        String ten = request.getParameter("tenNV");
        String quequan = request.getParameter("quequan");
        int tuoi = Integer.parseInt(request.getParameter("tuoi"));

        try {
            final String dbName = "qlcongnhan";
            Connection conn = null;
            String path = "jdbc:mysql://localhost:3306/" + dbName;
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            try {
                conn = (Connection) DriverManager.getConnection(path, user, pass);
                String sql = "INSERT INTO employee VALUES (N'" + ID + "',N'" + ten + "',N'" + quequan + "'," + tuoi + ")";

                Statement sta = (Statement) conn.createStatement();
                sta.executeUpdate(sql);

            } catch (SQLException ex) {
                Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
        }
        response.sendRedirect("./welcome");
    }
}
