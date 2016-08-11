package kayttoliityma;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import kayttoliityma.Ruutunappulat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tiera
 */
public class Napinkuuntelija implements ActionListener{
    private Ruutunappulat t;

    public Napinkuuntelija(Ruutunappulat t) {
        this.t = t;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        t.setAktiivisuus();
        System.out.println("asdasdas");
    }
    
}
