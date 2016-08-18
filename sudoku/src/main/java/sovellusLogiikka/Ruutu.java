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

    public Ruutu(int rat, int arc) { //täytyy vielä kehittää sopiva errori jos rat ei ole 1-9 välillä
        arvaus = arc;
        ratkaisu = rat;
        aktiivisuus = false;

    }
    /*
     * arvausta muutaessa tarvittava setArvaus
     * 
     * @param arvaus on Ruutubuttonnin kautta lisnerista tuleva arvo
    */
    //
    public void setArvaus(int arvaus) {
        if (0 < arvaus && 10 > arvaus) {
            this.arvaus = arvaus;
        }
    }
    /*
     * getArvausbuttom saa ruudun sisältämän tiedon
     * 
     * @return palauttaa Arvatun arvon buttonille
    */
    //
    public int getArvaus() {
        return arvaus;
    }
    
    /*
     * getRatkaisulla buttom saa ruudun sisältämän tiedon
     *
     *@return palauttaa sudokuruudun ratkasun
    */

    public int getRatkaisu() {
        return ratkaisu;
    }
    
    /*
     * tarkistaessa käytettävä
     *
     * @return palauttaa true jos arvaus ja ratkaisu on sama
    */
    //
    public boolean tarkista() {
        return (arvaus == ratkaisu);
    }

}
