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
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Alex
 */
public class TopPanel extends JPanel{
    
    public TopPanel(){
        setLayout(new GridLayout(5, 2));
        setPreferredSize(new Dimension(0, 130));
        TitledBorder border = BorderFactory.createTitledBorder("Datos del Vehículo");
        border.setTitleColor(Color.BLUE);
        setBorder(border);
        
    }
}
