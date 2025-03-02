/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import controller.Controller;
import view.View;

/**
 *
 * @author Alex
 */
public class Main {
    public static void main(String[] args) {
        View view = new View();
        Controller controller = new Controller(view);
        
        view.setVisible(true);
        
        
    }
}
