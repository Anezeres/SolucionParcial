/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Modelo.PronosticoVentas;
import Vistas.VistaPrincipal;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author evalab
 */
public class ControllerPrincipal {
    private VistaPrincipal vista;
    private PronosticoVentas modelo;

    public ControllerPrincipal(VistaPrincipal vista, PronosticoVentas modelo) {
        this.vista = vista;
        this.modelo = modelo;
        agregarListenersBtn();
    }
    
    private void agregarListenersBtn(){
        vista.addBtnAgregarYearMouseEvent(new MouseListenerController());
        vista.addBtnBorrarYearMouseEvent(new MouseListenerController());
        vista.addBtnModificarYearMouseEvent(new MouseListenerController());
        vista.addBtnNuevoPronosticoMouseEvent(new MouseListenerController());
        vista.addTablaHistoricoListener(new MouseListenerController());
    }
    
    private void llenarTabla(){
        
        
        
        ArrayList<Double> informacion = modelo.getCantidadVentas();
        ArrayList<Double> restas = modelo.getRestas();
        ArrayList<Double> variacion = modelo.getPorcentajeVariacion();
        String[] dato = new String[4];
        
        for(int i= informacion.size()-1; i>0;i--){
            vista.eliminarDatos(i);
        }
        
        
        for(int i = 0; i<informacion.size();i++){
            dato[0] = (i + 1) + "";
            dato[1] = informacion.get(i) + "";
            dato[2] = restas.get(i) + "";
            dato[3] = variacion.get(i) + ""; 
            vista.agregarDatosTablaHistorico(dato);
        }      
        
        
    }
    
    private void llenarPrimeroTresDatos(){
        ArrayList<Double> informacion = modelo.getCantidadVentas();
        String[] dato = new String[4];
        
        
        dato[0] = informacion.size() + "";
        dato[1] = informacion.get(informacion.size() - 1) + "";
        dato[2] = "";
        dato[3] = "";
            
        vista.agregarDatosTablaHistorico(dato);
        
        
            
        
    }
    
    public class MouseListenerController implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent event) {
            if (event.getSource() == vista.getBtnAgregarYear()){
                System.out.println("Precioné");
                double datosVentas =  vista.getDatosVentas();
                
                if(modelo.getCantidadVentas().size() < 2){
                    modelo.getCantidadVentas().add(datosVentas);
                    llenarPrimeroTresDatos();
                    vista.vaciarCantidadVentas();
                }else{
                    modelo.getCantidadVentas().add(datosVentas);
                    modelo.getRestas().clear();
                    modelo.getPorcentajeVariacion().clear();
                    modelo.calcularResta();
                    modelo.calcularPorcentaje();
                    modelo.calcularPromedio();
                    vista.setPromedio(modelo.getPromedio());
                    vista.vaciarCantidadVentas();
                    llenarTabla();
                }
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    }
    
    
    
}
