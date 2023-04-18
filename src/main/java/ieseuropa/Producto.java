package main.java.ieseuropa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Producto {
	
	private String nombre;
	private float precio;
	private int stock;
	private LocalDate fechaCreacion;
	
	public Producto(String nombre, float precio, int stock, LocalDate fechaCreacion) {
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
		this.fechaCreacion = fechaCreacion;
	}
	
	public Producto(String nombre, float precio, int stock) {
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
		this.fechaCreacion = LocalDate.now();
	}
	
	public Producto(String nombre) {
		this.nombre = nombre;
		this.precio = 0;
		this.stock = 0;
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
