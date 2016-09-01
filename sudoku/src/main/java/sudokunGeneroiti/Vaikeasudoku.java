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
public class Vaikeasudoku {

    private int[][] aloitukartta;
    /**
     * toimii tieto varastona muutamalle sudoku variaationa
     * 
     * @param k int joka kertoo millaisen ruudukon haluaa palautta
     */
    public Vaikeasudoku(int k) {
        aloitukartta = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                aloitukartta[i][j] = 0;
            }
        }
        if (k == 1) {
            kartta3();
        }
        if (k == 2) {
            kartta2();
        } else {
            kartta1();
        }

    }
    /**
     * 
     * @return palauttaa varastoidun ruudukon 
     */
    public int[][] getAloitukartta() {
        return aloitukartta;
    }
    /**
     * metodedi jolla helpompi oli kirjottaa sudoku ylös
     * 
     * @param t
     * @param y
     * @param x 
     */
    private void lisaanumeroa(int t, int y, int x) {
        aloitukartta[x][y] = t;
    }
    /**
     * metodedi jolla helpompi oli kirjottaa sudoku ylös
     * 
     * @param t
     * @param y
     * @param x 
     */
    private void lisaanumero(int t, int y, int x) {
        lisaanumeroa(t, x, y);
    }
    /**
     * metodedi jolla helpompi oli kirjottaa sudoku ylös
     * 
     * @param k 
     */
    private void lisaa(String k) {
        char[] h = k.toCharArray();
        lisaanumero(Integer.parseInt("" + h[0]), Integer.parseInt("" + h[1]), Integer.parseInt("" + h[2]));
    }
    
    private void kartta1() { //http://ristikkotuumin.fi/juh/sudoku/sudoku_21_hyvinvaikea.html
        lisaa("100");
        lisaa("404");
        lisaa("308");

        lisaa("413");
        lisaa("517");

        lisaa("622");
        lisaa("726");

        lisaa("331");
        lisaa("835");

        lisaa("540");
        lisaa("344");
        lisaa("248");

        lisaa("753");
        lisaa("657");

        lisaa("462");
        lisaa("866");

        lisaa("971");
        lisaa("175");

        lisaa("680");
        lisaa("584");
        lisaa("988");

    }

    private void kartta2() { //http://www.telegraph.co.uk/news/science/science-news/9359579/Worlds-hardest-sudoku-can-you-crack-it.html
        lisaa("800");

        lisaa("312");
        lisaa("613");

        lisaa("721");
        lisaa("924");
        lisaa("226");

        lisaa("531");
        lisaa("735");
        lisaa("444");
        lisaa("545");
        lisaa("746");

        lisaa("153");
        lisaa("357");

        lisaa("162");
        lisaa("667");
        lisaa("868");

        lisaa("872");
        lisaa("573");
        lisaa("177");

        lisaa("981");
        lisaa("486");
    }

    private void kartta3() { //https://en.wikipedia.org/wiki/Sudoku#/media/File:Sudoku-by-L2G-20050714_solution.svg
        lisaanumero(5, 0, 0);
        lisaanumero(3, 1, 0);
        lisaanumero(4, 2, 0);
        lisaanumero(6, 3, 0);
        lisaanumero(7, 4, 0);
        lisaanumero(8, 5, 0);
        lisaanumero(9, 6, 0);
        lisaanumero(1, 7, 0);
        lisaanumero(2, 8, 0);

        lisaanumero(6, 0, 1);
        lisaanumero(7, 1, 1);
        lisaanumero(2, 2, 1);
        lisaanumero(1, 3, 1);
        lisaanumero(9, 4, 1);
        lisaanumero(5, 5, 1);
        lisaanumero(3, 6, 1);
        lisaanumero(4, 7, 1);
        lisaanumero(8, 8, 1);

        lisaanumero(1, 0, 2);
        lisaanumero(9, 1, 2);
        lisaanumero(8, 2, 2);
        lisaanumero(3, 3, 2);
        lisaanumero(4, 4, 2);
        lisaanumero(2, 5, 2);
        lisaanumero(5, 6, 2);
        lisaanumero(6, 7, 2);
        lisaanumero(7, 8, 2);

        lisaanumero(8, 0, 3);
        lisaanumero(5, 1, 3);
        lisaa("923");
        lisaa("733");
        lisaa("643");
        lisaa("153");
        lisaa("463");
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
        lisaa("528f");
        lisaa("238f");
        lisaa("848t");
        lisaa("658f");
        lisaa("168f");
        lisaa("778t");
        lisaa("988t");

    }

    private void kartta2222() { // http://www.7sudoku.com/very-difficult sudoku väärin
        lisaa("502");
        lisaa("204");

        lisaa("810");
        lisaa("715");
        lisaa("416");
        lisaa("118");

        lisaa("621");
        lisaa("527");

        lisaa("131");
        lisaa("934");

        lisaa("741");
        lisaa("843");
        lisaa("345");
        lisaa("647");

        lisaa("754");
        lisaa("457");

        lisaa("561");
        lisaa("867");

        lisaa("470");
        lisaa("272");
        lisaa("973");
        lisaa("378");

        lisaa("384");
        lisaa("286");

    }
}
