/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aktier;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Victor Jaque <victor.jaque.mte21lin@tucsweden.se>
 */
public class AktieIT {
    
    public AktieIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAktieNamn method, of class Aktie.
     */
    @Test
    public void testGetAktieNamn() {
        System.out.println("getAktieNamn");
        Aktie instance = null;
        String expResult = "";
        String result = instance.getAktieNamn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAktieID method, of class Aktie.
     */
    @Test
    public void testGetAktieID() {
        System.out.println("getAktieID");
        Aktie instance = null;
        int expResult = 0;
        int result = instance.getAktieID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKostnad method, of class Aktie.
     */
    @Test
    public void testGetKostnad() {
        System.out.println("getKostnad");
        Aktie instance = null;
        float expResult = 0.0F;
        float result = instance.getKostnad();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
