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
    /*
    Clase vehículo. Encargado de gestionar todos los vehículos que se almacenan 
    en los objetos de la clase VehiculoFile. Representa un vehículo con su marca,
    modeo, cilindraje, linea y precio.
    */
    String marca;
    int modelo;
    int cilindraje;
    String linea;
    double precio;
    
    
    public Vehiculo(String marca, int modelo, String linea, int cilindraje, double precio ) {
        this.marca = marca;
        this.modelo = modelo;
        this.linea = linea;
        this.precio = precio;
        this.cilindraje = cilindraje;
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
