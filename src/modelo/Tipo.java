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
public class Tipo {
    private String descripcion;
    private ArrayList<Servicio> servicios = new ArrayList<Servicio>();
    private Rubro rubro;

    public Rubro getRubro() {
        return rubro;
    }

    public void setRubro(Rubro rubro) {
        this.rubro = rubro;
    }
    
    
    public void agregarS(Servicio s){
        servicios.add(s);
        
    }

    public Tipo(String descripcion, Rubro rubro) {
        this.descripcion = descripcion;
        this.rubro = rubro;
    }
    

    public Tipo(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(ArrayList<Servicio> servicios) {
        this.servicios = servicios;
    }
}
