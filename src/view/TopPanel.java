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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Alex
 */
public class TopPanel extends JPanel{
    private JTextField txtMarca;
    private JTextField txtLinea;
    private JTextField txtModelo;
    private JTextField txtValor;
    
    private JLabel labMarca;
    private JLabel labLinea;
    private JLabel labModelo;
    private JLabel labValor;
    
    
    public TopPanel(){
        // Forma
        setLayout(new GridLayout(5, 2));
        setPreferredSize(new Dimension(0, 130));
        
        // Borde
        TitledBorder border = BorderFactory.createTitledBorder("Datos del Vehículo");
        border.setTitleColor(Color.BLUE);
        setBorder(border);
        
        // Labels y etiquetas de texto
        labMarca = new JLabel("Marca");
        labLinea = new JLabel("Línea");
        labModelo = new JLabel("Modelo");
        labValor = new JLabel("Valor");
        
        txtMarca = new JTextField();
        txtLinea = new JTextField();
        txtModelo = new JTextField();
        txtValor = new JTextField();
        
        txtValor.setEditable(false);
        txtValor.setForeground(Color.BLUE);
        txtValor.setBackground(Color.WHITE);
        
        
        // Adición de los componentes a la malla
        add(labMarca);
        add(txtMarca);
        add(labLinea);
        add(txtLinea);
        add(labModelo);
        add(txtModelo);
        add(labValor);
        add(txtValor);
         
    }
}
