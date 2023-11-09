/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author VKDUY
 */
@WebServlet(urlPatterns = {"/SoLuong"})
public class SoLuong extends HttpServlet {

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
            out.println("<title>Servlet SoLuong</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SoLuong at " + request.getContextPath() + "</h1>");
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
//        processRequest(request, response);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/SoLuongMatHang.jsp");
        requestDispatcher.forward(request, response);
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
//        processRequest(request, response);
        Cookie[] cookies = request.getCookies();
    int soluongHienCo = 0;

    if (cookies != null) {
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("soluong")) {
                try {
                    soluongHienCo = Integer.parseInt(cookie.getValue());
                } catch (NumberFormatException e) {
                    // Xử lý nếu giá trị trong cookie không phải là số nguyên
                }
                break;
            }
        }
    }

    // Lấy giá trị mới từ yêu cầu POST
    String soluongMoi = request.getParameter("soluong");
    int soluongMoiInt = 0;

    try {
        soluongMoiInt = Integer.parseInt(soluongMoi);
    } catch (NumberFormatException e) {
        // Xử lý nếu giá trị mới không phải là số nguyên
    }

    // Cộng giá trị mới với giá trị hiện có
    int tongSoluong = soluongHienCo + soluongMoiInt;

    // Lưu giá trị tổng vào cookie và gửi lại cookie
    Cookie soluongCookie = new Cookie("soluong", Integer.toString(tongSoluong));
    soluongCookie.setMaxAge(60 * 60 * 24); // 1 ngày
    response.addCookie(soluongCookie);

    // Chuyển hướng người dùng đến trang "TongSoLuong.jsp"
    response.sendRedirect("TongSoLuong.jsp");
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
