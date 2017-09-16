/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Rocío
 */
public class PasoFronterizo {
    private String nombre;
    private Pais origen;
    private Pais destino;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getOrigen() {
        return origen;
    }

    public void setOrigen(Pais origen) {
        this.origen = origen;
    }

    public Pais getDestino() {
        return destino;
    }

    public void setDestino(Pais destino) {
        this.destino = destino;
    }

    public PasoFronterizo(String nombre, Pais origen, Pais destino) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
    }
    
    
}
