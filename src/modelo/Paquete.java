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
public class Paquete {
    private String nombre;
    private String itinerario;
    private String descripcion;
    private String condComerciales;
    private int dias;
    private int noches;
    private Ciudad origen;
    private ArrayList<Ciudad> Destinos = new ArrayList<Ciudad>();
    private ArrayList<ServicioPaquete> ServiciosPaq = new ArrayList<ServicioPaquete>();
    private ArrayList<Salida> Salidas = new ArrayList<Salida>();
    private ArrayList<PasoFronterizo> PaqPasosFronterizos = new ArrayList<PasoFronterizo>();
    private EstadoPaquete estadoPaq;
    
    public void agregarDestinos(Ciudad d){
        Destinos.add(d);
    }
    
    public void agregarSP(ServicioPaquete SP){
        ServiciosPaq.add(SP);
    }
    
    public void agregarSalidas(Salida S){
        Salidas.add(S);
    }

    public void agregarPF (PasoFronterizo PF){
        PaqPasosFronterizos.add(PF);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getItinerario() {
        return itinerario;
    }

    public void setItinerario(String itinerario) {
        this.itinerario = itinerario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCondComerciales() {
        return condComerciales;
    }

    public void setCondComerciales(String condComerciales) {
        this.condComerciales = condComerciales;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getNoches() {
        return noches;
    }

    public void setNoches(int noches) {
        this.noches = noches;
    }

    public Ciudad getOrigen() {
        return origen;
    }

    public void setOrigen(Ciudad origen) {
        this.origen = origen;
    }

    public ArrayList<Ciudad> getDestinos() {
        return Destinos;
    }

    public void setDestinos(ArrayList<Ciudad> Destinos) {
        this.Destinos = Destinos;
    }

    public ArrayList<ServicioPaquete> getServiciosPaq() {
        return ServiciosPaq;
    }

    public void setServiciosPaq(ArrayList<ServicioPaquete> ServiciosPaq) {
        this.ServiciosPaq = ServiciosPaq;
    }

    public ArrayList<Salida> getSalidas() {
        return Salidas;
    }

    public void setSalidas(ArrayList<Salida> Salidas) {
        this.Salidas = Salidas;
    }

    public ArrayList<PasoFronterizo> getPaqPasosFronterizos() {
        return PaqPasosFronterizos;
    }

    public void setPaqPasosFronterizos(ArrayList<PasoFronterizo> PaqPasosFronterizos) {
        this.PaqPasosFronterizos = PaqPasosFronterizos;
    }
 
    public EstadoPaquete getEstadoPaq() {
        return estadoPaq;
    }

    public void setEstadoPaq(EstadoPaquete estadoPaq) {
        this.estadoPaq = estadoPaq;
    }
    
}
