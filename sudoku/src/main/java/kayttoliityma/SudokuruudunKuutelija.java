package kayttoliityma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tiera
 */
public class SudokuruudunKuutelija implements ActionListener {

    private final RuutuButton t;
    
    /**
     * @param t RuutuButton kuuntelija Ruutubuttonille.
     * 
     */

    public SudokuruudunKuutelija(RuutuButton t) {
        this.t = t;
    }
    
    /**
     * ruutua klikattaessa muuttaa ruudun aktiivisuus arvon falseksi (RuutuButtonin arvon).
     * 
     * @param e ActionEvent.
     * 
     */

    @Override
    public void actionPerformed(ActionEvent e) {
        t.setAktiivisuusToFalse();

    }

}
