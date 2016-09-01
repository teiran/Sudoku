package kayttoliityma;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author tiera
 */
public class AloitusLisener implements ActionListener {
    private Aloitusnappula k;
    
    /**
     * @param k on linkki nappulaan Aloitusnappula. 
     */
    public AloitusLisener(Aloitusnappula k) {
        this.k = k;
    }
    
    /**
     * actionPerformed on millä kutsua aloitusnappulan setsudoku.
     * 
     * @param e on ActionEvent 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (true) {
            k.setsudoku();
        }
    }

    
    
  
    
}
