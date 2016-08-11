/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kayttoliityma;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import sovellusLogiikka.Ruudukko;
import sovellusLogiikka.Ruutu;

/**
 *
 * @author tiera
 */
public class Kayttoliityma implements Runnable {

    private JFrame frame;
    private int leveys;
    private int korkeus;
    private Ruudukko taulukko;

    public Kayttoliityma(int leveys, int korkeus) {
        this.leveys = leveys;
        this.korkeus = korkeus;
        this.taulukko = new Ruudukko();
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
        frame.setLayout(new GridLayout(9, 9));
        for (int i = 0; i < korkeus; i++) {
            for (int j = 0; j < leveys; j++) {
                Ruutunappulat s = taulukko.getRuudukko()[i][j].getK();
                s.addKeyListener(new Nappaimistonkuuntelijat(s));
                Napinkuuntelija n = new Napinkuuntelija(s);
                s.addActionListener(n);
                frame.add(s);
            }

        }

    }

    public JFrame getFrame() {
        return frame;
    }

}
