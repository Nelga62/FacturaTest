package factura;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductoTest {

	@Test
	void testNuevo() {
		Producto p = new Producto("pan", 0.50f, 1);
		assertEquals(p.getNombre(), "pan");
		assertEquals(p.getPrecio(), 0.5);
		assertEquals(p.getCantidad(), 1);
	}
	
	@Test
	void testPrecioTotal() {
		Producto p = new Producto("manzana", 0.40f, 6);
		assertEquals(p.precioTotal(), p.getPrecio() * p.getCantidad());
	}

}
