package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

public class DBconnect {

    private Connection conn;

    public DBconnect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsv", "root", "");
    }
    
    public void Close() throws SQLException {
        if (this.conn != null) {
            this.conn.close();
        }
    }

    public ResultSet GetData() throws SQLException {
        String sql = "select * from sinhvien";
        PreparedStatement pstmt = this.conn.prepareStatement(sql);
        ResultSet kq = pstmt.executeQuery();
        return kq;
    }

    public ResultSet Search(int ma) throws SQLException {
        String sql = "select * from sinhvien where ma = ?";
        PreparedStatement pstmt = this.conn.prepareStatement(sql);
        pstmt.setInt(1, ma);
        ResultSet kq = pstmt.executeQuery();
        return kq;
    }
    
    public ResultSet SearchTen(String ten) throws SQLException {
        String sql = "select * from sinhvien where ten like ?";
        PreparedStatement pstmt = this.conn.prepareStatement(sql);
        pstmt.setString(1, "%" + ten + "%");
        ResultSet kq = pstmt.executeQuery();
        return kq;
    }

    public void Insert(SinhVien data) throws SQLException {
        String sql = "insert sinhvien values(?, ?, ?, ?)";
        PreparedStatement pstmt = this.conn.prepareStatement(sql);
        pstmt.setInt(1, data.getMa());
        pstmt.setString(2, data.getTen());
        pstmt.setString(3, data.getLop());
        pstmt.setFloat(4, data.getDiemtb());
        pstmt.executeUpdate();
    }

    public void Update(SinhVien data) throws SQLException {
        String sql = "update sinhvien set ten = ?, lop = ?, diemtb = ? where ma = ?";
        PreparedStatement pstmt = this.conn.prepareStatement(sql);
        pstmt.setString(1, data.getTen());
        pstmt.setString(2, data.getLop());
        pstmt.setFloat(3, data.getDiemtb());
        pstmt.setInt(4, data.getMa());
        pstmt.executeUpdate();
    }

    public void Delete(int ma) throws SQLException {
        String sql = "delete from sinhvien where ma = ?";
        PreparedStatement pstmt = this.conn.prepareStatement(sql);
        pstmt.setInt(1, ma);
        pstmt.executeUpdate();
    }
//
//    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        DBconnect cn = new DBconnect();
//        ResultSet rs = null;
//        rs = cn.GetData();
//        while (rs.next()) {
//            System.out.print(rs.getString(1) + "   ");
//            System.out.print(rs.getString(2) + "   ");
//            System.out.print(rs.getString(3) + "   ");
//            System.out.print(rs.getString(4) + "   ");
//            System.out.println("");
//        }
//    }
}
