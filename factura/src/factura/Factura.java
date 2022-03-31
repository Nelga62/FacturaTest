package factura;

import java.util.Vector;

public class Factura {
	private Vector<Producto> productos;

	public Factura() {
		this.productos = new Vector<>();
	}
	
	public Vector<Producto> getProductos() {
		return productos;
	}

	public void setProductos(Vector<Producto> productos) {
		this.productos = productos;
	}

	public void meterProducto(Producto p) {
		productos.add(p);
	}
	
	public float totalFactura() {
		float suma = 0;
		for(Producto p : productos) {
			suma += p.precioTotal();
		}
		return suma;
	}
	
	public float aplicarIva(float iva) {
		return totalFactura() * (1 + iva);
	}
	
}
