package factura;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FacturaTest {

	@Test
	void testTotalFactura() {
		Factura factura = new Factura();
		factura.meterProducto(new Producto("camiseta", 10, 2));
		factura.meterProducto(new Producto("sudadera", 50, 1));
		factura.meterProducto(new Producto("pantalón", 25, 3));
		assertEquals(factura.totalFactura(), 145);
	}
	
	@Test
	void testAplicarIva() {
		Factura factura = new Factura();
		factura.meterProducto(new Producto("camiseta", 10, 2));
		factura.meterProducto(new Producto("sudadera", 50, 1));
		factura.meterProducto(new Producto("pantalón", 25, 3));
		assertEquals(factura.aplicarIva(0.21f), 145 * 1.21f);
	}

}
