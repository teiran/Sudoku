/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellusLogiikka;

import sovelluslogiikka.Ruudukko;
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
public class RuudukkoTest {

    public RuudukkoTest() {
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
     * testaa onko ruudukko valmis 5 erilaisella sudokulla mahdollisilla
     * arvoilla (ei koskaan valmis)
     */
    @Test
    public void testValmis() {
        System.out.println("valmis");
        Ruudukko instance = new Ruudukko();
        instance.setSudoku(0);
        boolean expResult = true;
        boolean result = instance.valmis();
        assertEquals(expResult, result);
        instance.tarkista();
        assertEquals(expResult, result);

    }

    /**
     * Test of getKorkeus method, of class Ruudukko.
     */
    @Test
    public void testGetKorkeus() {
        System.out.println("getKorkeus");
        Ruudukko instance = new Ruudukko();

        instance.setSudoku(0);
        int expResult = 9;
        int result = instance.getKorkeus();
        assertEquals(expResult, result);

    }

    /**
     * Test of getLeveys method, of class Ruudukko.
     */
    @Test
    public void testGetLeveys() {
        System.out.println("getLeveys");
        Ruudukko instance = new Ruudukko();
        instance.setSudoku(0);
        int expResult = 9;
        int result = instance.getLeveys();
        assertEquals(expResult, result);

    }

}
