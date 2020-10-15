/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_3_1;

import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import javax.swing.*;

/**
 *
 * @author Fer
 */
  class EscuchadorBoton implements ActionListener{
    JLabel etiqueta;
    
    public EscuchadorBoton(JLabel etiq){
        this.etiqueta =etiq;
        
    }
    public void actionPerformed(ActionEvent e){
         etiqueta.setText("Boton Pulsado"+ new Date());
         
    }
    
    
}
public class VentanaBoton  extends JFrame{
    JPanel panelBoton;
    JLabel etiqueta;
    JButton boton;
    
    public VentanaBoton(){
        etiqueta = new JLabel();
        panelBoton = new JPanel();
        boton = new JButton("Pulsa aqui");
        panelBoton.add(boton);
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(etiqueta,"North");
         this.getContentPane().add(panelBoton,"South");
         EscuchadorBoton escuchador = new
           EscuchadorBoton(etiqueta);
         boton.addActionListener(escuchador);
         this.setSize(300,100);
         this.setTitle("Ejemplo");
         this.show();
         
         
    }
    public static void main(String[] args){
        new VentanaBoton();
    }
    
}