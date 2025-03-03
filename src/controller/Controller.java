/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import model.CalculadorImpuesto;
import model.VehiculoFile;
import model.Vehiculo;
import view.BottomPanel;
import view.CenterPanel;
import view.View;
import view.TopPanel;

/**
 *
 * @author Alex
 */
public class Controller implements ActionListener{
    /*
    Clase encargada de ser el intermediario entre la interfaz gráfica y los 
    cálculos que se desarrollan en el módelo con respecto a la aplicación de descuentos.
    
    No cuenta con métodos utilizables, adicionales a la escucha de eventos por parte del usuario.
    */
    
    private View view;
    private TopPanel topPanel;
    private BottomPanel bottomPanel;
    private CenterPanel centerPanel;
    private Vehiculo vehiculo;
    private VehiculoFile vehiculeBase;
    
    private CalculadorImpuesto calculador;
    
    public Controller(View view) {
        this.view = view;
        this.topPanel = view.getTopPanel();
        this.bottomPanel = view.getBottomPanel();
        this.centerPanel = view.getCenterPanel();
        this.vehiculeBase = new VehiculoFile();
        this.calculador = new CalculadorImpuesto();
        
        JButton butCalcular = bottomPanel.getButCalcular();
        JButton butLimpiar = bottomPanel.getButLimpiar();
        JButton butBuscar = topPanel.getButBuscar();
        
        butCalcular.addActionListener(this);
        butLimpiar.addActionListener(this);
        butBuscar.addActionListener(this);
    }
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();
        double result;
        
        if(command.equals("limpiar")){
            view.getTopPanel().cleanLabels();
            view.getBottomPanel().cleanLabels();
            centerPanel.unselectButtons();
        }
        else if (command.equals("buscar"))  {

            vehiculo = vehiculeBase.searchVehicle(topPanel.getMarca(),
                    topPanel.getModelo(),
                    topPanel.getLinea());
            
            if (vehiculo != null) {
                try{
                    result = vehiculo.getValue();
                    topPanel.setValor(String.valueOf(result));
                    bottomPanel.allowCalculate();
                }
                catch (Exception e){
                    System.out.println("Error para establecer el precio en la interfaz: " +
                       e.getMessage());
                }
            }else {
                topPanel.errorNotFound();
            }
        }
        else if (command.equals("calcular")) {
            result = Double.parseDouble(topPanel.getValor());
            result = calculador.aplicarDescuento(result, centerPanel.isProntoPago(),
                    centerPanel.isPublico(), centerPanel.isTraslado());
            
            try {
                bottomPanel.setResult(String.valueOf(result));

            } catch (Exception e) {
                System.out.println("Error para establecer el resultado en la interfaz: " +
                       e.getMessage());
            }
            
        }
    }
 
}
