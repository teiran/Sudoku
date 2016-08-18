/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kayttoliityma;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import sovellusLogiikka.Ruudukko;
import sovellusLogiikka.Ruutu;

/**
 *
 * @author tiera
 */
public class Nappaimistonkuuntelijat implements KeyListener{
    private RuutuButtom k;

    public Nappaimistonkuuntelijat(RuutuButtom k) {
        this.k = k;
    }

    
    
    
    

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(Integer.parseInt(e.getKeyChar() + ""));
        
        k.muutaarvausta(Integer.parseInt(e.getKeyChar() + ""));
        k.uusiarvaus();
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
