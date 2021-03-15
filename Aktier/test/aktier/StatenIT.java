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
public class StatenIT {
    
    public StatenIT() {
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
     * Test of insertMoney method, of class Staten.
     */
    @Test
    public void testInsertMoney() throws Exception {
        System.out.println("insertMoney");
        float userBalance = 0.0F;
        Staten instance = null;
        instance.insertMoney(userBalance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of withdrawMoney method, of class Staten.
     */
    @Test
    public void testWithdrawMoney() throws Exception {
        System.out.println("withdrawMoney");
        float userBalance = 0.0F;
        Staten instance = null;
        instance.withdrawMoney(userBalance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkBalance method, of class Staten.
     */
    @Test
    public void testCheckBalance() throws Exception {
        System.out.println("checkBalance");
        float userBalance = 0.0F;
        Staten instance = null;
        instance.checkBalance(userBalance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BetalaSkatt method, of class Staten.
     */
    @Test
    public void testBetalaSkatt() throws Exception {
        System.out.println("BetalaSkatt");
        Staten.BetalaSkatt();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
