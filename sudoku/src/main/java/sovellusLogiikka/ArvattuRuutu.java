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
public class ArvattuRuutu {
    private ArrayList<Integer> numerot;

    public ArvattuRuutu() {
        numerot = new ArrayList<>();
        numerot.add(-1);
    }
    
    public void lisaanumero(int numero){
        if (numero > 10 || numero < 1) {
            return;
        }
        if(numerot.isEmpty()){
            numerot.add(numero);
        } else if (!numerot.contains(numero)) {
            numerot.add(numero);
        }
    }

    public ArrayList<Integer> getNumerot() {
        return numerot;
    }
    
    public void delnumero(){
        if (!numerot.isEmpty()) {
            numerot.remove(numerot.size()-1);
        }
    }
    
    public int vainyksinumero(){
        if (numerot.size() == 1) {
            return numerot.get(0);
        }
        return 0;
    }
    
}
