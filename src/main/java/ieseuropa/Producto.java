package main.java.ieseuropa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Producto {
	
	private String nombre;
	private float precio;
	private int stock;
	private LocalDate fechaCreacion;
	
	public Producto(String nombre, float precio, int stock, String fechaCreacion) {
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.fechaCreacion = LocalDate.parse(fechaCreacion, fmt);
	}
	
	public Producto(String nombre, float precio, int stock) {
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
		this.fechaCreacion = LocalDate.now();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	public float calcPrecioCompra() {
		return 1;
	}
	
	public String reducirStock(int red) {
		if(stock >= red) {
			this.stock -= red;
			return (precio * calcPrecioCompra()) + " €";
		}else {
			return "No hay tantos articulos";
		}
	}
	
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Producto)) {
			return false;
		}
		Producto product = (Producto) o;
		return this.nombre.equals(product.nombre);
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + ", fechaCreacion="
				+ fechaCreacion + "]";
	}

}
