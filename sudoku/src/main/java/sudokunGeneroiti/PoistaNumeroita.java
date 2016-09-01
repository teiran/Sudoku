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

    private final int i;
    final private int[][] valmiskarratta;
    private int[][] aloituskartta;
    /**
     * poistaa valmiista sudokuruudukosta jossa kaikki numerot numeroita siten että se pystyy ratkaisemaan
     * @param i int haluttau määränumeroita joka jää jäljelle aloitus karttan
     * @param numerot int[][] sudokuruudukko jossa on kaikissa ruuduissa numero (valmis ruudukko ja oiken)
     * @param e int haluttu maksimi toisto määrä kerta, kun alussa on ratkaistu sudoku (sudokun säänöt pätee numeroissa) ja siitä kun lähdetään postamaan satunnaisesti(tosin nii että se on ratkaistavissa) numeroita niin ei voi koskaan päätyä tasan haluttuu aloitus numeroita varmasti
     */
    public PoistaNumeroita(int i, int[][] numerot, int e) {
        this.i = i;
        valmiskarratta = numerot;
        aloituskartta = new int[9][9];
        for (int j = 0; j < 9; j++) {
            for (int k = 0; k < 9; k++) {
                aloituskartta[j][k] = valmiskarratta[j][k];
            }
        }
        
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
                int[][] t= new int[9][9];
                for (int j = 0; j < 9; j++) {
                    for (int k = 0; k < 9; k++) {
                        t[j][k] = aloituskartta[j][k];
                    }
                }
                t[x][y] = 0;
                boolean ehto2 = voikoratkaista(t);
                if (ehto2) {
                    aloituskartta = t;
                    numeroidenmaara = laskenumeroidenmaara();
                    voikoenaapoistaanumeroita = 0;
                } else {
                   voikoenaapoistaanumeroita++;
                }
                
                  
            }
            ehto = (numeroidenmaara >=  i) && (voikoenaapoistaanumeroita < e);
        }

    }
    /**
     * tutkii voidaanko tästä välivaiheesta päätyä takaikaisin täysiin valmiiseen sudokuun
     * 
     * @param t int[][] välivaiheen versio aloitus sudoku kartasta 
     * @return boolean jos voidaan päätyä takaisin täställeen samaan ratkaistuun sudokuun true, muuten false
     */
    private boolean voikoratkaista(int[][] t){
        int[][]u = new int[9][9];
        for (int j = 0; j < 9; j++) {
            for (int k = 0; k < 9; k++) {
                u[j][k] = t[j][k];
            }
        }
        Sudokugene gene = new Sudokugene(u);
        int[][] r = gene.getGeneroitavaruudukko();
        for (int j = 0; j < 9; j++) {
            for (int k = 0; k < 9; k++) {
                if (r[j][k] != valmiskarratta[j][k]) {
                    return false;
                }
            }
        }
        return true;
    }
    /**
     * 
     * @return int välivaiheen sudokussa jäljellä olevien numeroiden määrä 
     */
    private int laskenumeroidenmaara(){
        int y = 0;
        for (int j = 0; j < 9; j++) {
            for (int k = 0; k < 9; k++) {
                if (aloituskartta[j][k] != 0) {
                    y++;
                }
            }
        }
        return y;
    }
    /**
     * 
     * @return int[][] palauttaa ratkaistavissa olevan sudonkun
     */
    public int[][] getAloituskartta() {
        return aloituskartta;
    }
    /**
     * 
     * @return palautta täysin valmiin sudonkun 
     */
    public int[][] getValmiskarratta() {
        return valmiskarratta;
    }

    
    
    

}
