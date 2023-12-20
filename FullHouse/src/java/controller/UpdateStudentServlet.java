package controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DBconnect;
import model.SinhVien;

@WebServlet(urlPatterns = {"/update"})
public class UpdateStudentServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		int ma = Integer.parseInt(req.getParameter("ma"));
		SinhVien sv = new SinhVien();
		try {
			DBconnect cn = new DBconnect();
			ResultSet rs = cn.Search(ma);
			while(rs.next()) {
				 sv = new SinhVien(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4));
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		req.setAttribute("sv", sv);
		req.getRequestDispatcher("/updatesv.jsp").forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		int ma = Integer.parseInt(req.getParameter("ma"));
		String ten = req.getParameter("ten");
		String lop = req.getParameter("lop");
		float diemtb = Float.parseFloat(req.getParameter("diemtb"));
                SinhVien data = new SinhVien(ma, ten, lop, diemtb);
		try {
			DBconnect cn = new DBconnect();
			cn.Update(data);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		resp.sendRedirect("/FullHouse/welcome");
	}
	
}
