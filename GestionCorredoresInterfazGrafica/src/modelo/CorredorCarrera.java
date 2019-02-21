/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author daniel regueiro
 */
public class CorredorCarrera implements Serializable {

    private Corredor corredor;
    private int dorsal;
    private Date tiempo;
    private transient String nombre;
    private transient String apellidos;
    private transient String dni;
    private transient String fecha;
    private transient String tiempoString;

    public CorredorCarrera(Corredor corredor, int dorsal) {
        this.corredor = corredor;
        this.dorsal = dorsal;
        nombre = corredor.getNombre();
        apellidos = corredor.getApellidos();
        dni = corredor.getDni();
        fecha = (new SimpleDateFormat("dd/MM/YYYY")).format(corredor.getFechaNacimiento());

    }

    public String getTiempoString() {
        return tiempoString;
    }

    public void setTiempoString(String tiempoString) {
        this.tiempoString = tiempoString;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Corredor getCorredor() {
        return corredor;
    }

    public void setCorredor(Corredor corredor) {
        this.corredor = corredor;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public Date getTiempo() {
        return tiempo;
    }

    public void setTiempo(Date tiempo) {
        this.tiempo = tiempo;
        tiempoString= (new SimpleDateFormat("dd/MM/YYYY")).format(tiempo);
    }

    @Override
    public String toString() {
        return "CorredorCarrera{" + "corredor=" + corredor + ", dorsal=" + dorsal + ", tiempo=" + tiempo + '}';
    }

}
