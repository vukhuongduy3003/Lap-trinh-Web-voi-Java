package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.Out;

import model.DBconnect;
import model.SinhVien;

@WebServlet(urlPatterns = {"/addsv"})
public class AddStudentServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int ma = Integer.parseInt(req.getParameter("ma"));
		String ten = req.getParameter("ten");
		String lop = req.getParameter("lop");
		float diemtb = Float.parseFloat(req.getParameter("diemtb"));
		
                SinhVien data = new SinhVien(ma, ten, lop, diemtb);
                
		boolean check = true;
		try {
			DBconnect cn = new DBconnect();
			ResultSet rs = cn.GetData();
			while(rs.next()) {
				if(ma == rs.getInt(1)) {
					check = false;
					break;
				}
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HttpSession session = req.getSession();
		String tl = "";
		if(check == false) {
			tl = "Mã sinh viên đã tồn tại";
			session.setAttribute("tl", tl);
			resp.sendRedirect("/FullHouse/welcome");
		}
		else {
			tl = "Thêm thành công";
			session.setAttribute("tl", tl);
			try {
				DBconnect cn = new DBconnect();
				cn.Insert(data);
				cn.Close();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			resp.sendRedirect("/FullHouse/welcome");
		}
	}
}
