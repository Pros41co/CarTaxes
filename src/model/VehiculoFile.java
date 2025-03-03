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
    private final static String filePath = "src/resources/vehiculos.csv";
    private List<Vehiculo> vehiculos = new ArrayList<>();
    
    public VehiculoFile () {
        loadVehicles();
    }
    
    private void loadVehicles() {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;

            while ((line = br.readLine()) != null) {  
                if (line.trim().isEmpty()) continue;
                
                String[] vehicleData = line.split(",");
                String marca = vehicleData[0].trim().toLowerCase();
                int modelo = Integer.parseInt(vehicleData[1].trim());
                String linea = vehicleData[2].trim().toLowerCase(); 
                int cilindraje = Integer.parseInt(vehicleData[3]);
                double precio = Double.parseDouble(vehicleData[4].trim().toLowerCase());
                
                vehiculos.add(new Vehiculo(marca, modelo, linea, cilindraje, precio));

            }
        } catch (Exception e) {
            System.out.println("Error to load vehicles " + e.getMessage());
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
