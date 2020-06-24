package model.pago;

public class TarjetaCredito implements MediosDePago {

    @Override
    public void pagar(int monto) {
        System.out.println("Pagando crédito: " + monto);
    }

}
