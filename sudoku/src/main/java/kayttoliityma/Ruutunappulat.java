/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kayttoliityma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import sovellusLogiikka.Ruutu;

/**
 *
 * @author tiera
 */
public class Ruutunappulat extends JButton {

    private Ruutu ruutu;
    private boolean tarkistettu;
    private boolean aktiivisuus;

    public Ruutunappulat(Ruutu ruutu) {
        this.ruutu = ruutu;
        aktiivisuus = false;
        if (ruutu.tarkista()) {
            this.setText("" + ruutu.getRatkaisu());
            tarkistettu = true;
        } else {
            this.setText("");
            tarkistettu = false;
        }

    }

    public void muutaarvausta(int i) {
        ruutu.setArvaus2(i);
    }

    public boolean getAktiivisuus() {
        return aktiivisuus;
    }

    public void tartkista() {
        if (ruutu.tarkista()) {
            this.setText("" + ruutu.getRatkaisu());
            tarkistettu = true;
        } else {
            this.setText("");
            tarkistettu = false;
        }
    }

    public void uusiarvaus() {
        if (ruutu.tarkista()) {
            this.setText("" + ruutu.getRatkaisu());
            tarkistettu = true;
        } else {
            if (ruutu.getArvaus() != 10) {
                this.setText("" + ruutu.getArvaus());
                tarkistettu = false;
            } else {
                this.setText("");
                tarkistettu = false;
            }
        }
    }

    public void setAktiivisuus() {
        aktiivisuus = false;
    }

}
