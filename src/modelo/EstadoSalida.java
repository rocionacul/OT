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
public enum EstadoSalida {
    Creada(0,"Creada"),
    EnVenta(1,"En Venta"),
    EnEjecucion(2,"En Ejecucion"),
    EnPausa(3, "En Pausa"),
    Finalizada(4, "Finalizada");
    private String texto;
    private int posi;
    EstadoSalida(int posi, String texto){
        this.posi = posi;
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getPosi() {
        return posi;
    }

    public void setPosi(int posi) {
        this.posi = posi;
    }
    
}
