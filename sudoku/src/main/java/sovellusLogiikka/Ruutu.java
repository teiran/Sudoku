/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellusLogiikka;

import java.util.ArrayList;

/**
 *
 * @author tiera
 */
public class Ruutu {
    private boolean tarkistettu;
    private int ratkaisu;
    private int arvaus;

    public Ruutu(int rat) { //täytyy vielä kehittää sopiva errori jos rat ei ole 1-9 välillä
        ratkaisu = rat;
    }

    public void setArvaus(int arvaus) {
        this.arvaus = arvaus;
    }
    
    public void lisaaarvaus(int numero){
        if ((numero <= 9) && (numero >= 1)) {
            arvaus = numero;
        }
    }

    public int getArvaus() {
        return arvaus;
    }
    
    public boolean tarkista(){
        return (arvaus == ratkaisu);
    }
    
    
    
    
}
