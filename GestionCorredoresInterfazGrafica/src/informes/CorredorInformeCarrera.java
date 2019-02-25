/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informes;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author daniel
 */
public class CorredorInformeCarrera {
    private String nombre;
    private String apellidos;
    private Date fechaNacimiento;
    private String dni;
    private String direccion;
    private int dorsal;
    private Date tiempo;
    private String fecha;
    private String tiempoString;

    public String getTiempoString() {
        return tiempoString;
    }

    public void setTiempoString(String tiempoString) {
        this.tiempoString = tiempoString;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
         fecha = (new SimpleDateFormat("dd/MM/YYYY")).format(fechaNacimiento);
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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
         tiempoString = (new SimpleDateFormat("\"mm:ss:SSS\"")).format(tiempo);
    }
    
    
    
    
    
    
    
}
