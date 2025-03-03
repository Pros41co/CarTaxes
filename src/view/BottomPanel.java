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
import javax.swing.JOptionPane;
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
    
    private final static String LIMPIAR = "limpiar";
    private final static String CALCULAR = "calcular";
    
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
        txtTotal.setEditable(false);
        
        butLimpiar = new JButton("Limpiar");
        butLimpiar.setActionCommand(LIMPIAR);
        
        butCalcular = new JButton("Calcular");
        butCalcular.setActionCommand(CALCULAR);
        butCalcular.setEnabled(false);
        
        add(labTotal);
        add(txtTotal);
        add(butLimpiar);
        add(butCalcular);
    }
    
    public JButton getButLimpiar() {
        return butLimpiar;
    }
    
    public JButton getButCalcular() {
        return butCalcular;
    }
    
    public void setResult (String pago) {
        txtTotal.setText(pago);
    }
    
    public void cleanLabels() {
        txtTotal.setText("");
    }
    
    public void allowCalculate(){
        butCalcular.setEnabled(true);
    }    
}
