package model.despacho;

import model.carrito.OrdenDeDespacho;

public interface OrdenDeDespachoRepository {
    GuardarOrdenDeDespacho guardarOrdenDeDespacho(OrdenDeDespacho ordenDeDespacho);
}
