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

    private Ruutu ruutu;
    private boolean tarkistettu; //mahdollistaa oikein olevian ruutujen lukitsemisen
    private boolean aktiivisuus; //mahdollistaa oikean ruudun hiirellä valitsemisen
    private boolean onkoasetettusudoku;
    /**
     * on graafinen asu ruudulle on myös sovelluslogiikan ominaisuuksia
     */
    public RuutuButton() {
        this.setText("");
        onkoasetettusudoku = false;
    }
    /**
     * laittaa ruutuihin sudokun mukaiset numerot luo myös Ruutu olion jossa osa 
     * sovelluslogiikan tiedoista
     * 
     * @param rat int ratkaisu ruudulle
     * @param arvaus int arvaus ruudulle
     */
    public void setsudoku(int rat, int arvaus) {
        this.ruutu = new Ruutu(rat, arvaus);
        aktiivisuus = false;
        if (ruutu.tarkista()) {
            this.setText("" + ruutu.getRatkaisu());
            tarkistettu = true;
        } else {
            this.setText("");
            tarkistettu = false;
        }
        onkoasetettusudoku = true;
    }
    /**
     * tarkistaa arvaujsen
     * 
     * @return boolean palauttaa true jos on arvaus false jos ei ole
     */
    public boolean isArvaus() {
        if (onkoasetettusudoku) {
            if (aktiivisuus) {
                return ruutu.getArvaus() != 10;
            }
            return true;
        }
        return false;

    }
    /**
     * tutkii onko ruutu tarkistettu
     * 
     * @return boolean true jos ruutu on merkattu tarkistetuksi (ja siis oiken) ja false jos ei 
     */
    public boolean getTarkistetu() {
        if (onkoasetettusudoku) {
            return tarkistettu;
        }
        return false;
    }
    /**
     * SudokuruudunKeyKuuntelijan käyttämä metodi joka mahdollistaa ruudun arvon muutamisen
     * 
     * @param i int muokkaa ruudun arvausta jos sitä voi
     */
    //
    public void muutaarvausta(int i) {
        if (!tarkistettu && onkoasetettusudoku) {
            ruutu.setArvaus(i);
        }

    }
    /**
     * jos ruutu on valittu hiirellä sen arvo on true ja jos ei niin false
     * jos ruudun arvo on true siihen voi kirjottaa numeron.
     * 
     * @return boolean true jos ruutu on aktiivinen false jos ei
     */
    public boolean getAktiivisuus() {
        if (onkoasetettusudoku) {
            return aktiivisuus;
        }
        return false;
    }
    /**
     * tarkistaa onko ruutu tarkistettu
     * 
     */
    
    public void tartkista() {
        if (onkoasetettusudoku) {
            if (ruutu.tarkista()) {
                this.setText("" + ruutu.getRatkaisu());
                tarkistettu = true;
            } else {
                this.setText("");
                tarkistettu = false;
            }
        }

    }
    /**
     * ruudun saadessa uuden arvauksen tämä muokka ruudun graafiikka sen mukaiseksi
     * 
     */
    
    public void uusiarvaus() {
        if (onkoasetettusudoku) {
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

    }
    /**
     * muuttaa ruudun aktivisuuden falseksi
     * 
     */
    public void setAktiivisuusToFalse() {
        if (onkoasetettusudoku) {
            aktiivisuus = false;
        }
    }

}
