/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MovieDL;

/**
 *
 * @author Uthtara
 */
public class Purchase {
    
    private String Title;
    private String OrderQty;
    private String ClientID;
    private String ClientName;

    /**
     * @return the Title
     */
    public String getTitle() {
        return Title;
    }

    /**
     * @param Title the Title to set
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * @return the OrderQty
     */
    public String getOrderQty() {
        return OrderQty;
    }

    
    public void setOrderQty(String OrderQty) {
        this.OrderQty = OrderQty;
    }

    
    public String getClientID() {
        return ClientID;
    }

    
    public void setClientID(String ClientID) {
        this.ClientID = ClientID;
    }

    /**
     * @return the ClientName
     */
    public String getClientName() {
        return ClientName;
    }

    /**
     * @param ClientName the ClientName to set
     */
    public void setClientName(String ClientName) {
        this.ClientName = ClientName;
    }
    
    
}
