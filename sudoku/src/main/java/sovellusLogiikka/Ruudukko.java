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
    private int x;
    private int y;
    private Valmiitkartat sudokukartat;

    public Ruudukko() {
        sudokukartat = new Valmiitkartat();
        x = 9;
        y = 9;
        ruudukko = new Ruutu[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                ruudukko[i][j] = new Ruutu(sudokukartat.getValmiskartta()[i][j]);
            }
        }
    }


    
    public String toString(){
        String k = "";
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                k +=  sudokukartat.getValmiskartta()[j][i]+" ";
            }
            k += "\n";   
        }
        return k;
    }
    
    
    
}
