/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellusLogiikka;

import java.util.ArrayList;

/**
 *
 * @author tiera
 */
public class OnkoRuutuoiken {

    private int[][] ruudut;

    public OnkoRuutuoiken(int[][] ruudut) {
        this.ruudut = ruudut;
    }

    public ArrayList<Integer> onkoRiviOiken(int x) {
        ArrayList<Integer> numerot = new ArrayList<>();
        for (int j = 0; j < 9; j++) {
            if (ruudut[x][j] != 0) {
                numerot.add(ruudut[x][j]);
            }
        }
        return numerot;
    }

    public ArrayList<Integer> onkoSarakeOiken(int y) {
        ArrayList<Integer> numerot = new ArrayList<>();
        for (int j = 0; j < 9; j++) {
            if (ruudut[j][y] != 0) {
                numerot.add(ruudut[j][y]);
            }
        }
        return numerot;
    }

    public ArrayList<Integer> onkoRuutu(int a, int b) {
        ArrayList<Integer> numerot = new ArrayList<>();
        for (int j = a; j < a + 3; j++) {
            for (int k = b; k < b + 3; k++) {
                if (ruudut[j][k] != 0) {
                    numerot.add(ruudut[j][k]);
                }

            }
        }
        return numerot;
    }

    public ArrayList<Integer> onkoRuutuoiken(int x, int y) {
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
            } else if (y >= 6 && y >= 8) {
                numerot = onkoRuutu(6, 6);
            }
        }
        return numerot;
    }
}
