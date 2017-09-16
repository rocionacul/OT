/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import datos.Datos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Ciudad;
import modelo.EstadoPaquete;
import modelo.EstadoSalida;
import modelo.Pais;
import modelo.Paquete;
import modelo.PasoFronterizo;
import modelo.Provincia;
import modelo.Salida;
import modelo.ServicioAlojamiento;
import modelo.ServicioPaquete;
import modelo.ServicioSalida;
import modelo.ServicioTransporte;
import modelo.Tarifa;
import vistas.*;

/**
 *
 * @author Rocío
 */
public class ControladorOT {
    private vistaCrearPaquete vistaPaquete;
    private Datos repositorio;
    private Paquete temp;
    private vistaSalida vistaSalida;
    private vistaModificarPaquete vistaModificarPaquete;
    private vistaModificarSalida vistaModificarSalida;
    private vistaCES vistaCES;
    
    public ControladorOT() {
        
        vistaPaquete = new vistaCrearPaquete(this);
        repositorio = new Datos();
        temp = new Paquete();
    }
    public void ejecutar(){
        ponerPaises();
        ponerRubros();
        ponerPrestadores();
        vistaPaquete.setVisible(true);
    }
    //Metodos de crear Paquete
    
    public void CrearPaquete(String nombre, String descripcion, String cc) {
        temp.setCondComerciales(vistaPaquete.getCC());
        temp.setDescripcion(vistaPaquete.getDescripcion());
        temp.setDias(vistaPaquete.getDias());
        temp.setNoches(vistaPaquete.getNoches());
        temp.setItinerario(vistaPaquete.getItinerario());
        temp.setNombre(vistaPaquete.getNombre());
        repositorio.getPaquetes().add(temp);
        temp=null;
        temp= new Paquete();
    }
    
    public void ciudadOrigen(int selectedIndex, int selectedIndex0, int selectedIndex1) {
        temp.setOrigen(repositorio.getPaises().get(selectedIndex).getProvincias().get(selectedIndex0).getCiudades().get(selectedIndex1));
        vistaPaquete.ponerOrigen(temp.getOrigen().getNombre());
    }

    public void ciudadDestino(int selectedIndex, int selectedIndex0, int selectedIndex1, int selectedIndex2) {
       temp.agregarDestinos(repositorio.getPaises().get(selectedIndex).getProvincias().get(selectedIndex0).getCiudades().get(selectedIndex1));
       temp.agregarPF(repositorio.getPaises().get(selectedIndex).getPasosFronterizos().get(selectedIndex2));
       mostrarDestinos();
    }
    
    public void agregarServicio() {
      ServicioSalida servsalida = null;
        int cupo = vistaPaquete.getCupo();
        float precio = vistaPaquete.getPrecio();
        int desde = vistaPaquete.getDesde();
        int hasta = vistaPaquete.getHasta();
        if(vistaPaquete.getRubroIndex() == 0){
            servsalida = new ServicioTransporte();
            servsalida.setCupo(cupo);
            servsalida.setPrecio(precio);
            servsalida.setServicioPrestado(repositorio.getPrestadores().get(vistaPaquete.getPrestadorIndex()).getServiciosPrestados().get(vistaPaquete.getServicioPrestadoIndex()));
            
        }else{
            servsalida = new ServicioAlojamiento();
            servsalida.setCupo(cupo);
            servsalida.setPrecio(precio);
            servsalida.setServicioPrestado(repositorio.getPrestadores().get(vistaPaquete.getPrestadorIndex()).getServiciosPrestados().get(vistaPaquete.getServicioPrestadoIndex()));
            
        }
        ServicioPaquete sp = new ServicioPaquete();
        sp.setDesde(desde);
        sp.setHasta(hasta);
        sp.setServicioSalida(servsalida);
        sp.setServicio(repositorio.getRubros().get(vistaPaquete.getRubroIndex()).getTipos().get(vistaPaquete.getTipoIndex()).getServicios().get(vistaPaquete.getServicioIndex()));
        temp.agregarSP(sp);
        vistaPaquete.limpiar();
        mostrarServicios();
    }
    //Fin metodos de crear paquete
    
    //Inicio metodos crear salida
        public void agregarSalida(int selectedIndex) {
        Salida s = new Salida();
        s.setCupo(vistaSalida.getCupo());
        s.setNumero(vistaSalida.getNumero());
        s.setFechaInicio(vistaSalida.getFS());
        s.setFechaFin(vistaSalida.getFR());
        s.setEstadoSalida(EstadoSalida.Creada);
        repositorio.getPaquetes().get(selectedIndex).agregarSalidas(s);
        mostrarSalidas(selectedIndex);
    }
        
        public void agregarTarifa(int selectedIndex, int selectedRow) {
        repositorio.getPaquetes().get(selectedIndex).getSalidas().get(selectedRow).agregar(new Tarifa(vistaSalida.getPrecio(), repositorio.getBases().get(vistaSalida.getBaseIndex())));
        
    }
    //Fin de metodos de salida
    
    //Inicio metodos modificar paquete
    public void modificarPaquete(int selectedIndex, int selectedIndex0, int selectedIndex1, int selectedIndex2) {
        Paquete paq = repositorio.getPaquetes().get(selectedIndex);
        paq.setNombre(vistaModificarPaquete.getNombre());
        paq.setDescripcion(vistaModificarPaquete.getDescripcion());
        paq.setItinerario(vistaModificarPaquete.getItinerario());
        paq.setCondComerciales(vistaModificarPaquete.getCC());
        paq.setDias(vistaModificarPaquete.getDias());
        paq.setNoches(vistaModificarPaquete.getNoches());
        paq.setOrigen(repositorio.getPaises().get(selectedIndex).getProvincias().get(selectedIndex0).getCiudades().get(selectedIndex1));
        vistaModificarPaquete.ponerOrigen(paq.getOrigen().getNombre());
        paq.setOrigen(null);
        paq.setEstadoPaq(EstadoPaquete.values()[vistaModificarPaquete.getEstadoIndex()]);
    }
        public void quitarDestino(int selectedIndex, int selectedRow) {
       repositorio.getPaquetes().get(selectedIndex).getDestinos().remove(selectedRow);
       vistaModificarPaquete.mostrarDestinos(repositorio.getPaquetes().get(selectedIndex).getDestinos());
    }
        
    public void modificarCiudadDestino(int selectedIndex, int selectedIndex0, int selectedIndex1, int selectedIndex2) {
       Paquete paq = repositorio.getPaquetes().get(selectedIndex);
       paq.agregarDestinos(repositorio.getPaises().get(selectedIndex0).getProvincias().get(selectedIndex1).getCiudades().get(selectedIndex2));
       vistaModificarPaquete.mostrarDestinos(repositorio.getPaquetes().get(selectedIndex).getDestinos());
    }
    
    public void quitarServicio(int selectedIndex, int selectedRow) {
         repositorio.getPaquetes().get(selectedIndex).getServiciosPaq().remove(selectedRow);
       vistaModificarPaquete.mostrarServicios(repositorio.getPaquetes().get(selectedIndex).getServiciosPaq());
    }
    //Fin metodos modificar paquete
        
    //Inicio metodos modificar salida
          public void modificarSalida(int selectedIndex, int selectedIndex0) {
        Salida s = repositorio.getPaquetes().get(selectedIndex).getSalidas().get(selectedIndex0);
        s.setCupo(vistaModificarSalida.getCupo());
        s.setFechaInicio(vistaModificarSalida.getFS());
        s.setFechaFin(vistaModificarSalida.getFS());
        repositorio.getPaquetes().get(selectedIndex).agregarSalidas(s);
    }
    
    public void modificarTarifa(int selectedIndex, int selectedIndex0) {
        repositorio.getPaquetes().get(selectedIndex).getSalidas().get(selectedIndex0).agregar(new Tarifa(vistaModificarSalida.getPrecio(), repositorio.getBases().get(vistaModificarSalida.getBaseIndex())));
        
    }

    public void quitarTarifa(int selectedIndex, int selectedIndex0, int selectedRow) {
        repositorio.getPaquetes().get(selectedIndex).getSalidas().get(selectedIndex0).getTarifas().remove(selectedRow);
    }
    //Fin metodos modificar salida
        
    //Inicio metodos cambiar estado salida
    public void modificarES(int selectedIndex, int selectedIndex0, int selectedIndex1) {
        repositorio.getPaquetes().get(selectedIndex).getSalidas().get(selectedIndex0).setEstadoSalida(EstadoSalida.values()[selectedIndex1]);
    }
    //Fin metodos cambiar estado salida
    
    //////////////////METODOS DE LAS VISTAS//////////////////
    
    //Vista Crear Paquete
    public void ponerPaises() {
        vistaPaquete.ponerPaises(repositorio.getPaises());
        ponerProvincias(0);        
    }

    public void ponerProvincias(int p) {
        vistaPaquete.ponerProvincias(repositorio.getPaises().get(p).getProvincias());
        ponerCiudades(p,0);        
    }
    
    public void ponerPF(int selectedIndex) {
        vistaPaquete.ponerPF(repositorio.getPaises().get(selectedIndex).getPasosFronterizos());
    }
    public void ponerCiudades(int p, int pro) {
        vistaPaquete.ponerCiudades(repositorio.getPaises().get(p).getProvincias().get(pro).getCiudades());       
    }
    
    public void ponerRubros() {
        vistaPaquete.ponerRubros(repositorio.getRubros());
        ponerTipos(0);
    }

    public void ponerTipos(int r) {
       vistaPaquete.ponerTipos(repositorio.getRubros().get(r).getTipos());
       ponerServicios(r,0);
    }

    public void ponerServicios(int r, int t) {
        vistaPaquete.ponerServicios(repositorio.getRubros().get(r).getTipos().get(t).getServicios());
    }

    private void ponerPrestadores() {
       vistaPaquete.ponerPrestadores(repositorio.getPrestadores());
       ponerServiciosPrestados(0);
    }

    public void ponerServiciosPrestados(int p) {
        vistaPaquete.ponerServiciosPrestados(repositorio.getPrestadores().get(p).getServiciosPrestados());
    }
   
    private void mostrarDestinos() {
        DefaultTableModel m = new DefaultTableModel(new Object[]{"Destino","Provincia","Pais",},0);
        for(Ciudad c : temp.getDestinos()){
            m.addRow(new Object[]{
            c.getNombre(),
            c.getProvincia().getNombre(),
            c.getProvincia().getPais().getNombre()
            });
        }
        vistaPaquete.mostrarDestinos(m);
    }

    private void mostrarServicios() {
        vistaPaquete.mostrarServicios(temp.getServiciosPaq());
    }
//Fin vista Crear Paquete
    
//Vista Salida
    public void mostrarVistaSalida() {
        vistaSalida = new vistaSalida(this);
        vistaSalida.ponerPaquetes(repositorio.getPaquetes());
        vistaSalida.ponerBases(repositorio.getBases());   
        vistaSalida.setVisible(true);
    }
    
    public void mostrarSalidas(int selectedIndex) {
       vistaSalida.mostrarSalidas(repositorio.getPaquetes().get(selectedIndex).getSalidas());
    }
    public void mostrarTarifas(int selectedIndex, int selectedRow) {
        vistaSalida.ponerBasesTabla(repositorio.getPaquetes().get(selectedIndex).getSalidas().get(selectedRow));
    }
    
       public void salirSalida() {
        vistaPaquete.setVisible(true);
        vistaSalida.setVisible(false);    
    }
//FIN vista salida
       
//Vista Modificar Paquete
    public void mostrarVistaMP(){
        vistaModificarPaquete = new vistaModificarPaquete(this);
        vistaModificarPaquete.ponerPaquetes(repositorio.getPaquetes());
        vistaModificarPaquete.ponerPaises(repositorio.getPaises());
        vistaModificarPaquete.ponerRubros(repositorio.getRubros());
        ponerPrestadores1();
        vistaModificarPaquete.setVisible(true);
        vistaPaquete.setVisible(false);
    }
    
    public void ponerTipos1(int r) {
       vistaModificarPaquete.ponerTipos(repositorio.getRubros().get(r).getTipos());
       ponerServicios1(r,0);
    }

    public void ponerServicios1(int r, int t) {
        vistaModificarPaquete.ponerServicios(repositorio.getRubros().get(r).getTipos().get(t).getServicios());
    }
    
    public void ponerPrestadores1(){
       vistaModificarPaquete.ponerPrestadores(repositorio.getPrestadores());
       ponerServiciosPrestados1(0);
    }
    public void ponerServiciosPrestados1(int p) {
        vistaModificarPaquete.ponerServiciosPrestados(repositorio.getPrestadores().get(p).getServiciosPrestados());
    }
    
    public void ponerProvincias1(int selectedIndex) {
        vistaModificarPaquete.ponerProvincias(repositorio.getPaises().get(selectedIndex).getProvincias());
        ponerCiudades1(selectedIndex,0); 
    }
    
    public void ponerPF1(int selectedIndex) {
        vistaModificarPaquete.ponerPF(repositorio.getPaises().get(selectedIndex).getPasosFronterizos());
    }
    
    public void ponerCiudades1(int selectedIndex, int selectedIndex0) {
        vistaModificarPaquete.ponerCiudades(repositorio.getPaises().get(selectedIndex).getProvincias().get(selectedIndex0).getCiudades());       
    }
    
    public void mostrarPaquete(int selectedIndex) {
        Paquete paq = repositorio.getPaquetes().get(selectedIndex);
        vistaModificarPaquete.setNombre(paq.getNombre());
        vistaModificarPaquete.setDescripcion(paq.getDescripcion());
        vistaModificarPaquete.setItinerario(paq.getItinerario());
        vistaModificarPaquete.setDias(paq.getDias());
        vistaModificarPaquete.setNoches(paq.getNoches());
        vistaModificarPaquete.setCondicionesComerciales(paq.getCondComerciales());
        vistaModificarPaquete.setOrigen(paq.getOrigen().getNombre());
        vistaModificarPaquete.mostrarDestinos(paq.getDestinos());
        vistaModificarPaquete.mostrarServicios(paq.getServiciosPaq());
    }
    public void salirMP() {
       vistaModificarPaquete.setVisible(false);
       vistaPaquete.setVisible(true);
    }
 //FIN vista Modificar Paquete   
    
//vista Modificar Salida
    public void mostrarVistaMS() {
        vistaModificarSalida = new vistaModificarSalida(this);
        vistaModificarSalida.ponerPaquetes(repositorio.getPaquetes());
        vistaModificarSalida.setVisible(true);
        vistaPaquete.setVisible(false);
    }
    
    public void mostrarSalidasEnMS(int selectedIndex){
        vistaModificarSalida.ponerSalidas(repositorio.getPaquetes().get(selectedIndex).getSalidas());
    }
    
    public void ponerSalidas(int selectedIndex) {
        repositorio.getPaquetes().get(selectedIndex).getSalidas();
        vistaModificarSalida.ponerSalidas(repositorio.getPaquetes().get(selectedIndex).getSalidas());
        }
    
    public void mostrarTarifasMod(int selectedIndex, int selectedIndex0) {
        vistaModificarSalida.ponerBasesTabla(repositorio.getPaquetes().get(selectedIndex).getSalidas().get(selectedIndex0));
    }
    
    public void salirMS(){
        vistaModificarSalida.setVisible(false);
        vistaPaquete.setVisible(true);
    }
//FIN vista Modificar Salida
    
// Inicio vista Cambiar Estado Salida
    public void mostrarVistaCES() {
        vistaCES = new vistaCES(this);
        vistaCES.ponerPaquetes(repositorio.getPaquetes());
        vistaCES.ponerSalidas(repositorio.getPaquetes().get(0).getSalidas());
        vistaCES.setVisible(true);    
    }

    public void mostrarEstadoSalida(int selectedIndex, int selectedIndex0) {
        vistaCES.ponerEstado(repositorio.getPaquetes().get(selectedIndex).getSalidas().get(selectedIndex0).getEstadoSalida());
    }
    
    public void salirCES() {
        vistaCES.setVisible(false);
        vistaPaquete.setVisible(true);
    }
//FIN vista Cambiar Estado Salida



    
}
