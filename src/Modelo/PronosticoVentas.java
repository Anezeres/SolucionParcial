/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author evalab
 */
public class PronosticoVentas {
    private ArrayList<Double> cantidadVentas; 
    private ArrayList<Double> pronosticoVentas; 
    private ArrayList<Double> porcentajeVariacion; 
    private ArrayList<Double> restas; 
    private double promedio;
    

    public PronosticoVentas() {
        cantidadVentas = new ArrayList<Double>();
        restas = new ArrayList<Double>();
        porcentajeVariacion = new ArrayList<Double>();
    }
    
     public void calcularResta(){ 
         for(int i=0; i < cantidadVentas.size(); i++){
        if (i == 0) {
            restas.add(0.0);
        } else {
            restas.add(cantidadVentas.get(i) - cantidadVentas.get(i-1));
        }
      }
    }
     
     public void calcularPorcentaje() {
         for(int i=0; i < cantidadVentas.size(); i++){
        if (i == 0) {
            porcentajeVariacion.add(0.0);
        } else {
        porcentajeVariacion.add((cantidadVentas.get(i) - cantidadVentas.get(i-1))/cantidadVentas.get(i-1));
        
        }
      }
    }
     
     public void calcularPromedio () {
         double suma = 0;
         for(int i=0; i < porcentajeVariacion.size(); i++) {
             suma = suma + porcentajeVariacion.get(i);
         }
         promedio = suma/(porcentajeVariacion.size() - 1);
     }
     
     public void calcularPronostico(int anios){
         calcularPromedio();
         pronosticoVentas = new ArrayList<Double>();
         double ultimaVenta = cantidadVentas.get(cantidadVentas.size() - 1);
         for(int i = 0; i < anios; i++) {
             if (i == 0) {
                 pronosticoVentas.add(ultimaVenta*promedio + ultimaVenta);
             } else {
                 pronosticoVentas.add(pronosticoVentas.get(i-1)*promedio + pronosticoVentas.get(i-1));
             }
             
         }
     }

    public ArrayList<Double> getCantidadVentas() {
        return cantidadVentas;
    }

    public ArrayList<Double> getPorcentajeVariacion() {
        return porcentajeVariacion;
    }

    public ArrayList<Double> getRestas() {
        return restas;
    }

    public ArrayList<Double> getPronosticoVentas() {
        return pronosticoVentas;
    }

    public double getPromedio() {
        return promedio;
    }

     
}
