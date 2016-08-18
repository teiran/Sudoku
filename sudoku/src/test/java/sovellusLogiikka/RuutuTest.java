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
        Ruutu r = new Ruutu(1, 9);
        r.setArvaus(1);
        assertEquals(1, r.getArvaus());
        r.setArvaus(9);
        assertEquals(9, r.getArvaus());
        r.setArvaus(-10);
        assertEquals(9, r.getArvaus());
        r.setArvaus(16);
        assertEquals(9, r.getArvaus());
        r.setArvaus(0);
        assertEquals(9, r.getArvaus());
        r.setArvaus(10);
        assertEquals(9, r.getArvaus());
    }

    /**
     * Test of getArvaus method, of class Ruutu.
     */
    @Test
    public void testGetArvaus() {
        System.out.println("getArvaus");
        Ruutu r = new Ruutu(7, 5);
        assertEquals(5, r.getArvaus());
    }

    /**
     * Test of getRatkaisu method, of class Ruutu.
     */
    @Test
    public void testGetRatkaisu() {
        System.out.println("getRatkaisu");
        Ruutu r = new Ruutu(7, 5);
        assertEquals(7, r.getRatkaisu());
    }

    /**
     * Test of tarkista method, of class Ruutu.
     */
    @Test
    public void testTarkista() {
        System.out.println("tarkista");
        Ruutu r = new Ruutu(6, 6);
        assertEquals(true, r.tarkista());
        r.setArvaus(4);
        assertEquals(false, r.tarkista());
    }
    
}
