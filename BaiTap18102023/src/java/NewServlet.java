/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author VKDUY
 */
public class NewServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NewServlet at " + request.getContextPath() + "</h1>");
            out.println("<h1>Web " + request.getContextPath() + "</h1>");
            if (request.isSecure() == true) {
                out.print("Bạn đang duyệt web an toàn");

            } else {
                out.print("Bạn đang duyệt web không an toàn");
            }
            String serverName = request.getServerName();
            response.getWriter().println("Server name: " + serverName + "<br>");
            String serverIP = request.getLocalAddr();
            response.getWriter().println("Server IP Address: " + serverIP);
            int number1 = 120;
            int number2 = 5;
            double x = -number1 / number2;
            // Tính toán tổng, hiệu, tích và thương
            int sum = number1 + number2;
            int difference = number1 - number2;
            int product = number1 * number2;
            int quotient = number1 / number2;

            // In kết quả ra trình duyệt
            response.setContentType("text/html");
            response.getWriter().println("Số 1: " + number1 + "<br>");
            response.getWriter().println("Số 2: " + number2 + "<br>");
            response.getWriter().println("Tổng: " + sum + "<br>");
            response.getWriter().println("Hiệu: " + difference + "<br>");
            response.getWriter().println("Tích: " + product + "<br>");
            response.getWriter().println("Thương: " + quotient);

            response.setContentType("text/html");
            response.getWriter().println("<br>Phương trình: " + number2 + "x + " + number1 + " = 0<br>");

            response.getWriter().println("Nghiệm của phương trình: x = " + x);
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
