package model.pago;

public class TarjetaDebito implements MediosDePago{

    @Override
    public void pagar(int monto) {
        System.out.println("Pagando Debito: " + monto);
    }
}
