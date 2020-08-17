/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author arfan
 */
public class dbconnect {
    public Connection con = null;
    public void openConnect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/dbpegawai", "root", "");
            System.out.println("Terhubung");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
