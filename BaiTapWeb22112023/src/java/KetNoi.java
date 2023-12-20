/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author VKDUY
 */
@WebServlet(urlPatterns = {"/KetNoi"})
public class KetNoi extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet KetNoi</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet KetNoi at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        final String dbName = "ManageStudent";
        Connection conn = null;
        String path = "jdbc:mysql://localhost:3306/" + dbName;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(path, "root", "");
            ResultSet rs = null;
            Statement st = conn.createStatement();
            String query = "select * from student";
            rs = st.executeQuery(query);
            request.setAttribute("list", rs);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(KetNoi.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(KetNoi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        RequestDispatcher r = request.getRequestDispatcher("./display.jsp");
        r.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
