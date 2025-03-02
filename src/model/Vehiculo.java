/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Alex
 */
public class Vehiculo {
    String marca;
    int modelo;
    String linea;
    double precio;
    
    public Vehiculo(String marca, int modelo, String linea, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.linea = linea;
        this.precio = precio;
    }
                
    public String getMarca() {
        return marca;
    }
    
    public String getLinea(){
        return linea;
    }
    
    public int getModelo() {
        return modelo;
    }
   
    public double getValue() {
        return precio;
    }
}
