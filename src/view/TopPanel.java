/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.text.DecimalFormat;
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
public class TopPanel extends JPanel{
    private JTextField txtMarca;
    private JTextField txtLinea;
    private JTextField txtModelo;
    private JTextField txtValor;
    
    private JLabel labMarca;
    private JLabel labLinea;
    private JLabel labModelo;
    private JLabel labValor;
    
    private JButton butBuscar;
    
    private final static String BUSCAR = "buscar";
    
    
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
                
        // Botón buscar.
        butBuscar = new JButton("Buscar");
        butBuscar.setActionCommand(BUSCAR);
        
        
        
        // Adición de los componentes a la malla
        add(labMarca);
        add(txtMarca);
        add(labLinea);
        add(txtLinea);
        add(labModelo);
        add(txtModelo);
        add(labValor);
        add(txtValor);
        add(new JLabel(""));
        add(butBuscar);
         
    }
    
    public void setValor(String precio){
        txtValor.setText(String.valueOf(precio));
    }
    
    
    public String getMarca() {
        return txtMarca.getText().trim().toLowerCase();
    }
    
    public String getLinea() {
        return txtLinea.getText().trim().toLowerCase();
    }
    
    public int getModelo() {
        int modelo = 2000;
        try {
            String modeloText = txtModelo.getText().trim().toLowerCase();
            modelo = Integer.parseInt(modeloText);
        } catch (Exception e) {
            cleanLabels();
            JOptionPane.showMessageDialog(this, "Verificar que modelo sea un valor numérico",
                    "Error en el tipo de dato ingresado",
                    JOptionPane.ERROR_MESSAGE);
        }
        return modelo;
    }
    
    public String getValor() {
        return txtValor.getText();
    }
    
    public void cleanLabels() {
        txtModelo.setText("");
        txtLinea.setText("");
        txtMarca.setText("");
    }
    
    public JButton getButBuscar() {
        return butBuscar;
    }
    
    public void errorNotFound() {
        JOptionPane.showMessageDialog(this, "Vehículo no encontrado", "Not Found", JOptionPane.ERROR_MESSAGE);
    }
    

}
