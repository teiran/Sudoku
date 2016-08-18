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
    private final int leveys;
    private final int korkeus;
    private final Ruudukko taulukko;
    private TarkistusButtom tarkista;

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
        tarkista = new TarkistusButtom(taulukko);
        tarkista.addActionListener(new Tarkistalisener(tarkista));
        frame.add(tarkista);

        frame.pack();
        frame.setVisible(true);

        
        

    }

    private void luokomponentti(Container container) {
        frame.setLayout(new GridLayout(10, 10));
        for (int i = 0; i < korkeus; i++) {
            for (int j = 0; j < leveys; j++) {
                RuutuButtom s = taulukko.getRuudukko()[i][j].getButtom();
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
