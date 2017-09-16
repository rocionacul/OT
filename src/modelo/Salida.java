/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Rocío
 */
public class Salida {
    private int numero;
    private Date fechaInicio;
    private Date fechaFin;
    private int cupo;
    private EstadoSalida estadoSalida;
    private ArrayList<Tarifa> tarifas = new ArrayList<Tarifa>();

    public ArrayList<Tarifa> getTarifas() {
        return tarifas;
    }

    public void setTarifas(ArrayList<Tarifa> tarifas) {
        this.tarifas = tarifas;
    }
    
    public void agregar(Tarifa t){
        tarifas.add(t);
    }

    public EstadoSalida getEstadoSalida() {
        return estadoSalida;
    }

    public void setEstadoSalida(EstadoSalida estadoSalida) {
        this.estadoSalida = estadoSalida;
    }
    

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }
    
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
}
