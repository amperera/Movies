
package MovieBL;

import MovieDL.*;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

public class StoreData {
    
     private Connection con;
    private Statement stmt;
    private Driver dr ;
    
    public StoreData(){
        try {
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movies","root", "");
                    stmt = con.createStatement();
                    
                } catch (Exception e) {

                    System.out.println(e);
                }
    }
    
    public void AddDataTOdatabase(Movie mv){
    try {
         String data = "INSERT INTO movies(title,Cast,Crew,Story,Studio,Released,MainActor,Stock,genre,Price)"+
                       "VALUES('"+mv.getTitle()+"','"+mv.getCast()+"','"+mv.getCrew()+"','"+mv.getStory()+"','"
                       +mv.getStudio()+"','"+mv.getReleased()+"','"+mv.getMainActor()+"','"+mv.getStock()+"','"+mv.getGenre()+"','"+mv.getPrice()+"')";
         stmt.executeUpdate(data);
            
        } 
        catch (Exception e){
            
            System.out.println((e));
        }
        
    }
    
}

