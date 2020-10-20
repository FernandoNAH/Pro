/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_3_3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaBotones extends JFrame implements ActionListener {

    JPanel panelBoton;
    JPanel panelEtiqueta;
    JLabel etiqueta;
    JButton boton;
    JButton boton2;
    JButton boton3;

    public VentanaBotones() {
        etiqueta = new JLabel();
        panelBoton = new JPanel();
        panelEtiqueta = new JPanel();
        boton = new JButton("Boton 1");
        boton2 = new JButton("Boton 2");
        boton3 = new JButton("Boton 3");
        panelEtiqueta.add(etiqueta);
        panelBoton.add(boton);
        panelBoton.add(boton2);
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(etiqueta, "North");
        this.getContentPane().add(panelBoton, "South");
        boton.addActionListener(this);
        boton2.addActionListener(this);
        boton3.addActionListener(this);

        this.setSize(300, 100);
        this.setTitle("Ejemplo 3");
        this.show();

   

    }

   
    public void actionPerformed(ActionEvent e) {
        
        JButton botonPulsado = (JButton)e.getSource();
        
        if(botonPulsado == boton){
            etiqueta.setText("Se a pulsado el boton1");
        }
        if(botonPulsado == boton){
            etiqueta.setText("Se a pulsado el boton2");
        }
        if(botonPulsado == boton){
            etiqueta.setText("Se a pulsado el boton3");
        }
        
        etiqueta.setText("Boton Pulsado" + new Date());
    }

    public static void main(String[] args) {
      //  new VentanaBotones();
    }

}
