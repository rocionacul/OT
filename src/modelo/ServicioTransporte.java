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
public class ServicioTransporte extends ServicioSalida{
    private Ciudad origen;
    private ArrayList<Ciudad> destinos = new ArrayList<Ciudad>();

    public Ciudad getOrigen() {
        return origen;
    }

    public void setOrigen(Ciudad origen) {
        this.origen = origen;
    }

    public ArrayList<Ciudad> getDestinos() {
        return destinos;
    }

    public void setDestinos(ArrayList<Ciudad> destinos) {
        this.destinos = destinos;
    }
}
