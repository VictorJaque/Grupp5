/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aktier;

import java.util.ArrayList;
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
public class AktiemarknadIT {
    
    public AktiemarknadIT() {
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
     * Test of insertMoney method, of class Aktiemarknad.
     */
    @Test
    public void testInsertMoney() throws Exception {
        System.out.println("insertMoney");
        float userBalance = 0.0F;
        Aktiemarknad instance = null;
        instance.insertMoney(userBalance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of withdrawMoney method, of class Aktiemarknad.
     */
    @Test
    public void testWithdrawMoney() throws Exception {
        System.out.println("withdrawMoney");
        float userBalance = 0.0F;
        Aktiemarknad instance = null;
        instance.withdrawMoney(userBalance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkBalance method, of class Aktiemarknad.
     */
    @Test
    public void testCheckBalance() throws Exception {
        System.out.println("checkBalance");
        float userBalance = 0.0F;
        Aktiemarknad instance = null;
        instance.checkBalance(userBalance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addStocks method, of class Aktiemarknad.
     */
    @Test
    public void testAddStocks() throws Exception {
        System.out.println("addStocks");
        ArrayList<Aktie> listOfStocks = null;
        Aktiemarknad.addStocks(listOfStocks);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeStock method, of class Aktiemarknad.
     */
    @Test
    public void testRemoveStock() throws Exception {
        System.out.println("removeStock");
        Aktiemarknad.removeStock();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listAllStocks method, of class Aktiemarknad.
     */
    @Test
    public void testListAllStocks() throws Exception {
        System.out.println("listAllStocks");
        Aktiemarknad.listAllStocks();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScan method, of class Aktiemarknad.
     */
    @Test
    public void testGetScan() {
        System.out.println("getScan");
        Aktiemarknad instance = null;
        Scanner expResult = null;
        Scanner result = instance.getScan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setScan method, of class Aktiemarknad.
     */
    @Test
    public void testSetScan() {
        System.out.println("setScan");
        Scanner scan = null;
        Aktiemarknad instance = null;
        instance.setScan(scan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListOfStocks method, of class Aktiemarknad.
     */
    @Test
    public void testGetListOfStocks() {
        System.out.println("getListOfStocks");
        ArrayList<Aktie> expResult = null;
        ArrayList<Aktie> result = Aktiemarknad.getListOfStocks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListOfStocks method, of class Aktiemarknad.
     */
    @Test
    public void testSetListOfStocks() {
        System.out.println("setListOfStocks");
        ArrayList<Aktie> aListOfStocks = null;
        Aktiemarknad.setListOfStocks(aListOfStocks);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
