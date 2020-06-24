package model.menu;

import model.carrito.CarritoDeCompra;
import model.pago.MediosDePago;
import model.producto.Articulo;

public class Menu {

    private CarritoDeCompra carritoDeCompra;

    public void mostrarProductosDisponibles(){
        System.out.println("********** Productos Disponibles ********");
        System.out.println("P");
    }

    public void agregarArticuloAlCarrito(Articulo articulo){

    }

    public void pagar(MediosDePago mediosDePago){

    }

    public void salir(){
        System.out.println("Adios!");
    }
}
