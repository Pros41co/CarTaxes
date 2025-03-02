/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Alex
 */
public class View extends JFrame {
    
    public View(){
        
        setTitle("Calculadora de Impuestos");
        setSize(290, 300);
        setResizable(false);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        TopPanel carPanel = new TopPanel();
        add(carPanel, BorderLayout.NORTH);
        
        CenterPanel discountPanel = new CenterPanel();
        add(discountPanel, BorderLayout.CENTER);
        
        BottomPanel resultPanel = new BottomPanel();
        add(resultPanel, BorderLayout.SOUTH);
    }
}
