/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Rocío
 */
public class Servicio {
    private String descripcion;
   private ArrayList<ServicioPaquete> servPaquetes = new ArrayList<ServicioPaquete>();
   private Tipo tipo;

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
   
   
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<ServicioPaquete> getServPaquetes() {
        return servPaquetes;
    }

    public void setServPaquetes(ArrayList<ServicioPaquete> servPaquetes) {
        this.servPaquetes = servPaquetes;
    }

    public Servicio(String descripcion, Tipo tipo) {
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    
    
    
}
