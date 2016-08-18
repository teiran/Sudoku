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
public class Ruudukko {

    private final RuutuButton[][] ruudukko;
    private final int leveys = 9;
    private final int korkeus = 9;
    private final Valmiitkartat sudokukartat;

    public Ruudukko() {
        sudokukartat = new Valmiitkartat();
        ruudukko = new RuutuButton[leveys][korkeus];
        for (int i = 0; i < leveys; i++) {
            for (int j = 0; j < korkeus; j++) {
                ruudukko[i][j] = new RuutuButton(sudokukartat.getValmiskartta()[i][j], sudokukartat.getAloitukartta()[i][j]); //luodaan ruudut
            }
        }
    }

    public boolean valmis() {
        for (RuutuButton[] ruutus : ruudukko) {
            for (RuutuButton ruutu : ruutus) {
                if (!ruutu.getTarkistetu()) {
                    return true;
                }

            }
        }
        return false;
    }

    //tutkii ja lukistee ruudut jotak on oiken painettaessa Tarkista nappulaa
    public void tarkista() {
        for (RuutuButton[] ruutus : ruudukko) {
            for (RuutuButton ruutu : ruutus) {
                ruutu.tartkista();
            }
        }
    }

    //Ruudukkon graafista käyttöliitymää käytettäsessa tarvittava metodi joka kautta päästään käsiksi Buttomeihen
    public RuutuButton[][] getRuudukko() {
        return ruudukko;
    }

    public int getKorkeus() {
        return korkeus;
    }

    public int getLeveys() {
        return leveys;
    }
}
