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
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Alex
 */
public class CenterPanel extends JPanel{
    /*
    Clase que herada de JPanel. Almacena los botones para la selección de descuentos.
    Cuenta con métodos para desmarcar los botones de selección de descuentos y verificación
    de la selección en los mismos.
    */
    private JCheckBox cbPago;
    private JCheckBox cbPublico;
    private JCheckBox cbCuenta;
    
    public CenterPanel(){
        setLayout(new GridLayout(2, 2));
        TitledBorder border = BorderFactory.createTitledBorder("Descuentos");
        
        // Borde
        border.setTitleColor(Color.BLUE);
        setBorder(border);
        
        // CheckBox
        cbPago = new JCheckBox("Pronto Pago");
        cbPublico = new JCheckBox("Servicio Público");
        cbCuenta = new JCheckBox("Traslado de Cuenta");
        
        add(cbPago);
        add(cbPublico);
        add(cbCuenta);
    }
    
    public boolean isProntoPago(){
        return cbPago.isSelected();
    }
    
    public boolean isPublico(){
        return cbPublico.isSelected();
    }
    
    public boolean isTraslado(){
        return cbCuenta.isSelected();
    }
    
    public void unselectButtons() {
        cbPago.setSelected(false);
        cbCuenta.setSelected(false);
        cbPublico.setSelected(false);
    }
}
