package model.productos;

public class Zapato extends Producto{

    private String modelo;

    public Zapato(int precio, String nombre, String codigo, int talla, String marca, String modelo) {
        super(precio, nombre, codigo, talla, marca);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
