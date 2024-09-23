package model;

import java.sql.*;

public class DBConnect {
    private final Connection connection;

    public DBConnect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsach", "root", "");
    }
    
    public void close() throws SQLException {
        if (this.connection != null) {
            this.connection.close();
        }
    }
    
    public ResultSet getData() throws SQLException {
        String sql = "select * from sach";
        PreparedStatement statement = this.connection.prepareStatement(sql);
        ResultSet rs = statement.executeQuery();
        return rs;
    }
    
    public ResultSet searchName(String ten) throws SQLException {
        String sql = "select * from sach where tenSach like ?";
        PreparedStatement statement = this.connection.prepareStatement(sql);
        statement.setString(1, "%" + ten + "%");
        ResultSet rs = statement.executeQuery();
        return rs;
    }
    
}
