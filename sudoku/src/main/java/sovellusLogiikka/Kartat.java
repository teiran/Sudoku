/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellusLogiikka;


import sudokunGeneroiti.Sudokugene;
/**
 *
 * @author tiera
 */
public class Kartat {

    private int[][] valmiskartta;
    private int[][] aloitukartta;

    public Kartat() {
        valmiskartta = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                valmiskartta[i][j] = 10;
            }
        }
        aloitukartta = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                aloitukartta[i][j] = 10;
            }
        }
        //Valmiitkartat k = new Valmiitkartat();
        Sudokugene k = new Sudokugene();
        aloitukartta = k.getRuudukko();
        valmiskartta = k.getRuudukko();
        
        
    }

    public int[][] getAloitukartta() {
        return aloitukartta;
    }

    public int[][] getValmiskartta() {
        return valmiskartta;
    }
    
    
}
