/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeemachineproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author lenovo
 */
public class DB implements Logger {

    private PreparedStatement statement;
    private final Connection conn;

    public DB() throws SQLException {
        this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffee machine", "root", "");
    }

    @Override
    public void log(String TypeBeans, String TypeCoffee, String sizeCoup, int GraderRate, int water_level, int AR_level, int Rp_level) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");//bd libare
        String sql = "INSERT INTO coffee(TypeBeans,TypeCoffee,sizeCoup,GraderRate,water_level,AR_level,Rp_level) VALUES (?, ?, ?,?,?,?,?);";
        this.statement = conn.prepareStatement(sql);
        statement.setString(1, TypeBeans);
        statement.setString(2, TypeCoffee);
        statement.setString(3, sizeCoup);

        statement.setInt(4, GraderRate);
        statement.setInt(5, water_level);
        statement.setInt(6, AR_level);
        statement.setInt(7, Rp_level);

        statement.executeUpdate();
        if (statement != null) {
            statement.close();
        }

    }

    /**
     *
     * @return @throws SQLException
     * @throws ClassNotFoundException
     */
    public int Count() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        String query = "SELECT count(TypeCoffee) AS ANY FROM coffee ;";
        statement = conn.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery(query);
        int count = 0;
        while (resultSet.next()) {
            count = resultSet.getInt("ANY");
        }
        return count;
    }
  


    public int Water() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        String query = "SELECT water_level AS maxx FROM coffee where id =(SELECT MAX(id) from coffee);";
        statement = conn.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery(query);
        int count = 0;
        while (resultSet.next()) {
            count = resultSet.getInt("maxx");
        }
        return count;
    }

    public int BeansArabica() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        String query = "SELECT AR_level AS maxx FROM coffee where id =(SELECT MAX(id) from coffee);";
        statement = conn.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery(query);
        int count = 0;
        while (resultSet.next()) {
            count = resultSet.getInt("maxx");
        }
        return count;
    }
    public int BeansRopusta() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        String query = "SELECT Rp_level AS maxx FROM coffee where id =(SELECT MAX(id) from coffee);";
        statement = conn.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery(query);
        int count = 0;
        while (resultSet.next()) {
            count = resultSet.getInt("maxx");
        }
        return count;
    }


}
