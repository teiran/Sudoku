/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovelluslogiikka;

import javax.swing.SwingUtilities;
import kayttoliityma.Kayttoliityma;

/**
 *
 * @author tiera
 */
public class NewMain {

    /**
     * @param args the command line arguments.
     */
    public static void main(String[] args) {

        Ruudukko z = new Ruudukko();
        Kayttoliityma kayttoliittyma = new Kayttoliityma(z);
        SwingUtilities.invokeLater(kayttoliittyma);

    }

}
