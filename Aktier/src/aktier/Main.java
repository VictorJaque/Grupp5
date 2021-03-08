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
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        System.out.println("Grupp5 aktiehandel AB");
        //Meny.MenuAfterLogin(); metoden ska bort från main, endast start ska finnas tillgänglig
        //Meny.MenuStart(); anropar en metod i menyklassen som tillsammans med övriga metoder i Meny klassen ärver av alla klasser i projektet.
        Meny.MenuStart();
        Meny.MenuAfterLogin();
    }
    
}
