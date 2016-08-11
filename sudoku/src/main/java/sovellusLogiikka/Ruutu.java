/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellusLogiikka;

import java.util.ArrayList;
import kayttoliityma.Ruutunappulat;

/**
 *
 * @author tiera
 */
public class Ruutu {
    private boolean tarkistettu;
    private int ratkaisu;
    private int arvaus;
    boolean aktiivisuus;
    private Ruutunappulat k;

    public Ruutu(int rat) { //täytyy vielä kehittää sopiva errori jos rat ei ole 1-9 välillä
        ratkaisu = rat;
        aktiivisuus = false;
        
    }

    public Ruutunappulat getK() {
        return k;
    }
    
  public void setArvaus2(int arvaus) {
        if (0 < arvaus && 10 > arvaus) {
            this.arvaus = arvaus;
        }
    }    

    public void setArvaus(int arvaus) {
        if (0 < arvaus && 10 > arvaus) {
            this.arvaus = arvaus;
        }
        k = new Ruutunappulat(this);
    }
    
    public boolean getAktiivisuus(){
        return k.getAktiivisuus();
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
        k.setAktiivisuus();
    }
    
}
