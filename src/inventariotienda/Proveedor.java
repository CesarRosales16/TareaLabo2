/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventariotienda;

/**
 *
 * @author Cesar Rosales <00060917@uca.edu.sv>
 */
public class Proveedor {
    private String nombre;
    private String apelllido;
    private String telefono;
    private String correo;
    private String producto;

    public Proveedor() {}

    public Proveedor(String nombre, String apelllido, String telefono, String correo, String producto) {
        this.nombre = nombre;
        this.apelllido = apelllido;
        this.telefono = telefono;
        this.correo = correo;
        this.producto = producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelllido() {
        return apelllido;
    }

    public void setApelllido(String apelllido) {
        this.apelllido = apelllido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }
}