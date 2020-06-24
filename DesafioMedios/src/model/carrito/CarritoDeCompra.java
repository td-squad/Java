package model.carrito;

import model.producto.Articulo;

import java.util.ArrayList;

public class CarritoDeCompra {

    private ArrayList<Articulo> articulos;
    private int montoTotal;

    public CarritoDeCompra() {
        articulos = new ArrayList<>();
        montoTotal = 0;
    }

    public void agregarArticulo(Articulo articulo){
        articulos.add(articulo);
        montoTotal = montoTotal + articulo.getPrecio();
    }


}
