package model;

import java.sql.*;

public class DBConnect {
    private final Connection connection;

    public DBConnect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlcongnhan", "root", "");
    }
    
    public void close() throws SQLException {
        if (this.connection != null) {
            this.connection.close();
        }
    }
    
    public ResultSet getData() throws SQLException {
        String sql = "select * from employee";
        PreparedStatement statement = this.connection.prepareStatement(sql);
        ResultSet rs = statement.executeQuery();
        return rs;
    }
    
    public ResultSet searchName(String ten) throws SQLException {
        String sql = "select * from employee where ten like ?";
        PreparedStatement statement = this.connection.prepareStatement(sql);
        statement.setString(1, "%" + ten + "%");
        ResultSet rs = statement.executeQuery();
        return rs;
    }
    
    public ResultSet findById(int id) throws SQLException {
        String sql = "select * from employee where id = ?";
        PreparedStatement statement = this.connection.prepareStatement(sql);
        statement.setInt(1, id);
        ResultSet rs = statement.executeQuery();
        return rs;
    }
    
    public void insert(Employee employee) throws SQLException {
        String sql = "insert into employee values (?, ?, ?, ?)";
        PreparedStatement statement = this.connection.prepareStatement(sql);
        statement.setInt(1, employee.getId());
        statement.setString(2, employee.getTen());
        statement.setString(3, employee.getQueQuan());
        statement.setInt(4, employee.getTuoi());
        statement.executeUpdate();
    }
    
    public void update(Employee employee) throws SQLException {
        String sql = "update employee set ten = ?, queQuan = ?, tuoi = ? where id = ?";
        PreparedStatement statement = this.connection.prepareStatement(sql);
        statement.setString(1, employee.getTen());
        statement.setString(2, employee.getQueQuan());
        statement.setInt(3, employee.getTuoi());
        statement.setInt(4, employee.getId());
        statement.executeUpdate();
    }
    
    public void delete(int id) throws SQLException {
        String sql = "delete from employee where id = ?";
        PreparedStatement statement = this.connection.prepareStatement(sql);
        statement.setInt(1, id);
        statement.executeUpdate();
    }
    
}
