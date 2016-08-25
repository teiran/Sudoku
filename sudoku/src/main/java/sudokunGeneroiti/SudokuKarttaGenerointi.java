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
public class SudokuKarttaGenerointi {

    int[][] ruudut;

    public int[][] getRuudut() {
        return ruudut;
    }

    public SudokuKarttaGenerointi() {
        ruudut = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                ruudut[i][j] = 0;
            }
        }
        for (int i2 = 0; i2 < 9; i2++) {
            ArrayList<Integer> numerot = new ArrayList<>();
            for (int i = 1; i < 10; i++) {
                numerot.add(i);
            }
            if (i2 == 0) {
                for (int i = 0; i < 9; i++) {
                    ruudut[i2][i] = (numerot.remove(((int) (Math.random() * numerot.size()))));
                }
            } else {
                for (int i = 0; i < 9; i++) {
                    numerot = new ArrayList<>();
                    ArrayList<Integer> numerot2 = new ArrayList<>();
                    ArrayList<Integer> k = ruudunehdo(i2, i);
                    for (int j = 1; j < 10; j++) {
                        boolean t = true;
                        for (Integer integer : k) {
                            if (integer == j) {
                                t = false;
                                break;
                            }
                        }
                        if (t) {
                            numerot2.add(j);
                        }
                    }
                    if (!numerot2.isEmpty()) {
                        ruudut[i2][i] = (numerot2.get(((int) (Math.random() * numerot2.size()))));
                    }
                    
                }
            }

        }
        System.out.println(this);

    }

    private ArrayList<Integer> onkoRiviOiken(int i) {
        ArrayList<Integer> numerot = new ArrayList<>();
        for (int j = 0; j < 9; j++) {
            if (ruudut[i][j] != 0) {
                numerot.add(ruudut[i][j]);
            }
        }
        return numerot;
    }

    private ArrayList<Integer> onkoSarakeOiken(int i) {
        ArrayList<Integer> numerot = new ArrayList<>();
        for (int j = 0; j < 9; j++) {
            if (ruudut[j][i] != 0) {
                numerot.add(ruudut[j][i]);
            }
        }
        return numerot;
    }

    private ArrayList<Integer> onkoRuutuoiken(int i) {
        ArrayList<Integer> numerot = new ArrayList<>();
        int t = 0;
        if (i >= 0 && i <= 2) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    numerot.add(ruudut[j][k + 3 * i]);
                }
            }
        } else if (i >= 3 && i <= 5) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    numerot.add(ruudut[j + 3][k + 3 * (i - 3)]);
                }
            }
        } else if (i >= 6 && i <= 8) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    numerot.add(ruudut[j + 6][k + 3 * (i - 6)]);
                }
            }
        }
        return numerot;
    }

    private ArrayList<Integer> ruudunehdo(int x, int y) {
        ArrayList<Integer> k = onkoRiviOiken(x);
        ArrayList<Integer> k2 = onkoSarakeOiken(y);
        ArrayList<Integer> k3 = new ArrayList<>();
        if (y >= 0 && y <= 2 && x >= 0 && x <= 2) {
            k3 = onkoRuutuoiken(1);
        } else if (y >= 0 && y <= 2 && x >= 3 && x <= 5) {
            k3 = onkoRuutuoiken(2);
        } else if (y >= 0 && y <= 2 && x >= 6 && x <= 8) {
            k3 = onkoRuutuoiken(3);
        } else if (y >= 3 && y <= 5 && x >= 0 && x <= 2) {
            k3 = onkoRuutuoiken(4);
        } else if (y >= 3 && y <= 5 && x >= 3 && x <= 5) {
            k3 = onkoRuutuoiken(5);
        } else if (y >= 3 && y <= 5 && x >= 6 && x <= 8) {
            k3 = onkoRuutuoiken(6);
        } else if (y >= 6 && y <= 8 && x >= 0 && x <= 2) {
            k3 = onkoRuutuoiken(7); 
        } else if (y >= 6 && y <= 8 && x >= 3 && x <= 5) {
            k3 = onkoRuutuoiken(8);
        } else if (y >= 6 && y <= 8 && x >= 5 && x <= 8) {
            k3 = onkoRuutuoiken(9);
        }

        ArrayList<Integer> numerot = new ArrayList<>();
        for (Integer integer : k) {
            numerot.add(integer);
        }
        for (Integer integer : k2) {
            numerot.add(integer);
        }
        for (Integer integer : k3) {
            numerot.add(integer);
        }
        return numerot;
    }

    @Override
    public String toString() {
        String k = "";
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                k += ruudut[i][j] + "";
            }
            k += "\n";
        }
        return k;
    }

}
