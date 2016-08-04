/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellusLogiikka;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tiera
 */
public class ArvattuRuutuTest {
    
    public ArvattuRuutuTest() {
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
     * Test of lisaanumero method, of class ArvattuRuutu.
     */
    @Test
    public void testLisaanumero() {
        System.out.println("lisaanumero");
        ArvattuRuutu k = new ArvattuRuutu();
        
        k.lisaanumero(1);
        
        assertEquals(true, k.getNumerot().get(0) == 1);
        
        k = new ArvattuRuutu();
        assertEquals(true, k.getNumerot().get(0) == -1);
        k = new ArvattuRuutu();
        k.lisaanumero(9);
        assertEquals(true, k.getNumerot().get(0) == 9);
        k = new ArvattuRuutu();
        k.lisaanumero(-9);
        assertEquals(true, k.getNumerot().get(0) == -1);
        k = new ArvattuRuutu();
        k.lisaanumero(19);
        assertEquals(true, k.getNumerot().get(0) == -1);
        
    }

    /**
     * Test of getNumerot method, of class ArvattuRuutu.
     */

    /**
     * Test of delnumero method, of class ArvattuRuutu.
     */
    @Test
    public void testDelnumero() {
        ArvattuRuutu k = new ArvattuRuutu();
        
        k.lisaanumero(1);
        
        k.delnumero();
        
        assertEquals(true, k.getNumerot().get(0) == -1);
    }

    /**
     * Test of vainyksinumero method, of class ArvattuRuutu.
     */
    @Test
    public void testVainyksinumero() {
        System.out.println("vainyksinumero");
        ArvattuRuutu k = new ArvattuRuutu();
        
        assertEquals(true, k.vainyksinumero() == 0);
        k.lisaanumero(1);
        assertEquals(true, k.vainyksinumero() != 0);
        k.lisaanumero(2);
        assertEquals(true, k.vainyksinumero() == 0);
    }
    
}
