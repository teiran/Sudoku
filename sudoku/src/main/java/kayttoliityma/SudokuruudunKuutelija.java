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

    public SudokuruudunKuutelija(RuutuButton t) {
        this.t = t;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        t.setAktiivisuusToFalse();

    }

}
