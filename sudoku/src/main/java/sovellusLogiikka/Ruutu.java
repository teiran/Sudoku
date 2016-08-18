/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellusLogiikka;

import kayttoliityma.RuutuButtom;

/**
 *
 * @author tiera
 */
public class Ruutu {
    private boolean tarkistettu;
    private final int ratkaisu;
    private int arvaus;
    boolean aktiivisuus;
    private RuutuButtom bottom;

    public Ruutu(int rat) { //täytyy vielä kehittää sopiva errori jos rat ei ole 1-9 välillä
        ratkaisu = rat;
        aktiivisuus = false;
        
    }

    public RuutuButtom getButtom() {
        return bottom;
    } 

    public void setArvaus(int arvaus) {
        if (0 < arvaus && 10 > arvaus) {
            this.arvaus = arvaus;
        }
        
    }
    
    public void luoButtom(){
        bottom = new RuutuButtom(this);
    }
    
    public boolean getAktiivisuus(){
        return bottom.getAktiivisuus();
    }

    public int getArvaus() {
        return arvaus;
    }

    public int getRatkaisu() {
        return ratkaisu;
    }
    
    
    
    public boolean tarkista(){
        return (arvaus == ratkaisu);
    }
    
    
      public void setAktiivisuus(){
        bottom.setAktiivisuus();
    }
    
}
