/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kayttoliityma;

import javax.swing.JButton;
import sovellusLogiikka.Ruutu;



/**
 *
 * @author tiera
 */
public class Ruutunappulat extends JButton{
    private Ruutu ruutu;

    public Ruutunappulat(Ruutu ruutu) {
        this.ruutu = ruutu;
        if (ruutu.tarkista()) {
            this.setText("" + ruutu.getRatkaisu());
        } else {
            this.setText("");
        }
    }
    
    
    
}
