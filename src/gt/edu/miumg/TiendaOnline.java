package gt.edu.miumg;

public class TiendaOnline {
    private MetodoPago metodoPago;

    // Permite seleccionar el método de pago dinámicamente
    public void seleccionarMetodoPago(MetodoPago metodo) {
        this.metodoPago = metodo;
    }

    // Procesa la compra usando el método de pago seleccionado
    public void procesarCompra(double monto) {
        if (metodoPago == null) {
            System.out.println("Por favor, seleccione un método de pago.");
        } else {
            metodoPago.validarPago(monto);
            metodoPago.procesarPago(monto);
        }
    }
}

