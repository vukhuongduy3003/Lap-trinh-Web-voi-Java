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

import model.DBconnect;
import model.SinhVien;

@WebServlet(urlPatterns = {"/findsv"})
public class FindStudentServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String ten = req.getParameter("ten");
		ArrayList<SinhVien> stu = new ArrayList<SinhVien>();
		
		try {
			DBconnect cn = new DBconnect();
			ResultSet rs = cn.SearchTen(ten);
			while(rs.next()) {
				SinhVien sv = new SinhVien(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4));
				stu.add(sv);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		req.setAttribute("dssv", stu);
		req.getRequestDispatcher("/findsv.jsp").forward(req, resp);
	}
}
