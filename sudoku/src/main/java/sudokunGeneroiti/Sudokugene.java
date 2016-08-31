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

    private int[][] ruudukko;
    private int xx;
    private int yy;

    public Sudokugene() {
        ruudukko = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                ruudukko[i][j] = 0;
            }
        }
        xx = 0;
        yy = 0;
        boolean y = bactrack(xx, yy);
        while (!y) {
            if (xx == 8) {
                if (yy == 8) {
                    System.out.println("ei voi ratkaista");
                    break;
                }
                xx = 0;
                yy += 1;
            } else {
                xx++;
            }
            y = bactrack(xx, yy);
        }

    }

    private boolean bactrack(int x, int y) {
        int x2;
        int y2;
        if (x == 8 && y == 8) {
            if (xx == 0 && yy == 0) {
                ArrayList<Integer> numerot = onkoRuutuoiken(x, y);
                int t = numerot.remove(((int) (Math.random()*numerot.size())));
                ruudukko[x][y] = t;
                return true;
            } else {
                x2 = 0;
                y2 = 0;
            }
        } else if (y == 8) {
            x2 = x + 1;
            y2 = 0;
        } else {
            x2 = x;
            y2 = y + 1;
        }
        if (ruudukko[x][y] == 0) {
            ArrayList<Integer> numerot = onkoRuutuoiken(x, y);
            if (!numerot.isEmpty()) {
                int t = numerot.remove(((int) (Math.random()*numerot.size())));
                ruudukko[x][y] = t;
                boolean ta = bactrack(x2, y2);
                while (!ta) {
                    if (!numerot.isEmpty()) {
                        t = numerot.remove(((int) (Math.random()*numerot.size())));
                        ruudukko[x][y] = t;
                        ta = bactrack(x2, y2);
                    } else {
                        ruudukko[x][y] = 0;
                        return false;
                    }
                }
            } else {
                ruudukko[x][y] = 0;
                return false;
            }
            return true;
        } else {
            return bactrack(x2, y2);
        }

    }

    private ArrayList<Integer> onkoRuutu(int a, int b) {
        ArrayList<Integer> numerot = new ArrayList<>();
        for (int j = a; j < a + 3; j++) {
            for (int k = b; k < b + 3; k++) {
                if (ruudukko[j][k] != 0) {
                    numerot.add(ruudukko[j][k]);
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
            if (ruudukko[x][j] != 0) {
                numerot.add(ruudukko[x][j]);
            }
        }
        for (int j = 0; j < 9; j++) {
            if (ruudukko[j][y] != 0) {
                numerot.add(ruudukko[j][y]);
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

    public int[][] getRuudukko() {
        return ruudukko;
    }

}
