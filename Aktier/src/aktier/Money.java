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
abstract class Money {  
    //Attribut
    float value;
    String currency;
   
    
    //Get metod för att nå currency 
    public String GetCurrency(){
        return currency;
    }
    //Set metod för att sätta currency värdet på en ny variabel
    public String SetCurrency(String valuta){
        return this.currency = valuta;
    }

    /**
     * @return the value
     */
    public float getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(float value) {
        this.value = value;
    }

}
