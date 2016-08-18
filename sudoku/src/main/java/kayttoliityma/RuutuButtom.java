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
public class RuutuButtom extends JButton {

    private final Ruutu ruutu;
    private boolean tarkistettu;
    private boolean aktiivisuus;

    public RuutuButtom(Ruutu ruutu) {
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
        ruutu.setArvaus(i);
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
