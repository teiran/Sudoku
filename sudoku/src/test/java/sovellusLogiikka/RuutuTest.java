/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellusLogiikka;

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
public class RuutuTest {
    
    public RuutuTest() {
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
     * Test of setArvaus method, of class Ruutu.
     */
    @Test
    public void testSetArvaus() {
        System.out.println("setArvaus");
        Ruutu k = new Ruutu(1);
        k.setArvaus(3);
        assertEquals(3, k.getArvaus());
        k.setArvaus(1);
        assertEquals(1, k.getArvaus());
        k.setArvaus(9);
        assertEquals(9, k.getArvaus());
        k.setArvaus(10);
        assertEquals(9, k.getArvaus());
        k.setArvaus(-1);
        assertEquals(9, k.getArvaus());
        k.setArvaus(0);
        assertEquals(9, k.getArvaus());
    }

    /**
     * Test of tarkista method, of class Ruutu.
     */
    @Test
    public void testTarkista() {
        System.out.println("tarkista");
        Ruutu k = new Ruutu(1);
        k.setArvaus(3);
        assertEquals(false, k.tarkista());
        k.setArvaus(1);
        assertEquals(true, k.tarkista());
    }
    
}
