/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aktier;

import javax.lang.model.SourceVersion;
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
public class MoneyIT {
    
    public MoneyIT() {
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
     * Test of GetCurrency method, of class Money.
     */
    @Test
    public void testGetCurrency() {
        System.out.println("GetCurrency");
        Money instance = null;
        String expResult = "";
        String result = instance.GetCurrency();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SetCurrency method, of class Money.
     */
    @Test
    public void testSetCurrency() {
        System.out.println("SetCurrency");
        String valuta = "";
        Money instance = null;
        String expResult = "";
        String result = instance.SetCurrency(valuta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetValue method, of class Money.
     */
    @Test
    public void testGetValue() {
        System.out.println("GetValue");
        Money instance = null;
        float expResult = 0.0F;
        float result = instance.GetValue();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SetValue method, of class Money.
     */
    @Test
    public void testSetValue() {
        System.out.println("SetValue");
        float userInputValue = 0.0F;
        Money instance = null;
        float expResult = 0.0F;
        float result = instance.SetValue(userInputValue);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    public class MoneyImpl extends Money {

        public MoneyImpl(MoneyIT outer) {
            super(0.0F, "", outer);
        }
    }
    
}
