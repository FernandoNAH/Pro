/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javfer;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Fer
 */

    
    public class VentanaBotonEscuchador  extends JFrame implements ActionListener{
    JPanel panelBoton;
    JLabel etiqueta;
    JButton boton;
    
    public VentanaBotonEscuchador(){
        etiqueta = new JLabel();
        panelBoton = new JPanel();
        boton = new JButton("Pulsa aqui");
        panelBoton.add(boton);
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(etiqueta,"North");
         this.getContentPane().add(panelBoton,"South");
         
      
         this.setSize(300,100);
         this.setTitle("Ejemplo  2");
       
         this.setTitle("ejemplo 2");
           this.show();
         
    }
    @Override
    public void actionPerformed(ActionEvent e){
        etiqueta.setText("Boton Pulsado"+ new Date());
    }
    
     
    public static void main(String[] args){
        new VentanaBotonEscuchador();
    }
    
}

