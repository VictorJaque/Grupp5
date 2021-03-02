/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aktier;

/**
 *
 * @author Victor Jaque <victor.jaque.mte21lin@tucsweden.se>
 */
abstract class Pengar {
    //Attribut
    public float value;
    private String currency;
    
    
    //Konstruktor
    public Pengar(float value, String currency) {
        this.value = value;
        this.currency = currency;
    }
    
    //Get metod för att nå currency 
    public String GetCurrency(){
        return currency;
    }
    //Set metod för att sätta currency värdet på en ny variabel
    public String SetMethod(String valuta){
        return this.currency = valuta;
    }
    
}
