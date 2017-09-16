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
public class Rubro {
    private String descripcion;
    private ArrayList<Tipo> tipos = new ArrayList<Tipo>();

    public Rubro(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void agregarTipos(Tipo t){
        tipos.add(t);
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Tipo> getTipos() {
        return tipos;
    }

    public void setTipos(ArrayList<Tipo> tipos) {
        this.tipos = tipos;
    }
    
    
}
