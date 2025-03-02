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
public class CenterPanel extends JPanel{
    
    public CenterPanel(){
        setLayout(new GridLayout(2, 2));
        TitledBorder border = BorderFactory.createTitledBorder("Descuentos");
        border.setTitleColor(Color.BLUE);
        setBorder(border);
    }
}
