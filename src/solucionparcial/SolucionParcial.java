/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solucionparcial;

import Controller.ControllerPrincipal;
import Modelo.PronosticoVentas;
import Vistas.VistaPrincipal;

/**
 *
 * @author evalab
 */
public class SolucionParcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VistaPrincipal vista = new VistaPrincipal();
        PronosticoVentas modelo = new PronosticoVentas();
        
        ControllerPrincipal controller = new ControllerPrincipal(vista, modelo);
        /*
        prueba2 Prueba = new prueba2(cantidadVentas);
       
        Prueba.calcularResta();
        Prueba.calcularPorcentaje();
        Prueba.calcularPromedio();
        Prueba.calcularPronostico(5);
        
        System.out.println(Prueba.getPromedio());
        System.out.println(Arrays.toString(Prueba.getCantidadVentas()));
        System.out.println(Arrays.toString(Prueba.getRestas()));
        System.out.println(Arrays.toString(Prueba.getPorcentajeVariacion()));
        System.out.println(Arrays.toString(Prueba.getPronosticoVentas()));
        */
    }
    
}
