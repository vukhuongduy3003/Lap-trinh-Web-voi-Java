/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author VKDUY
 */
import java.sql.*;
public class Connector {
    private final Connection conn;
    public Connector() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/QLSP";
        this.conn=DriverManager.getConnection(url,"root","");
        if(conn != null) System.out.println("Kết nối thành công");        
     }   
    public void insertData(String tbName, int id, String name, int soXuatBan, int soTrang) throws SQLException {
        // Create a PreparedStatement to execute parameterized SQL statements
        try (PreparedStatement preparedStatement = this.conn.prepareStatement(
                "INSERT INTO " + tbName + "(id, name, soXuatBan, soTrang) VALUES (?, ?, ?, ?)")) {
            // Set values for the parameters in the SQL statement
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setInt(3, soXuatBan);
            preparedStatement.setInt(4, soTrang);

            // Execute the SQL statement
            preparedStatement.executeUpdate();
        }
    }
    public ResultSet getData(String tbName) throws SQLException{
        ResultSet rs =null;
        Statement ts= this.conn.createStatement();
        String sql="select * from "+ tbName;
        rs=ts.executeQuery(sql);
        return rs;
    }
    
    public ResultSet searchData(String tbName,String columnName, String key) {
        ResultSet rs = null;

        try {
            String sql = "SELECT * FROM " + tbName + " WHERE " + columnName + " LIKE ?";
            PreparedStatement preparedStatement = this.conn.prepareStatement(sql);
            preparedStatement.setString(1, "%" + key + "%");
            rs = preparedStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
}
