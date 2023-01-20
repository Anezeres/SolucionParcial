/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author evalab
 */
public class PronosticoVentas {
    private double[] cantidadVentas; 
    private double[] pronosticoVentas; 
    private double[] porcentajeVariacion;
    private double[] restas;
    private double promedio;
    

    public prueba2(double[] cantidadVentas) {
        this.cantidadVentas = cantidadVentas;
        restas = new double[cantidadVentas.length];
        
        porcentajeVariacion = new double[cantidadVentas.length];
    }
    
     public void calcularResta(){ 
         for(int i=0; i < cantidadVentas.length; i++){
        if (i == 0) {
            restas[0] = 0;
        } else {
        restas[i] = (cantidadVentas[i] - cantidadVentas[i-1]); 
        }
      }
    }
     
     public void calcularPorcentaje() {
         for(int i=0; i < cantidadVentas.length; i++){
        if (i == 0) {
            porcentajeVariacion[0] = 0;
        } else {
        porcentajeVariacion[i] = (cantidadVentas[i] - cantidadVentas[i-1])/ cantidadVentas[i-1] ; 
        
        }
      }
    }
     
     public void calcularPromedio () {
         double suma = 0;
         for(int i=0; i < porcentajeVariacion.length; i++) {
             suma = suma + porcentajeVariacion[i];
         }
         promedio = suma/(porcentajeVariacion.length - 1);
     }
     
     public void calcularPronostico(int anios){
         calcularPromedio();
         pronosticoVentas = new double[anios];
         double ultimaVenta = cantidadVentas[cantidadVentas.length - 1];
         for(int i = 0; i < anios; i++) {
             if (i == 0) {
                pronosticoVentas[i] = (ultimaVenta*promedio)+ ultimaVenta;
             } else {
                 pronosticoVentas[i] = (pronosticoVentas[i-1]*promedio) + pronosticoVentas[i-1];
             }
             
         }
     }

    public double[] getCantidadVentas() {
        return cantidadVentas;
    }

    public double[] getPronosticoVentas() {
        return pronosticoVentas;
    }

    public double[] getPorcentajeVariacion() {
        return porcentajeVariacion;
    }

    public double[] getRestas() {
        return restas;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setCantidadVentas(double[] cantidadVentas) {
        this.cantidadVentas = cantidadVentas;
    }
     
     
}
