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
public class Kartat {

    private int[][] valmiskartta;
    private int[][] aloitukartta;
    /**
     * sovellus logiikan luokka mikä generoi tai kusuu valmiita sudokuja
     * 
     * @param q int 0-4 jonka perusteella konstuktori päättää mitä sudokua kutsutaan
     */
    public Kartat(int q) {
        valmiskartta = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                valmiskartta[i][j] = 10;
            }
        }
        aloitukartta = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                aloitukartta[i][j] = 0;
            }
        }
        switch (q) {
            case 0:
                {
                    Sudokugene k = new Sudokugene(aloitukartta);
                    int[][] e = new int[9][9];
                    for (int i = 0; i < 9; i++) {
                        for (int j = 0; j < 9; j++) {
                            e[i][j] = k.getGeneroitavaruudukko()[i][j];
                        }
                    }
                    PoistaNumeroita k1 = new PoistaNumeroita(20, e, 40);
                    aloitukartta = k1.getAloituskartta();
                    valmiskartta = k1.getValmiskarratta();
                    break;
                }
            case 1:
                {
                    Vaikeasudoku k3 = new Vaikeasudoku(2);
                    int[][] y = new int[9][9];
                    for (int i = 0; i < 9; i++) {
                        for (int j = 0; j < 9; j++) {
                            y[i][j] = k3.getAloitukartta()[i][j];
                        }
                    }
                    Sudokugene k = new Sudokugene(y);
                    int[][] e = new int[9][9];
                    for (int i = 0; i < 9; i++) {
                        for (int j = 0; j < 9; j++) {
                            e[i][j] = k.getGeneroitavaruudukko()[i][j];
                        }
                    }
                    PoistaNumeroita k1 = new PoistaNumeroita(20, e, 40);
                    aloitukartta = k1.getAloituskartta();
                    valmiskartta = k1.getValmiskarratta();
                    break;
                }
            case 2:
                {
                    Vaikeasudoku k3 = new Vaikeasudoku(3);
                    int[][] y = new int[9][9];
                    for (int i = 0; i < 9; i++) {
                        for (int j = 0; j < 9; j++) {
                            y[i][j] = k3.getAloitukartta()[i][j];
                        }
                    }
                    Sudokugene k = new Sudokugene(y);
                    PoistaNumeroita k1 = new PoistaNumeroita(20, k.getGeneroitavaruudukko(), 40);
                    aloitukartta = k1.getAloituskartta();
                    valmiskartta = k1.getValmiskarratta();
                    break;
                }
            case 3:
                {
                     Vaikeasudoku k3 = new Vaikeasudoku(3);
                    int[][] y = new int[9][9];
                    for (int i = 0; i < 9; i++) {
                        for (int j = 0; j < 9; j++) {
                            y[i][j] = k3.getAloitukartta()[i][j];
                        }
                    }
                    Sudokugene k = new Sudokugene(y);
                    aloitukartta = k3.getAloitukartta();
                    valmiskartta = k.getGeneroitavaruudukko();
                    break;
                }
            case 4:
                {
                      Vaikeasudoku k3 = new Vaikeasudoku(2);
                    int[][] y = new int[9][9];
                    for (int i = 0; i < 9; i++) {
                        for (int j = 0; j < 9; j++) {
                            y[i][j] = k3.getAloitukartta()[i][j];
                        }
                    }
                    Sudokugene k = new Sudokugene(y);
                    aloitukartta = k3.getAloitukartta();
                    valmiskartta = k.getGeneroitavaruudukko();
                    break;
                }
            default:
                break;
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (aloitukartta[i][j] == 0) {
                    aloitukartta[i][j] = 10;
                }
            }
        }

    }
    /**
     * 
     * @return int[][] palauttaa sudokun jossa vain alussa olevat ruudut
     */
    public int[][] getAloitukartta() {
        return aloitukartta;
    }
    /**
     * 
     * @return int[][] palauttaa valmiin sudokun (lopputulos getAloituskartasta 
     */
    public int[][] getValmiskartta() {
        return valmiskartta;
    }

}
