
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kundan Pandey
 */
public class Databaseconnectivity {

    private final static String DATABASE = "TOURISM";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "12345";

    static Connection conn = null;

    public static Connection connectDatabase() {
        if (conn == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/" + DATABASE, USERNAME, PASSWORD);
                System.out.println("connected");
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println(e);
            }
        }

        return conn;
    }

    public static void main(String[] args) {
        connectDatabase();
        try {
            
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from package");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString("price_family"));
            }
            conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

}
