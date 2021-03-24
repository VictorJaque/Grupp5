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
    //Attribut
    private int aktieID;
    private String aktieNamn;
    private float kostnad;
    
    //Konstruktor
    public Aktie(int aktieID ,String aktieNamn, float kostnad) {
        this.aktieID = aktieID;
        this.aktieNamn = aktieNamn;
        this.kostnad = kostnad;
                
    }
    
    
    //Metoder
    public String getAktieNamn() {
        return aktieNamn;
    }

    public int getAktieID() {
        return aktieID;
    }

    public float getKostnad() {
        return kostnad;
    }
    
    
   
    
    
    
    
    
            
    
}
