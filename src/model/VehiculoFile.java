/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import model.Vehiculo;

/**
 *
 * @author Alex
 */
public class VehiculoFile {
    private final static String filePath = "./resources/vehiculos.csv";
    private List<Vehiculo> vehiculos = new ArrayList<>();
    
    public VehiculoFile () {
        loadVehicles();
    }
    
    private void loadVehicles() {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            line = br.readLine();
            while (line != null) {  
                String[] vehicleData = line.split(",");
                String marca = vehicleData[0];
                int modelo = Integer.parseInt(vehicleData[1]);
                String linea = vehicleData[2]; 
                double precio = Double.parseDouble(vehicleData[3]);
                
                vehiculos.add(new Vehiculo(marca, modelo, linea, precio));
                line = br.readLine();
            }
        } catch (Exception e) {
            System.out.println("Error to load vehicles");
        }
    }
        
    public Vehiculo searchVehicle(String marca, int modelo, String linea){
        for (Vehiculo vehiculo: vehiculos) {
            if (vehiculo.getMarca().equals(marca) &&
                vehiculo.getModelo() == modelo &&
                vehiculo.getLinea().equals(linea)) {
            return vehiculo;
            }
        }
        return null;
    }
    
    
}
