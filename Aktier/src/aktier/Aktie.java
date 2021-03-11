/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aktier;

/**
 *
 * @author Kalle
 */
public class Aktie {
    private String aktieID;
    private String aktieNamn;
    

    public Aktie(String aktieID ,String aktieNamn) {
        this.aktieID = aktieID;
        this.aktieNamn = aktieNamn;
                
    }
    
    

    public String getAktieNamn() {
        return aktieNamn;
    }

    public String getAktieID() {
        return aktieID;
    }
    
   
    
    
    
    
    
            
    
}
