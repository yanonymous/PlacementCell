/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placement;

import java.sql.Connection;
import java.sql.DriverManager;

public class myconnection {
    public static Connection getConnection(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/placement","root","yeshasvi2001");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return con;
    }
}
