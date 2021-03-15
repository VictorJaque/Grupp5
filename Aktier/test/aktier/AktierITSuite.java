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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Victor Jaque <victor.jaque.mte21lin@tucsweden.se>
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({aktier.MoneyMethodsIT.class, aktier.MenyIT.class, aktier.UserIT.class, aktier.UserInterfaceIT.class, aktier.BankIT.class, aktier.InterfaceImplIT.class, aktier.MoneyIT.class, aktier.MainIT.class, aktier.AktiemarknadIT.class, aktier.AktieIT.class, aktier.StatenIT.class})
public class AktierITSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
