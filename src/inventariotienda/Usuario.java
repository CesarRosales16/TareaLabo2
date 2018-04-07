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
public class Usuario {
    private String nombre;
    private String codigo;
    private String contaseña;

    public Usuario() {}

    public Usuario(String nombre, String codigo, String contaseña) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.contaseña = contaseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getContaseña() {
        return contaseña;
    }

    public void setContaseña(String contaseña) {
        this.contaseña = contaseña;
    }
}