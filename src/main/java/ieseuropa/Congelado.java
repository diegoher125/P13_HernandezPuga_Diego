package main.java.ieseuropa;

public class Congelado extends Perecedero {

	public Congelado(String nombre, float precio, int stock, float tempCons) {
		super(nombre, precio, stock, tempCons);
	}

	public Congelado(String nombre, float precio, int stock, String fechaCreacion, float tempCons) {
		super(nombre, precio, stock, fechaCreacion, tempCons);
	}
	
}
