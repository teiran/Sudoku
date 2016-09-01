/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellusLogiikka;

/**
 *
 * @author tiera
 */
public class Ruutu {

    private boolean tarkistettu;
    private final int ratkaisu;
    private int arvaus;
    boolean aktiivisuus;
    /**
     * 
     * @param rat int sudokuruudun ratkaisu
     * @param arc int sudokuruudun arvaus
     */
    public Ruutu(int rat, int arc) { //täytyy vielä kehittää sopiva errori jos rat ei ole 1-9 välillä
        arvaus = arc;
        ratkaisu = rat;
        aktiivisuus = false;

    }
    /**
     * 
     * @param arvaus int muuttaa arvausta jos arvaus sudokun ruudun arvauksen rajoissa
     */
    public void setArvaus(int arvaus) {
        if (0 < arvaus && 10 > arvaus) {
            this.arvaus = arvaus;
        }
    }
    /**
     * 
     * @return int palauttaa arvauksen 
     */
    public int getArvaus() {
        return arvaus;
    }
    
    /**
     * 
     * @return int palauttaa ratkaisun 
     */

    public int getRatkaisu() {
        return ratkaisu;
    }
    
    /**
     * 
     * @return boolean palauttaa onkoruutu oiken, true jos arvaus ja ratkaisu on sama, muuten false 
     */
    public boolean tarkista() {
        return (arvaus == ratkaisu);
    }

}
