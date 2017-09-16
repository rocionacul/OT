/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;
import modelo.*;

/**
 *
 * @author Rocío
 */
public class Datos {
    private ArrayList<Pais> paises = new ArrayList<Pais>(); 
    private ArrayList<Prestador> prestadores = new ArrayList<Prestador>();
    private ArrayList<Rubro> rubros = new ArrayList<Rubro>();
    private ArrayList<Tipo> tipos = new ArrayList<Tipo>();
    private ArrayList<Paquete> paquetes = new ArrayList<Paquete>();
    private ArrayList<Base> bases = new ArrayList<Base>();
    
    public Datos() {
     crearPaises();
     crearPrestadores();
     crearRubros();
     crearBases();
     
    }

    public ArrayList<Paquete> getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(ArrayList<Paquete> paquetes) {
        this.paquetes = paquetes;
    }

    public ArrayList<Base> getBases() {
        return bases;
    }

    public void setBases(ArrayList<Base> bases) {
        this.bases = bases;
    }
    
    

    private void crearPaises() {
       Pais pais1 = new Pais("Argentina");
       Provincia pro1 = new Provincia("Buenos Aires", pais1);
       Ciudad c1 = new Ciudad("Mar del Plata", pro1);
       Ciudad c2 = new Ciudad("Azul", pro1);
       pro1.agregar(c1);
       pro1.agregar(c2);
       Provincia pro2 = new Provincia("Cordoba", pais1);
       Ciudad c3 = new Ciudad("Carlos Paz", pro2);
       Ciudad c4 = new Ciudad("Rio Cuarto", pro2);
       Provincia pro5 = new Provincia("Tucuman",pais1);
       Ciudad c8 = new Ciudad("Concepcion",pro5);
       pro5.agregar(c8);
       pro2.agregar(c3);
       pro2.agregar(c4);
       pais1.agregar(pro1);
       pais1.agregar(pro2);
       pais1.agregar(pro5);
       Pais pais2 = new Pais("Estados Unidos");
       Provincia pro3 = new Provincia("California", pais2);
       Ciudad c5 = new Ciudad("Los Angeles", pro3);
       Ciudad c6 = new Ciudad("Napa", pro3);
       pro3.agregar(c5);
       pro3.agregar(c6);
       Provincia pro4 = new Provincia("Utah", pais2);
       Ciudad c7 = new Ciudad("Salt Lake City", pro2);
       pro4.agregar(c7);
       pais2.agregar(pro3);
       pais2.agregar(pro4);
       Pais pais3 = new Pais("Uruguay");
       Provincia pro6 = new Provincia ("Montevideo",pais3);
       Ciudad c9 = new Ciudad("Montevideo", pro6);
       Pais pais4 = new Pais("Canada");
       Provincia pro7 = new Provincia("Columbia Britanica",pais4);
       Ciudad c10 = new Ciudad("Vancouver", pro7);
       Provincia pro8 = new Provincia("Rio Negro", pais1);
       Ciudad c11  = new Ciudad("Las Grutas", pro8);
       pro8.agregar(c11);
       pais1.agregar(pro8);
       PasoFronterizo p1 = new PasoFronterizo("Paso1",pais1,pais3);
       PasoFronterizo p2 = new PasoFronterizo("Paso2", pais2,pais4);
       PasoFronterizo pv1 = new PasoFronterizo(("No tiene"), pais1, pais1);
       PasoFronterizo pv2 = new PasoFronterizo(("No tiene"), pais2, pais2);
       PasoFronterizo pv3 = new PasoFronterizo(("No tiene"), pais3, pais3);
       PasoFronterizo pv4 = new PasoFronterizo(("No tiene"), pais4, pais4);
       pais1.agregar(pv1);
       pais2.agregar(pv2);
       pais3.agregar(pv3);
       pais4.agregar(pv4);
       pais1.agregar(p1);
       pais2.agregar(p2);
       pais3.agregar(p1);
       pais4.agregar(p2);
       paises.add(pais1);
       paises.add(pais2);
       paises.add(pais3);
       paises.add(pais4);
    }

    public ArrayList<Pais> getPaises() {
        return paises;
    }

    public void setPaises(ArrayList<Pais> paises) {
        this.paises = paises;
    }

    private void crearPrestadores() {
      Prestador pre1 = new Prestador("Sheraton Arg SA", "everywhere", "52352352","20202020");
      ServicioPrestado sP1 = new ServicioPrestado("Hotel Sheraton Tucuman",pre1);
      ServicioPrestado sP2 = new ServicioPrestado("Hotel Sheraton Buenos Aires", pre1);
      prestadores.add(pre1);
      pre1.agregar(sP1);
      pre1.agregar(sP2);
      Prestador pre2 = new Prestador("Flecha Bus SA", "Argentina", "209352", "32523532");
      ServicioPrestado sp3 = new ServicioPrestado("Transporte Flecha Bus", pre2);
      pre2.agregar(sp3);
      ServicioPrestado sP4 = new ServicioPrestado("Viaje larga distancia", pre2);
      ServicioPrestado sP5 = new ServicioPrestado("Viaje interurbano", pre2);
      pre2.agregar(sP4);
      pre2.agregar(sP5);
      prestadores.add(pre2);
      Prestador pre3 = new Prestador("LATAM", "Argentina", "3523","3242");
      ServicioPrestado sp6 = new ServicioPrestado("Vuelo Nacional",pre3);
      ServicioPrestado sp7 = new ServicioPrestado("Vuelo Internacional",pre3);
      pre3.agregar(sp6);
      pre3.agregar(sp7);
      prestadores.add(pre3);
    }

    private void crearRubros() {
        Rubro r1 = new Rubro("Transporte");
        Tipo t1 = new Tipo("Omnibus",r1);
        Tipo t2 = new Tipo("Avion",r1);
        r1.agregarTipos(t1);
        r1.agregarTipos(t2);
        Servicio s1 = new Servicio("Butaca de omnibus",t1);
        t1.agregarS(s1);
        Servicio s2 = new Servicio("Butaca de avion",t2);
        t2.agregarS(s2);
        Rubro r2 = new Rubro("Alojamiento");
        Tipo t3 = new Tipo("Hotel",r2);
        Tipo t4 = new Tipo("Cabaña",r2);
        r2.agregarTipos(t3);
        r2.agregarTipos(t4);
        Servicio s3 = new Servicio("Noche de hotel",t3);
        t3.agregarS(s3);
        Servicio s4 = new Servicio("Noche de cabaña",t4);
        t4.agregarS(s4);
        rubros.add(r1);
        rubros.add(r2);
    }

    public ArrayList<Prestador> getPrestadores() {
        return prestadores;
    }

    public void setPrestadores(ArrayList<Prestador> prestadores) {
        this.prestadores = prestadores;
    }

    public ArrayList<Rubro> getRubros() {
        return rubros;
    }

    public void setRubros(ArrayList<Rubro> rubros) {
        this.rubros = rubros;
    }

    public ArrayList<Tipo> getTipos() {
        return tipos;
    }

    public void setTipos(ArrayList<Tipo> tipos) {
        this.tipos = tipos;
    }

    private void crearBases() {
       bases.add(new Base("Simple"));
       bases.add(new Base("Doble"));
       bases.add(new Base("Triple"));
       bases.add(new Base("Cuadruple"));
       bases.add(new Base("Quintuple"));
    }
    
    
}
