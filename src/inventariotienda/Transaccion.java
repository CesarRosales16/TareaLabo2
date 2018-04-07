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
public class Transaccion {
    private String codigoTran;
    private String nombreTran;
    private String nombreProd;
    private String codigoProd;
    private int cantidadProd;
    private float total;

    public Transaccion() {}

    public Transaccion(String codigoTran, String nombreTran, String nombreProd, String codigoProd, int cantidadProd, float total) {
        this.codigoTran = codigoTran;
        this.nombreTran = nombreTran;
        this.nombreProd = nombreProd;
        this.codigoProd = codigoProd;
        this.cantidadProd = cantidadProd;
        this.total = total;
    }

    public String getCodigoTran() {
        return codigoTran;
    }

    public void setCodigoTran(String codigoTran) {
        this.codigoTran = codigoTran;
    }

    public String getNombreTran() {
        return nombreTran;
    }

    public void setNombreTran(String nombreTran) {
        this.nombreTran = nombreTran;
    }

    public String getNombreProd() {
        return nombreProd;
    }

    public void setNombreProd(String nombreProd) {
        this.nombreProd = nombreProd;
    }

    public String getCodigoProd() {
        return codigoProd;
    }

    public void setCodigoProd(String codigoProd) {
        this.codigoProd = codigoProd;
    }

    public int getCantidadProd() {
        return cantidadProd;
    }

    public void setCantidadProd(int cantidadProd) {
        this.cantidadProd = cantidadProd;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}