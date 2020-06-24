package model.despacho;

import model.producto.Articulo;

import java.util.ArrayList;

public class OrdenDeDespacho {

    private String direcciónDeDespacho;
    private String nombreDelCliente;
    private ArrayList<Articulo> articulos;
    private int montoTotal;
    private String fechaDeCompra;

    public OrdenDeDespacho(String direcciónDeDespacho, String nombreDelCliente, ArrayList<Articulo> articulos, int montoTotal, String fechaDeCompra) {
        this.direcciónDeDespacho = direcciónDeDespacho;
        this.nombreDelCliente = nombreDelCliente;
        this.articulos = articulos;
        this.montoTotal = montoTotal;
        this.fechaDeCompra = fechaDeCompra;
    }

    public String getDirecciónDeDespacho() {
        return direcciónDeDespacho;
    }

    public void setDirecciónDeDespacho(String direcciónDeDespacho) {
        this.direcciónDeDespacho = direcciónDeDespacho;
    }

    public String getNombreDelCliente() {
        return nombreDelCliente;
    }

    public void setNombreDelCliente(String nombreDelCliente) {
        this.nombreDelCliente = nombreDelCliente;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }

    public int getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getFechaDeCompra() {
        return fechaDeCompra;
    }

    public void setFechaDeCompra(String fechaDeCompra) {
        this.fechaDeCompra = fechaDeCompra;
    }
}
