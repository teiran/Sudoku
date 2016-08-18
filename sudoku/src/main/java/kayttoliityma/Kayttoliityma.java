/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kayttoliityma;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import sovellusLogiikka.Ruudukko;

/**
 *
 * @author tiera
 */
public class Kayttoliityma implements Runnable {

    private JFrame frame;
    private final Ruudukko taulukko;
    private TarkistusButton tarkista;

    public Kayttoliityma(Ruudukko r) {
        this.taulukko = r;
    }

    @Override
    public void run() {
        frame = new JFrame("Sudoku");
        frame.setPreferredSize(new Dimension(1000, 1000));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luokomponentti(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);

    }

    private void luokomponentti(Container container) {
        frame.setLayout(new GridLayout(10, 10));
        for (int i = 0; i < taulukko.getKorkeus(); i++) {
            for (int j = 0; j < taulukko.getLeveys(); j++) {
                RuutuButton s = taulukko.getRuudukko()[i][j];
                s.addKeyListener(new SuodokuruudunKeyKuuntelija(s));
                SudokuruudunKuutelija n = new SudokuruudunKuutelija(s);
                s.addActionListener(n);
                container.add(s);
            }

        }

        tarkista = new TarkistusButton(taulukko);
        tarkista.addActionListener(new Tarkistalisener(tarkista));
        container.add(tarkista);

    }

}
