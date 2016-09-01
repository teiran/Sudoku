/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokungeneroiti;

import java.util.ArrayList;

/**
 *
 * @author tiera
 */
public class Sudokugene {

    private int[][] generoitavaruudukko;
    /**
     * generoi puutuvat numerot joko ratkaistavissa olevasta sudokusta tai täysin tyhjästä.
     * 
     * @param aloitusnumerot int[][] aloitus ruudukko jos täysin tyhjä (kaikki numerot 0) silloin generoi täysin tyhjästä, voi olla myös ratkaistavissaa oleva sudoku jonka tämä ratkaisee.
     * 
     */
    public Sudokugene(int[][] aloitusnumerot) {
        generoitavaruudukko = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                generoitavaruudukko[i][j] = aloitusnumerot[i][j];
            }
        }
        boolean y = backtrack(0, 0);
        
        
    }
    
    /**
     * Käyttää backtrack algorytmiä (luin käytännöstä wikikipediasta perus toiminnan) sudokun ratkaisemiseen.
     * 
     * @param x int aloitus ruutu x-akselilla.
     * 
     * @param y int aloitus ruutu y-akselilla.
     * 
     * @return palauttaa true jos tähän ruutuu pystyy sudokun sääntöjen mukaan laittamaan jonkin numeron (kättää rekursiota).
     * 
     */
    private boolean backtrack(int x, int y) {
        int x2;
        int y2;
        if (x == 8 && y == 8) {
            if (generoitavaruudukko[8][8] != 0) {
                return true;
            }
            ArrayList<Integer> numerot = onkoRuutuoiken(x, y);
            if (numerot.isEmpty()) {
                return backtarckfaslse(x, y);
            }
            int t = numerot.remove(((int) (Math.random() * numerot.size())));
            generoitavaruudukko[x][y] = t;
            return true;

        } else if (y == 8) {
            x2 = x + 1;
            y2 = 0;
        } else {
            x2 = x;
            y2 = y + 1;
        }
        if (generoitavaruudukko[x][y] == 0) {
            ArrayList<Integer> numerot = onkoRuutuoiken(x, y);
            if (!numerot.isEmpty()) {
                int t = numerot.remove(((int) (Math.random() * numerot.size())));
                generoitavaruudukko[x][y] = t;
                boolean ta = backtrack(x2, y2);
                while (!ta) {
                    generoitavaruudukko[x][y] = 0;
                    if (!numerot.isEmpty()) {
                        t = numerot.remove(((int) (Math.random() * numerot.size())));
                        generoitavaruudukko[x][y] = t;
                        ta = backtrack(x2, y2);
                    } else {
                        return backtarckfaslse(x, y);
                    }
                }
            } else {
                return backtarckfaslse(x, y);
            }
            return true;
        } else {
            return backtrack(x2, y2);
        }

    }
    /**
     * jos backtark on väärin käyttää tätä.
     * 
     * @param x int
     * @param y int 
     * @return false
     */
    private boolean backtarckfaslse(int x, int y) {
        generoitavaruudukko[x][y] = 0;
        return false;
    }
    /**
     * tutkii x ja y perusteella mitä numeroita johonkin ruutuun voi laittaa, pelkästään ruudun säänöillä.
     * 
     * @param a int 0, 3 tai 6 riipuen siitä mitä 3*3 ruutua tutkitaan.
     * 
     * @param b int 0, 3 tai 6 riipuen siitä mitä 3*3 ruutua tutkitaan.
     * 
     * @return ArrayList<Integer> palauttaa listana sopivat numerot tähän ruutuun (x,y) on vai yksi ruutu.
     * 
     */
    private ArrayList<Integer> onkoRuutu(int a, int b) {
        ArrayList<Integer> numerot = new ArrayList<>();
        for (int j = a; j < a + 3; j++) {
            for (int k = b; k < b + 3; k++) {
                if (generoitavaruudukko[j][k] != 0) {
                    numerot.add(generoitavaruudukko[j][k]);
                }

            }
        }
        return numerot;
    }
    /**
     * Tutukii rivin, sarakkeen ja ruudun kautta mitkä ruudut sopii tiettyyn ruutuun.
     * 
     * @param x int paikka ruutu x-akselilla. 
     * @param y int paikka ruutu y-akselilla.
     * @return ArrayList<Integer> palauttaa listana sopivat numerot mitkä sopivat senhetken perusteella siihen ruutuun.
     */
    private ArrayList<Integer> onkoRuutuoiken(int x, int y) {
        ArrayList<Integer> numerot = new ArrayList<>();
        if (x >= 0 && x <= 2) {
            if (y >= 0 && y <= 2) {
                numerot = onkoRuutu(0, 0);
            } else if (y >= 3 && y <= 5) {
                numerot = onkoRuutu(0, 3);
            } else if (y >= 6 && y <= 8) {
                numerot = onkoRuutu(0, 6);
            }
        } else if (x >= 3 && x <= 5) {
            if (y >= 0 && y <= 2) {
                numerot = onkoRuutu(3, 0);
            } else if (y >= 3 && y <= 5) {
                numerot = onkoRuutu(3, 3);
            } else if (y >= 6 && y <= 8) {
                numerot = onkoRuutu(3, 6);
            }
        } else if (x >= 6 && x <= 8) {
            if (y >= 0 && y <= 2) {
                numerot = onkoRuutu(6, 0);
            } else if (y >= 3 && y <= 5) {
                numerot = onkoRuutu(6, 3);
            } else if (y >= 6 && y <= 8) {
                numerot = onkoRuutu(6, 6);
            }
        }
        for (int j = 0; j < 9; j++) {
            if (generoitavaruudukko[x][j] != 0) {
                numerot.add(generoitavaruudukko[x][j]);
            }
        }
        for (int j = 0; j < 9; j++) {
            if (generoitavaruudukko[j][y] != 0) {
                numerot.add(generoitavaruudukko[j][y]);
            }
        }
        ArrayList<Integer> numerot2 = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            boolean h = true;
            for (Integer integer : numerot) {
                if (i == integer) {
                    h = false;
                    break;
                }
            }
            if (h) {
                numerot2.add(i);
            }
        }
        return numerot2;

    }
    /**
     * @return int[][] palauttaa täytetyn sudoku ruudukon.
     * 
     */
    public int[][] getGeneroitavaruudukko() {
        return generoitavaruudukko;
    }
    
}
