/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin23;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author ped90
 */
public class Ventana1 {
        private JFrame marco;
    private JPanel panel1, panel2;
    private JLabel nombre,contra;
    private JTextField areaTexto1;
    private JTextArea areaTexto2;
    private JPasswordField contraseña;
    private JButton pulsar, limpiar, boton;
    private JList<String> lista;
    private String nombres[]= {"ElementoLista1","ElementoLista2" ,"ElementoLista3"};  
    public Ventana1() {

    }

    public void verVentana() {
        marco = new JFrame("Boletin23");
        marco.setLayout(null);
        marco.setSize(400, 600);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setSize(300, 250);
        panel1.setLocation(50,25);
        panel1.setBorder(BorderFactory.createLineBorder(Color.red, 2));
        
        
        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setSize(300,250);
        panel2.setLocation(50,300);
        panel2.setBorder(BorderFactory.createLineBorder(Color.red, 2));
        
        
        nombre = new JLabel("Nombre");
        contra = new JLabel("Contraseña");
        nombre.setSize(100, 20);
        nombre.setLocation(20,20);
        contra.setSize(100, 20);
        contra.setLocation(20,50);
        panel1.add(nombre);
        panel1.add(contra);
        
        
        areaTexto1 = new JTextField("Nombre");
        areaTexto1.setSize(100, 20);
        areaTexto1.setLocation(170, 20);
        panel1.add(areaTexto1);
        
        
        contraseña = new JPasswordField("Contraseña");
        contraseña.setSize(100, 20);
        contraseña.setLocation(170,50);
        panel1.add(contraseña);
        
        
        pulsar = new JButton("Pulsar");
        pulsar.setSize(100,20);
        pulsar.setLocation(35,200);
        
        limpiar = new JButton("Limpiar");
        limpiar.setSize(100,20);
        limpiar.setLocation(165,200);
        panel1.add(pulsar);
        panel1.add(limpiar);
        
       
        lista = new JList<>(nombres);
        lista.setSize(119, 100);
        lista.setLocation(5,50);
        lista.setBorder(BorderFactory.createLineBorder(Color.red, 1));
        panel2.add(lista);
        
        
        boton = new JButton("Boton");
        boton.setSize(76,20);
        boton.setLocation(140,100);
        panel2.add(boton);
        
        
        areaTexto2 = new JTextArea();
        areaTexto2.setSize(60, 100);
        areaTexto2.setLocation(230, 50);
        areaTexto2.setBorder(BorderFactory.createLineBorder(Color.red, 1));
        panel2.add(areaTexto2);
        
        
        marco.add(panel1);
        marco.add(panel2);
        marco.setVisible(true);
    }
}
    

