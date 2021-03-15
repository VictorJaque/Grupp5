/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aktier;

import java.util.Scanner;
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
public class BankIT {
    
    public BankIT() {
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
     * Test of insertMoney method, of class Bank.
     */
    @Test
    public void testInsertMoney() throws Exception {
        System.out.println("insertMoney");
        float userBalance = 0.0F;
        Bank instance = null;
        instance.insertMoney(userBalance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of withdrawMoney method, of class Bank.
     */
    @Test
    public void testWithdrawMoney() throws Exception {
        System.out.println("withdrawMoney");
        float userBalance = 0.0F;
        Bank instance = null;
        instance.withdrawMoney(userBalance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkBalance method, of class Bank.
     */
    @Test
    public void testCheckBalance() throws Exception {
        System.out.println("checkBalance");
        float userBalance = 0.0F;
        Bank instance = null;
        instance.checkBalance(userBalance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of takeLoan method, of class Bank.
     */
    @Test
    public void testTakeLoan() throws Exception {
        System.out.println("takeLoan");
        Bank instance = null;
        instance.takeLoan();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScan method, of class Bank.
     */
    @Test
    public void testGetScan() {
        System.out.println("getScan");
        Bank instance = null;
        Scanner expResult = null;
        Scanner result = instance.getScan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setScan method, of class Bank.
     */
    @Test
    public void testSetScan() {
        System.out.println("setScan");
        Scanner scan = null;
        Bank instance = null;
        instance.setScan(scan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInterest method, of class Bank.
     */
    @Test
    public void testGetInterest() {
        System.out.println("getInterest");
        Bank instance = null;
        float expResult = 0.0F;
        float result = instance.getInterest();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInterest method, of class Bank.
     */
    @Test
    public void testSetInterest() {
        System.out.println("setInterest");
        float interest = 0.0F;
        Bank instance = null;
        instance.setInterest(interest);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDebt method, of class Bank.
     */
    @Test
    public void testGetDebt() {
        System.out.println("getDebt");
        float expResult = 0.0F;
        float result = Bank.getDebt();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalLoan method, of class Bank.
     */
    @Test
    public void testGetTotalLoan() {
        System.out.println("getTotalLoan");
        float expResult = 0.0F;
        float result = Bank.getTotalLoan();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
