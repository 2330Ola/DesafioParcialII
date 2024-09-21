package gt.edu.miumg;

public class PagoPayPal implements MetodoPago {
    @Override
    public void validarPago(double monto) {
        System.out.println("Validando pago con PayPal por el monto de Q: " + monto);
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con PayPal por el monto de Q: " + monto);
    }
}
