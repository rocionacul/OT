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
public class Pais {
    private String nombre;
    private ArrayList<Provincia> provincias = new ArrayList<Provincia>();
    private ArrayList<PasoFronterizo> pasosFronterizos = new ArrayList<PasoFronterizo>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(ArrayList<Provincia> provincias) {
        this.provincias = provincias;
    }

    public ArrayList<PasoFronterizo> getPasosFronterizos() {
        return pasosFronterizos;
    }

    public void setPasosFronterizos(ArrayList<PasoFronterizo> pasosFronterizos) {
        this.pasosFronterizos = pasosFronterizos;
    }

    public Pais(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregar(PasoFronterizo PF){
     pasosFronterizos.add(PF);
    }
    
    public void agregar(Provincia P){
     provincias.add(P);
    }
}
