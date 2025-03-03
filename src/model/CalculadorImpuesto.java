/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Alex
 */
public class CalculadorImpuesto {
    
    public double aplicarDescuento(double precio, boolean prontoPago, boolean servicioPublico, boolean traslado) {
        if (prontoPago) {
            precio -= precio * 0.10;
        } 
        if (servicioPublico) {
            precio -= 50000;
        }
        if (traslado) {
            precio -= precio * 0.05;
        }
        return precio;
    }
}
