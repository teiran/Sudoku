/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokunGeneroiti;

import java.util.ArrayList;

/**
 *
 * @author tiera
 */
public class Sudokugene {

    private int[][] generoitavaruudukko;
    private int[][] alotusrudukko;
    private int[][] lopetusruudukko;

    public Sudokugene() {
        generoitavaruudukko = new int[9][9];
        alotusrudukko = new int[9][9];
        ;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                generoitavaruudukko[i][j] = 0;
                alotusrudukko[i][j] = 0;
            }
        }
        
        
        boolean y = bactrack(0, 0);
        lopetusruudukko = generoitavaruudukko;
        if (!y) {
            System.out.println("ei tarkaistavissa");
        }
        
    }
    public boolean voikoratkaista(int[][] valmis, int[][] kokeilu){
        generoitavaruudukko = kokeilu;
        boolean y = backtarckfaslse(0, 0);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (generoitavaruudukko[i][j] != valmis[i][j]) {
                    return false;
                }
            }
        }
        return y;
    }

    private boolean bactrack(int x, int y) {
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
                boolean ta = bactrack(x2, y2);
                while (!ta) {
                    generoitavaruudukko[x][y] = 0;
                    if (!numerot.isEmpty()) {
                        t = numerot.remove(((int) (Math.random() * numerot.size())));
                        generoitavaruudukko[x][y] = t;
                        ta = bactrack(x2, y2);
                    } else {
                        return backtarckfaslse(x, y);
                    }
                }
            } else {
                return backtarckfaslse(x, y);
            }
            return true;
        } else {
            return bactrack(x2, y2);
        }

    }

    private boolean backtarckfaslse(int x, int y) {
        generoitavaruudukko[x][y] = 0;
        return false;
    }

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

    public int[][] getAlotusrudukko() {
        return alotusrudukko;
    }

    public int[][] getGeneroitavaruudukko() {
        return generoitavaruudukko;
    }

    public int[][] getLopetusruudukko() {
        return lopetusruudukko;
    }
    
}
