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
     * Test of lisaaarvaus method, of class Ruutu.
     */
    @Test
    public void testLisaaarvaus() {
        System.out.println("lisaaarvaus");
        Ruutu k = new Ruutu(3, false);
        k.lisaaarvaus(4);
        int y = k.ruudunnumerot().get(0);
        assertEquals(true, y == 4);
        
        
        k = new Ruutu(3, false);
        k.lisaaarvaus(-9);
        y = k.ruudunnumerot().get(0);
        assertEquals(true, y == -1);
        
        
        
    }

    /**
     * Test of poistanumero method, of class Ruutu.
     */
    @Test
    public void testPoistanumero() {
        System.out.println("poistanumero");
        Ruutu k = new Ruutu(3, false);
        k.lisaaarvaus(4);
        k.poistanumero();
        int y = k.ruudunnumerot().get(0);
        assertEquals(true, y == -1);
        
        
        k = new Ruutu(3, false);
        k.lisaaarvaus(-9);
        k.poistanumero();
        y = k.ruudunnumerot().get(0);
        assertEquals(true, y == -1);
    }

    /**
     * Test of ruudunnumerot method, of class Ruutu.
     */
    @Test
    public void testRuudunnumerot() {
        System.out.println("ruudunnumerot");
        Ruutu k = new Ruutu(3, true);
        int y = k.ruudunnumerot().get(0);
        assertEquals(true, y == 3);
    }

    /**
     * Test of tarkista method, of class Ruutu.
     */
    @Test
    public void testTarkista() {
        System.out.println("tarkista");
        Ruutu k = new Ruutu(3, false);
        k.lisaaarvaus(3);
        k.tarkista();
        int y = k.ruudunnumerot().get(0);
        
        assertEquals(true, y == 3);
        
        
        k = new Ruutu(3, false);
        k.lisaaarvaus(-9);
        k.tarkista();
        y = k.ruudunnumerot().get(0);
        assertEquals(true, y == -1);
    }
    
}
