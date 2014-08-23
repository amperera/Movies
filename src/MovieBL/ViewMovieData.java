/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MovieBL;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Uthtara
 */
public class ViewMovieData {
    
    private Connection con;
    private Statement stmt;
    private Driver dr ;
    
    public ViewMovieData(){
        try {
               Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movies","root", "");
                    stmt = con.createStatement();
                    
                    
                    
                } catch (Exception e) {

                    System.out.println(e);
                }
    }
    
    public void AddData( DefaultTableModel model)
    {
         try {
                
                String sql = "SELECT * FROM movies";
                ResultSet rs = stmt.executeQuery(sql);
            
                while (rs.next()) {
                    String Title = rs.getString("title");
                    String Cast = rs.getString("Cast");
                    String Crew = rs.getString("Crew");
                    String Story = rs.getString("Story");
                    String Studio = rs.getString("Studio");
                    String Released = rs.getString("Released");
                    String MainActor = rs.getString("MainActor");
                    String Stock = rs.getString("Stock");
                    String Genre = rs.getString("genre");
                    String price = rs.getString("Price");
                    model.addRow(new Object[]{Title,Cast,Crew,Genre,MainActor,Released,Stock,Story,price,Studio});
                        
                }  
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
    }
    
}
