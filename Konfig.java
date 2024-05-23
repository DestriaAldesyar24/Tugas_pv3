/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Acer
 */
public class Konfig {
   
/**
 *
 * @author Acer
 */
    private static Connection MySQLConfig;
    
    public static Connection configDB() throws SQLException {
        try{
            String url = "jdbc:mysql://localhost:3306/data_mahasiswa";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            MySQLConfig = DriverManager.getConnection(url, user, pass);
        }catch(SQLException e){
            System.out.println("koneksi keDatabase gagal" + e.getMessage());
        }
        return MySQLConfig;
    }
    
}

    
