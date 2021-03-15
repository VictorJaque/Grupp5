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
public class MoneyMethodsIT {
    
    public MoneyMethodsIT() {
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
     * Test of insertMoney method, of class MoneyMethods.
     */
    @Test
    public void testInsertMoney() throws Exception {
        System.out.println("insertMoney");
        float userBalance = 0.0F;
        MoneyMethods instance = new MoneyMethodsImpl();
        instance.insertMoney(userBalance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of withdrawMoney method, of class MoneyMethods.
     */
    @Test
    public void testWithdrawMoney() throws Exception {
        System.out.println("withdrawMoney");
        float userBalance = 0.0F;
        MoneyMethods instance = new MoneyMethodsImpl();
        instance.withdrawMoney(userBalance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkBalance method, of class MoneyMethods.
     */
    @Test
    public void testCheckBalance() throws Exception {
        System.out.println("checkBalance");
        float userBalance = 0.0F;
        MoneyMethods instance = new MoneyMethodsImpl();
        instance.checkBalance(userBalance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class MoneyMethodsImpl implements MoneyMethods {

        public void insertMoney(float userBalance) throws InterruptedException {
        }

        public void withdrawMoney(float userBalance) throws InterruptedException {
        }

        public void checkBalance(float userBalance) throws InterruptedException {
        }
    }

    public class MoneyMethodsImpl implements MoneyMethods {

        public void insertMoney(float userBalance) throws InterruptedException {
        }

        public void withdrawMoney(float userBalance) throws InterruptedException {
        }

        public void checkBalance(float userBalance) throws InterruptedException {
        }
    }
    
}
