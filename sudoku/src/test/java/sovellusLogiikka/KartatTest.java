/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellusLogiikka;

import sudokunGeneroiti.Kartat;
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
public class KartatTest {
    
    public KartatTest() {
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

    
    @Test
    public void testGetAloitukartta() {
        System.out.println("getAloitukartta");
        for (int i = 0; i < 5; i++) {
            Kartat instance = new Kartat(i);
            int t = 0;
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 9; k++) {
                    if (instance.getAloitukartta()[j][k] != 10) {
                        assertEquals(instance.getValmiskartta()[j][k], instance.getAloitukartta()[j][k]);
                    } 
                    
                }
            }
            
        }
        
    }

    
    
}
