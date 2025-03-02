/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import model.VehiculoFile;
import view.View;
import view.TopPanel;

/**
 *
 * @author Alex
 */
public class Controller implements ActionListener{
    private View view;
    
    public Controller(View view) {
        this.view = view;
        
        JButton butCalcular = view.getBottomPanel().getButCalcular();
        JButton butLimpiar = view.getBottomPanel().getButLimpiar();
        
        butCalcular.addActionListener(this);
        butLimpiar.addActionListener(this);
    }
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();
        
        if(command.equals("limpiar")){
            view.getTopPanel().cleanLabels();
            view.getBottomPanel().cleanLabels();
        }
        else if (command.equals("buscar")) {
            
        }
    }
    
    
    
    
}
