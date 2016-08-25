/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kayttoliityma;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author tiera
 */
public class SuodokuruudunKeyKuuntelija implements KeyListener {

    private final RuutuButton button;

    public SuodokuruudunKeyKuuntelija(RuutuButton k) {
        this.button = k;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        button.muutaarvausta(Integer.parseInt(e.getKeyChar() + ""));
        button.uusiarvaus();

    }

    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
