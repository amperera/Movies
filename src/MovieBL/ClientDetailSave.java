/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MovieBL;

import MovieDL.ClientDetails;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

    
public class ClientDetailSave {
    
    private Connection con;
    private Statement stmt;
    private Driver dr ;

    public ClientDetailSave()
    {
        try {
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movies","root", "");
                    stmt = con.createStatement();
                    
                } catch (Exception e) {

                    System.out.println(e);
                }
    }
    public void SaveClientData(ClientDetails cd) {
        try {
         String data = "INSERT INTO clientdetails(CName,Address,CMobileNumber,Payments)"+
                       "VALUES('"+cd.getName()+"','"+cd.getAddress()+"','"+cd.getMobile()+"','"+cd.getPayement()+"')";
         stmt.executeUpdate(data);
            
        } 
        catch (Exception e){
            
            System.out.println((e));
        }
    }
    
}
