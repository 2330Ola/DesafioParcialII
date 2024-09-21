package gt.edu.miumg;

public class Main {
    public static void main(String[] args) {
        TiendaOnline tienda = new TiendaOnline();

        // Prueba 1: Pago con Tarjeta de Crédito
        MetodoPago pagoTarjeta = new PagoTarjetaCredito();
        tienda.seleccionarMetodoPago(pagoTarjeta);
        tienda.procesarCompra(100.00);

        // Prueba 2: Pago con PayPal
        MetodoPago pagoPayPal = new PagoPayPal();
        tienda.seleccionarMetodoPago(pagoPayPal);
        tienda.procesarCompra(200.00);

        // Prueba 3: Pago con Criptomonedas
        MetodoPago pagoCripto = new PagoCriptomonedas();
        tienda.seleccionarMetodoPago(pagoCripto);
        tienda.procesarCompra(300.00);

        // Prueba 4: Pago con Transferencia Bancaria
        MetodoPago pagoTransferencia = new PagoTransferenciaBancaria();
        tienda.seleccionarMetodoPago(pagoTransferencia);
        tienda.procesarCompra(400.00);
    }
}
