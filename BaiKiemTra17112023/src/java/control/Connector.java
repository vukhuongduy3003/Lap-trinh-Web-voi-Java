/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

/**
 *
 * @author hieu0
 */
import java.sql.*;

public class Connector {

    private final Connection conn;

    public Connector() throws ClassNotFoundException, SQLException {
        //01. Nạp trình điều khiển
        Class.forName("com.mysql.cj.jdbc.Driver");
        //02. Tạo kết nối
        String url = "jdbc:mysql://localhost:3306/qlhoadon";//Đường dẫn vào Data Base
        this.conn = DriverManager.getConnection(url, "root", "");
        //Kiểm tra xem kết nối với MySQL thành công chưa?
        if (conn != null) {
            System.out.println("Kết nối thành công");
        }
    }

    public void insertData(String tbName, String mahdon, String ngaylap, int sokw, int dongia) throws SQLException {
        // Create a PreparedStatement to execute parameterized SQL statements
        try (PreparedStatement preparedStatement = this.conn.prepareStatement(
                "INSERT INTO " + tbName + "(mahdon, ngaylap, sokw, dongia) VALUES (?, ?, ?, ?)")) {
            // Set values for the parameters in the SQL statement
            preparedStatement.setString(1, mahdon);
            preparedStatement.setString(2, ngaylap);
            preparedStatement.setInt(3, sokw);
            preparedStatement.setInt(4, dongia);

            // Execute the SQL statement
            preparedStatement.executeUpdate();
        }
    }

    public ResultSet getData(String tbName) throws SQLException {

        ResultSet rs = null;
        //03. Tạo đối tượng Statement()để thực thi lênh SQL
        Statement ts = this.conn.createStatement();
        String sql = "select * from " + tbName;
        //04. Thực thi lệnh sql, Kết quả trả về được lưu trong rs
        rs = ts.executeQuery(sql);
        return rs;

    }

    public void closeConnection() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("Đã đóng kết nối");
            }
        } catch (SQLException e) {
            System.err.println("Lỗi khi đóng kết nối: " + e.getMessage());
        }
    }

}
