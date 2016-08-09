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
public class Ruudukko {
    private Ruutu[][] ruudukko;
    private final int leveys = 9;
    private final int korkeus = 9;
    private Valmiitkartat sudokukartat;

    public Ruudukko() {
        sudokukartat = new Valmiitkartat();
        ruudukko = new Ruutu[leveys][korkeus];
        for (int i = 0; i < leveys; i++) {
            for (int j = 0; j < korkeus; j++) {
                ruudukko[i][j] = new Ruutu(sudokukartat.getValmiskartta()[i][j]);
            }
        }
    }


    
    public String toString(){
        String k = "";
        for (int i = 0; i < leveys; i++) {
            for (int j = 0; j < korkeus; j++) {
                k +=  sudokukartat.getValmiskartta()[j][i]+" ";
            }
            k += "\n";   
        }
        return k;
    }
    
    
    
}
