/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Alex
 */
public class BottomPanel extends JPanel{
    private JTextField txtTotal;
    private JLabel labTotal;
    
    private JButton butLimpiar;
    private JButton butCalcular;
    
    public BottomPanel(){
        setLayout(new GridLayout(2, 3));
        setPreferredSize(new Dimension(0, 65));
                
        // Borde
        TitledBorder border = BorderFactory.createTitledBorder("Resultados");
        border.setTitleColor(Color.BLUE);
        setBorder(border);
        
        // 
        labTotal = new JLabel("Total a pagar");
        txtTotal = new JTextField();
        
        butLimpiar = new JButton("Limpiar");
        butCalcular = new JButton("Calcular");
        
        add(labTotal);
        add(txtTotal);
        add(butLimpiar);
        add(butCalcular);
    }
}
