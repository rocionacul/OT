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
public class ServicioPaquete {
    private int desde;
    private int hasta;
    private ServicioSalida servicioSalida;
    private Servicio servicio;

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
    
    
    public int getDesde() {
        return desde;
    }

    public void setDesde(int desde) {
        this.desde = desde;
    }

    public int getHasta() {
        return hasta;
    }

    public void setHasta(int hasta) {
        this.hasta = hasta;
    }

    public ServicioSalida getServicioSalida() {
        return servicioSalida;
    }

    public void setServicioSalida(ServicioSalida servicioSalida) {
        this.servicioSalida = servicioSalida;
    }
    
}
