package model.producto;

import java.util.ArrayList;

public class ProductosDisponibles {
    private ArrayList<Articulo> productos;

    public ProductosDisponibles() {
        productos = new ArrayList<>();
        productos.add(
                new Pantalon(
                        1000,
                        "Variant Caqui Corto",
                        "1000",
                        30,
                        "Variant",
                        "Caqui",
                        2
                )
        );

        productos.add(
                new Pantalon(
                        2000,
                        "Variant Caqui Largo",
                        "1001",
                        33,
                        "Variant",
                        "Negro",
                        2
                )
        );

        productos.add(
                new Polera(
                        10000,
                        "Polera X",
                        "101010",
                        30,
                        "Marca X",
                        "negro"
                )
        );
    }

    public void mostrarProductosDisponibles(){
        for(Articulo aux : productos){
            System.out.println(aux.toString());
        }
    }
}
