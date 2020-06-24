package model.producto;

public class Polera extends Articulo{

    private String color;

    public Polera(int precio, String nombre, String codigo, int talla, String marca, String color) {
        super(precio, nombre, codigo, talla, marca);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
