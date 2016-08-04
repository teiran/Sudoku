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
public class Valmiitkartat {

    private int[][] valmiskartta;
    private int[][] aloitukartta;

    public Valmiitkartat() {
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

        kartta1();

    }

    public int[][] getValmiskartta() {
        return valmiskartta;
    }

    public int[][] getAloitukartta() {
        return aloitukartta;
    }

    private void lisaanumerov(int t, int x, int y) {
        valmiskartta[x][y] = t;
    }

    private void lisaanumeroa(int t, int x, int y) {
        aloitukartta[x][y] = t;
    }

    private void lisaanumero(int t, int x, int y, boolean onko) {
        if (onko) {
            lisaanumeroa(t, x, y);
        }
        lisaanumerov(t, x, y);
    }

    private void lisaa(String k) {
        char[] h = k.toCharArray();
        lisaanumero(Integer.parseInt("" + h[0]), Integer.parseInt("" + h[1]), Integer.parseInt("" + h[2]), 't' == h[3]);
    }

    private void kartta1() { //https://en.wikipedia.org/wiki/Sudoku#/media/File:Sudoku-by-L2G-20050714_solution.svg
        lisaanumero(5, 0, 0, true);
        lisaanumero(3, 1, 0, true);
        lisaanumero(4, 2, 0, false);
        lisaanumero(6, 3, 0, false);
        lisaanumero(7, 4, 0, true);
        lisaanumero(8, 5, 0, false);
        lisaanumero(9, 6, 0, false);
        lisaanumero(1, 7, 0, false);
        lisaanumero(2, 8, 0, false);

        lisaanumero(6, 0, 1, true);
        lisaanumero(7, 1, 1, false);
        lisaanumero(2, 2, 1, false);
        lisaanumero(1, 3, 1, true);
        lisaanumero(9, 4, 1, true);
        lisaanumero(5, 5, 1, true);
        lisaanumero(3, 6, 1, false);
        lisaanumero(4, 7, 1, false);
        lisaanumero(8, 8, 1, false);

        lisaanumero(1, 0, 2, false);
        lisaanumero(9, 1, 2, true);
        lisaanumero(8, 2, 2, true);
        lisaanumero(3, 3, 2, false);
        lisaanumero(4, 4, 2, false);
        lisaanumero(2, 5, 2, false);
        lisaanumero(5, 6, 2, false);
        lisaanumero(6, 7, 2, true);
        lisaanumero(7, 8, 2, false);

        lisaanumero(8, 0, 3, true);
        lisaanumero(5, 1, 3, false);
        lisaa("923f");
        lisaa("733f");
        lisaa("643t");
        lisaa("153f");
        lisaa("463f");
        lisaa("273f");
        lisaa("383t");

        lisaa("404t");
        lisaa("214f");
        lisaa("624f");
        lisaa("834t");
        lisaa("544f");
        lisaa("354t");
        lisaa("764f");
        lisaa("974f");
        lisaa("184t");

        lisaa("705t");
        lisaa("115f");
        lisaa("325f");
        lisaa("935f");
        lisaa("245t");
        lisaa("455f");
        lisaa("865f");
        lisaa("575f");
        lisaa("685t");

        lisaa("906f");
        lisaa("616t");
        lisaa("126f");
        lisaa("536f");
        lisaa("346f");
        lisaa("756f");
        lisaa("266t");
        lisaa("876t");
        lisaa("486f");

        lisaa("207f");
        lisaa("817f");
        lisaa("727f");
        lisaa("437t");
        lisaa("147t");
        lisaa("957t");
        lisaa("667f");
        lisaa("377f");
        lisaa("587t");

        lisaa("308f");
        lisaa("418f");
        lisaa("228f");
        lisaa("238f");
        lisaa("848t");
        lisaa("658f");
        lisaa("168f");
        lisaa("778t");
        lisaa("988t");

    }

}
