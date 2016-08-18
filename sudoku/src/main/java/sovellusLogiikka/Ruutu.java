/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellusLogiikka;

import kayttoliityma.RuutuButton;

/**
 *
 * @author tiera
 */
public class Ruutu {

    private boolean tarkistettu;
    private final int ratkaisu;
    private int arvaus;
    boolean aktiivisuus;
    
    
    
    public Ruutu(int rat, int arc) { //täytyy vielä kehittää sopiva errori jos rat ei ole 1-9 välillä
        arvaus = arc;
        ratkaisu = rat;
        aktiivisuus = false;

    }
    
    //arvausta muutaessa tarvittava setArvaus
    public void setArvaus(int arvaus) {
        if (0 < arvaus && 10 > arvaus) {
            this.arvaus = arvaus;
        }
    }
    
    //getArvaus ja getRatkaisulla buttom saa ruudun sisältämän tiedon
    public int getArvaus() {
        return arvaus;
    }

    public int getRatkaisu() {
        return ratkaisu;
    }
    
    //tarkistaessa käytettävä
    public boolean tarkista() {
        return (arvaus == ratkaisu);
    }

}
