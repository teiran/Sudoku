/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kayttoliityma;

import javax.swing.JButton;
import sovellusLogiikka.Ruudukko;

/**
 *
 * @author tiera
 */
public class TarkistusButton extends JButton {

    private final Ruudukko taulukko;

    public TarkistusButton(Ruudukko taulukko) {
        this.taulukko = taulukko;
        this.setText("Tarkista");
    }

    public void tarkista() {
        taulukko.tarkista();
    }
    
 
}
