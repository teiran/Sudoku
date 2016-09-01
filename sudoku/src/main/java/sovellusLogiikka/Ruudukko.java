/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellusLogiikka;

import sudokunGeneroiti.Kartat;
import kayttoliityma.RuutuButton;

/**
 *
 * @author tiera
 */
public class Ruudukko {

    private final RuutuButton[][] ruudukko;
    private final int leveys = 9;
    private final int korkeus = 9;
    private Kartat sudokukartat;
    private boolean t;
    /**
     * luo perus ruudukon  RuutuButton[][] ruudukko jonka ruudut tyhjiä
     */
    public Ruudukko() {
        ruudukko = new RuutuButton[leveys][korkeus];
        for (int i = 0; i < leveys; i++) {
            for (int j = 0; j < korkeus; j++) {
                ruudukko[i][j] = new RuutuButton(); //luodaan ruudut
            }
        }
        t = false;
    }

    /**
     * kutsuu Kartat(i) ja kopio kartoilta saatavan sudoku kartan itseensä
     * 
     * @param i int jonka perusteella kartat tietää minkälaisen kartan generoida
     */
    public void setSudoku(int i) {
        sudokukartat = new Kartat(i);
        for (int j = 0; j < leveys; j++) {
            for (int k = 0; k < korkeus; k++) {
                ruudukko[k][j].setsudoku(sudokukartat.getValmiskartta()[k][j], sudokukartat.getAloitukartta()[k][j]);
            }
        }
        t = true;
    }
    /**
     * tutkii onko sudoku valmis (ei käytössä mutta tulee olemaan tulevaisuudessa)
     * 
     * @return boolean onko sudokuvalmis
     */
    public boolean valmis() {
        if (t) {
            for (RuutuButton[] ruutus : ruudukko) {
                for (RuutuButton ruutu : ruutus) {
                    if (!ruutu.getTarkistetu()) {
                        return true;
                    }

                }
            }
            return false;
        }
        return true;
    }
    
    /**
     * ei käytössä mutta tulevaisuudessa tulee olemaan, tutkii onko koko sudokukartassa kaikissa ruuduissa numero
     * 
     * @return boolean  
     */

    private boolean saakotarkistaa() {
        if (t) {
            for (RuutuButton[] ruutuButtons : ruudukko) {
                for (RuutuButton ruutuButton : ruutuButtons) {
                    if (!ruutuButton.isArvaus()) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
    /**
     * tutkii ja lukistee ruudut jotak on oiken painettaessa Tarkista nappula
     * 
     * 
     */
    public void tarkista() {
        if (t) {
            if (saakotarkistaa()) {
                return;
            }
            for (RuutuButton[] ruutus : ruudukko) {
                for (RuutuButton ruutu : ruutus) {
                    ruutu.tartkista();
                }
            }
        }

    }
    /**
     * getteru ruudukolle jonka kautta käyttöliitymä pääsee käsiksi ruutuihin
     * @return RuutuButton[][]
     */
    //
    public RuutuButton[][] getRuudukko() {
        return ruudukko;
    }
    /**
     * tulevaisuutta ajatelle luotu korkeus ja leveys jos tulevaisuudees pystyisi generoimaan myös muita kun 9*9 sudokuja. 
     * tätä käyttää käyttö liitymä sudokungenerointi logiikka en vielä ulottanut tätä
     * @return int 9
     */
    public int getKorkeus() {
        return korkeus;
    }
    /**
     * tulevaisuutta ajatelle luotu korkeus ja leveys jos tulevaisuudees pystyisi generoimaan myös muita kun 9*9 sudokuja. 
     * tätä käyttää käyttö liitymä sudokungenerointi logiikka en vielä ulottanut tätä
     * @return int 9
     */
    public int getLeveys() {
        return leveys;
    }
}
