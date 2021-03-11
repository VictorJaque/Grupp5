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
public class Aktier {
    //Attribut för abstrakta klassen för aktier
    private final String name;
    public float cost;
    public static int amountHolding = 0; 
    
    //Konstruktor
    public Aktier(String name, float cost) {
        this.name = name;
        this.cost = cost;
        amountHolding ++;
    }
}
