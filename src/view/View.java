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
   private TopPanel carPanel;
   private CenterPanel discountPanel;
   private BottomPanel resultPanel;
    
    public View(){
        
        setTitle("Calculadora de Impuestos");
        setSize(350, 300);
        setResizable(false);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        carPanel = new TopPanel();
        add(carPanel, BorderLayout.NORTH);
        
        discountPanel = new CenterPanel();
        add(discountPanel, BorderLayout.CENTER);
        
        resultPanel = new BottomPanel();
        add(resultPanel, BorderLayout.SOUTH);
    }
    
    public BottomPanel getBottomPanel() {
        return resultPanel;
    }
    
    public TopPanel getTopPanel() {
        return carPanel;
    }
    
    public CenterPanel getCenterPanel() {
        return discountPanel;
    }
}
