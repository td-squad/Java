package model.productos;

public abstract class Producto {
    private int precio;
    private String nombre;
    private String codigo;
    private int talla;
    private String marca;

    public Producto(int precio, String nombre, String codigo, int talla, String marca) {
        this.precio = precio;
        this.nombre = nombre;
        this.codigo = codigo;
        this.talla = talla;
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
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

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
