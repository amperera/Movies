/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MovieBL;

import MovieDL.Purchase;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement; 
import javax.swing.JComboBox;

/**
 *
 * @author Uthtara
 */
public class PurchaseDetails {
     private Connection con;
    private Statement stmt;
    private Driver dr ;
    
    public PurchaseDetails()
    {
          try {
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movies","root", "");
                    stmt = con.createStatement();
                    
                } catch (Exception e) {

                    System.out.println(e);
                }
    }

    public void SetComboBoxData(JComboBox jComboBox1) {
        try {  
                String sql = "SELECT * FROM movies";
                ResultSet rs = stmt.executeQuery(sql);
            
                while (rs.next()) {
                    String Title = rs.getString("title");
                    
                    jComboBox1.addItem(Title);           
                }  
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
    }

    public String SavePurchaseDetails(Purchase pc) {
        
        String msg;
         try {  
                String sql = "SELECT * FROM movies where Title = '"+pc.getTitle()+"'";
                ResultSet rs = stmt.executeQuery(sql);
                
                int Stock = 0;
                int Mid = 0;
                while (rs.next()) {
                     Stock = Integer.parseInt(rs.getString("Stock"));
                     Mid =  rs.getInt("movieID");
                     
                }
                int Oqty = Integer.parseInt(pc.getOrderQty());
                int id = Integer.parseInt(pc.getClientID());
                int Cid = CleintIdValidation(pc.getClientID(),pc.getClientName());
                
                
                
                if(id != Cid){
                        String ms = "Client Id or Client name is incorrect";
                        return ms;
                    }
                else if(Stock < Oqty){
                        
                        msg = "Quntity you enter is more than current stock. the stock is '"+Stock+"'";
                        return msg;
                         }
                else{
                    double amount = Integer.parseInt(pc.getOrderQty())* 50;
                    double totalamount;
                    totalamount = amount - amount * 0.05;
                    int UpdateStock = Stock - Oqty;
                    UpdateMovieStock(Mid, UpdateStock);
                    System.out.println(totalamount);
                }
                
                
                
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
          return "";
    }
  //client varify
    private int CleintIdValidation(String clientID, String clientName) {
     try {  
                String sql = "SELECT * FROM clientdetails WHERE C_ID = '"+clientID+"' && CName = '"+clientName+"'";
                ResultSet rs = stmt.executeQuery(sql);
                
                 
                while (rs.next()) {
                   String cID = rs.getString("C_ID");
                     return Integer.parseInt(cID);
                }
        }
        catch(Exception e){
            System.out.println(e);
        }
        
       return 0;
    }

    private void UpdateMovieStock(int Mid, int UpdateStock) {
        try{
            
            String sql = "UPDATE movies " +
                       "SET Stock = '"+ UpdateStock +"' WHERE movieID = '"+Mid+"'";
            stmt.executeUpdate(sql);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    
}
