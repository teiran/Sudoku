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
    private ArrayList<Integer> ratkaisu;
    private ArvattuRuutu aravatutnumerot;

    public Ruutu(int rat, boolean onkoruutualussa) { //täytyy vielä kehittää sopiva errori jos rat ei ole 1-9 välillä
        
        ratkaisu = new ArrayList<>();
        ratkaisu.add(rat);
        tarkistettu = onkoruutualussa;
        aravatutnumerot = new ArvattuRuutu();
    }
    
    public void lisaaarvaus(int numero){
        aravatutnumerot.lisaanumero(numero);
    }
    
    public void poistanumero(){
        aravatutnumerot.delnumero();
    }
    
    public ArrayList ruudunnumerot(){
        if (tarkistettu) {
            return ratkaisu;
        }
        return aravatutnumerot.getNumerot();
    }
    
    public void tarkista(){
        tarkistettu = (aravatutnumerot.vainyksinumero() == ratkaisu.get(0));
    }
    
    
    
    
}
