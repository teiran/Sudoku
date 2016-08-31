/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokunGeneroiti;

/**
 *
 * @author tiera
 */
public class PoistaNumeroita {

    private int i;
    private int[][] aloituskartta;
    private int[][] lopetuskartta;

    public PoistaNumeroita(int i) {
        this.i = i;
        aloituskartta = new int[9][9];
        lopetuskartta = new int[9][9];
        Sudokugene gene = new Sudokugene();
        aloituskartta = gene.getLopetusruudukko();
        int x = ((int) (Math.random() * 9));
        int y = ((int) (Math.random() * 9));
        int numeroidenmaara = laskenumeroidenmaara();
        int voikoenaapoistaanumeroita = 0;
        boolean ehto = true; 
        while (ehto) {
            if (aloituskartta[x][y] == 0) {
                x = ((int) (Math.random() * 9));
                y = ((int) (Math.random() * 9));
            } else {
                int[][] t = aloituskartta.clone();
                t[x][y] = 0;
                boolean s = gene.voikoratkaista(aloituskartta, t);
                if (s) {
                    lopetuskartta = t;
                    numeroidenmaara = laskenumeroidenmaara();
                    voikoenaapoistaanumeroita = 0;
                } else {
                    voikoenaapoistaanumeroita++;
                }
            }
            ehto = (numeroidenmaara < i)||(voikoenaapoistaanumeroita <150);
        }

    }
    
    private int laskenumeroidenmaara(){
        int y = 0;
        for (int j = 0; j < 9; j++) {
            for (int k = 0; k < 9; k++) {
                if (lopetuskartta[j][k] != 0) {
                    y++;
                }
            }
        }
        return y;
    }

    public int[][] getAloituskartta() {
        return aloituskartta;
    }

    public int[][] getLopetuskartta() {
        return lopetuskartta;
    }
    
    

}
