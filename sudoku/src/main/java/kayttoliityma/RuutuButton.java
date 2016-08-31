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
public class RuutuButton extends JButton {

    private final Ruutu ruutu;
    private boolean tarkistettu; //mahdollistaa oikein olevian ruutujen lukitsemisen
    private boolean aktiivisuus; //mahdollistaa oikean ruudun hiirellä valitsemisen

    public RuutuButton(int rat, int arvaus) {
        this.ruutu = new Ruutu(rat, arvaus);
        aktiivisuus = false;
        if (ruutu.tarkista()) {
            this.setText("" + ruutu.getRatkaisu());
            tarkistettu = true;
        } else {
            this.setText("");
            tarkistettu = false;
        }

    }
    
    public boolean isArvaus() {
        if (aktiivisuus) {
           return ruutu.getArvaus() != 10;
        }
        return true;
    }

    public boolean getTarkistetu() {
        return tarkistettu;
    }

    //SudokuruudunKeyKuuntelijan käyttämä metodi joka mahdollistaa ruudun arvon muutamisen
    public void muutaarvausta(int i) {
        if (!tarkistettu) {
            ruutu.setArvaus(i);
        }

    }

    //oikean Ruudun hiirellä löytämiseen tarvittava arvo (Ruudukko käyttää)
    public boolean getAktiivisuus() {
        return aktiivisuus;
    }

    //onko ruudun numero oiken tutkiva metodi
    public void tartkista() {
        if (ruutu.tarkista()) {
            this.setText("" + ruutu.getRatkaisu());
            tarkistettu = true;
        } else {
            this.setText("");
            tarkistettu = false;
        }
    }

    //ruudun saadessa uuden arvauksen se tapahtuu tämän kautta
    public void uusiarvaus() {
        if (ruutu.tarkista()) {
            this.setText("" + ruutu.getRatkaisu());
            tarkistettu = true;
        } else if (ruutu.getArvaus() != 10) {
            this.setText("" + ruutu.getArvaus());
            tarkistettu = false;
        } else {
            this.setText("");
            tarkistettu = false;
        }
    }

    //mahdollistaa oikean ruudun valitsemisen (muiden lukitsemisen) hiirellä
    public void setAktiivisuusToFalse() {
        aktiivisuus = false;
    }

}
