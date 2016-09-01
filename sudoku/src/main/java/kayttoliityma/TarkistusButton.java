/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kayttoliityma;

import javax.swing.JButton;
import sovelluslogiikka.Ruudukko;

/**
 *
 * @author tiera
 */
public class TarkistusButton extends JButton {

    private final Ruudukko taulukko;
    /**
     * nappula jossa lukee tarkista ja sitä klikasttaessa tarkistaa.
     * 
     * @param taulukko Ruudukko linkki ruudukkoon.
     * 
     */
    public TarkistusButton(Ruudukko taulukko) {
        this.taulukko = taulukko;
        this.setText("Tarkista");
    }
    /**
     * Tarkistalisenerin käyttämä metdoi jolla sen ActionEventin tapahtuessa tarkistetaan mitkä sudokun arvot oikein.
     * 
     */
    public void tarkista() {
        taulukko.tarkista();
    }
    
 
}
