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

    public Vaikeasudoku() {
        aloitukartta = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                aloitukartta[i][j] = 0;
            }
        }
    }

    public int[][] getAloitukartta() {
        return aloitukartta;
    }

    private void lisaanumeroa(int t, int y, int x) {
        aloitukartta[x][y] = t;
    }

    private void lisaanumero(int t, int x, int y) {
        lisaanumeroa(t, x, y);
    }

    private void lisaa(String k) {
        char[] h = k.toCharArray();
        lisaanumero(Integer.parseInt("" + h[0]), Integer.parseInt("" + h[1]), Integer.parseInt("" + h[2]));
    }
    
    private void kartta1(){ //http://ristikkotuumin.fi/juh/sudoku/sudoku_21_hyvinvaikea.html
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
}
