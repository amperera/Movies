/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MovieDL;

import java.sql.DriverManager;
import java.sql.*;
import movies.*;

/**
 *
 * @author Uthtara
 */
public class MovieDB {
    private Connection con;
    private Statement stmt;
    private Driver dr ;
    private Login lg;
        public MovieDB()
        {
            
            try {
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movies","root", "");
                    stmt = con.createStatement();
                    
                } catch (Exception e) {

                    System.out.println(e);
                }
        }
        public String getuserdetails(String Username, String password)
        {
            try
            {
            lg = new Login();
            String sql = "SELECT * FROM userlogindetails WHERE UserName = '"+ Username +"' && Password = '"+password+"'";
            ResultSet rs = stmt.executeQuery(sql);
            
                while (rs.next()) {
                    String username = rs.getString("UserName");
                    lg.setusername(username);
                    
                    String pwd = rs.getString("Password");
                    lg.setpassword(pwd);
                }
                
                
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            
            return lg.getusername();
        }
}
