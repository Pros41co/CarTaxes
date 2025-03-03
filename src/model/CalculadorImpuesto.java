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
    /*
    Clase encargada de aplicar los descuentos de acuerdo al avaluo comercial de un vehículo.
    */
    
    public double aplicarDescuento(double precio, boolean prontoPago, boolean servicioPublico, boolean traslado) {
        /*
        Método principal. Aplica el descuento en base al avaluo comercial de un vehículo.
        Recibe el precio, confirmación prontoPago, servicioPublico y Traslado.
        Retorna el precio con los descuentos.
        */
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
