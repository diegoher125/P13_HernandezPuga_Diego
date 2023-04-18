package main.java.ieseuropa;

import java.time.LocalDate;

public class NoPerecedero extends Producto {

	public NoPerecedero(String nombre, float precio, int stock, LocalDate fechaCreacion) {
		super(nombre, precio, stock, fechaCreacion);
	}

	public NoPerecedero(String nombre, float precio, int stock) {
		super(nombre, precio, stock);
	}
	
	

}
