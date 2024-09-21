package gt.edu.miumg;

public class PagoTarjetaCredito implements MetodoPago {
    @Override
    public void validarPago(double monto) {
        System.out.println("Validando pago con tarjeta de crédito por el monto de Q: " + monto);
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con tarjeta de crédito por el monto de Q: " + monto);
    }
}
