package gt.edu.miumg;

public class PagoTransferenciaBancaria implements MetodoPago {
    @Override
    public void validarPago(double monto) {
        System.out.println("Validando pago con transferencia bancaria por el monto de Q: " + monto);
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con transferencia bancaria por el monto de Q: " + monto);
    }
}
