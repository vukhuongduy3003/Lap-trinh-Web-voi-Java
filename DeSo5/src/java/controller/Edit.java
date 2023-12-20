package controller;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Edit", urlPatterns = {"/Edit"})
public class Edit extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String maNV = request.getParameter("maNV_edit");
        String tenNV = request.getParameter("ten_edit");
        String quequan = request.getParameter("quequan_edit");
        String tuoi = request.getParameter("tuoi_edit");

        request.setAttribute("ID", maNV);
        request.setAttribute("ten", tenNV);
        request.setAttribute("quequan", quequan);
        request.setAttribute("tuoi", tuoi);
        RequestDispatcher re = request.getRequestDispatcher("./Views/edit.jsp");
        re.forward(request, response);
    }

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
                String sql = "UPDATE employee SET ten=N'" + ten + "', quequan=N'" + quequan + "',Tuoi= " + tuoi + " WHERE ID=N'" + ID + "'";
                Statement sta = (Statement) conn.createStatement();
                sta.executeUpdate(sql);

            } catch (SQLException ex) {
                Logger.getLogger(Edit.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Edit.class.getName()).log(Level.SEVERE, null, ex);
        }
        response.sendRedirect("./welcome");
    }
}
