/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kayttoliityma;

import javax.swing.JButton;
import sovelluslogiikka.Ruudukko;
/**
 * @author tiera
 */
public class Aloitusnappula extends JButton {
    private Ruudukko k;
    private int g;
    /**
     * @param k ruudukko johon muokataan sopiva sudoku, g mukaa.
     * 
     * @param g arvot 0-4 määrittää millaisen sudokun nappulaa painamalla generoidaan.
     */
    public Aloitusnappula(Ruudukko k, int g) {
        this.k = k;
        this.g = g;
        switch (g) {
            case 0:
                this.setText("GeneroituSudoku");
                break;
            case 1:
                this.setText("Vaikeasudokugeneroitu");
                break;
            case 2:
                this.setText("helpposudokugeneroitu");
                break;
            case 3: 
                this.setText("vaikeasudoku");
                break;
            case 4:
                this.setText("helpohkosudoku");
                break;
            default:
                break;
        }
    }
    /**
     * aloituslisenerille metodi millä se pystyy kutsumaan ruudukossa olevaa metodia ja
     * nappia painamalla ruutua lisener pysyy suorittamaan tämän toiminnon
     * kutsuu setSudokua (ruudukosta) ja tätä metodia kutsuu aloituslisenerin actionPerformed.
     * 
     */
    public void setsudoku() {
        k.setSudoku(g);
    }

    
    
}
