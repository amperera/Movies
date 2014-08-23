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
public class ClientDetails {
    
    private int Cid;
    private String Name;
    private String Address;
    private String mobile;
    private String Payement;

    
    public int getCid() {
        return Cid;
    }

    /**
     * @param Cid the Cid to set
     */
    public void setCid(int Cid) {
        this.Cid = Cid;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * @return the mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile the mobile to set
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return the Payement
     */
    public String getPayement() {
        return Payement;
    }

    /**
     * @param Payement the Payement to set
     */
    public void setPayement(String Payement) {
        this.Payement = Payement;
    }
    
}
