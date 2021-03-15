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
public class InterfaceImplIT {
    
    public InterfaceImplIT() {
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
     * Test of isLogin method, of class InterfaceImpl.
     */
    @Test
    public void testIsLogin() {
        System.out.println("isLogin");
        String username = "";
        String password = "";
        InterfaceImpl instance = new InterfaceImpl();
        boolean expResult = false;
        boolean result = instance.isLogin(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of register method, of class InterfaceImpl.
     */
    @Test
    public void testRegister() {
        System.out.println("register");
        User user = null;
        InterfaceImpl instance = new InterfaceImpl();
        instance.register(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
