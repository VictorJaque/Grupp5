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
abstract class Money extends User {  //extend user?
    //Attribut
    float value;
    private String currency;
    
    
    //Konstruktor
    public Money(float value, String currency) {
        super();// fixa när user är klar
        this.value = value;
        this.currency = currency;
    }
    
    //Get metod för att nå currency 
    public String GetCurrency(){
        return currency;
    }
    //Set metod för att sätta currency värdet på en ny variabel
    public String SetCurrency(String valuta){
        return this.currency = valuta;
   
     //Istället för att använda get och set för att skydda data används här get och set för att nå attributen i Meny klassen 
    }      
    public float GetValue(){
        return value;
    }
    public float SetValue(float userInputValue){
            return this.value = userInputValue;
    }
}
