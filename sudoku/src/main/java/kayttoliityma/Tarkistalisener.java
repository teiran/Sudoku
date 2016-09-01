/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kayttoliityma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author tiera
 */
public class Tarkistalisener implements ActionListener {

    private final TarkistusButton buttom;
    /**
     * takistus nappulankuuntelija.
     * 
     * @param buttom TarkistusButton linkki kuunteltavaan nappulaan.
     * 
     */
    public Tarkistalisener(TarkistusButton buttom) {
        this.buttom = buttom;
    }
    /**
     * @param e ActionEvent sattuessa kustuu metodia tarkista.
     * 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        buttom.tarkista();
        
    }

}
