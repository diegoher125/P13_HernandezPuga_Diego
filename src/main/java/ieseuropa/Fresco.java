package main.java.ieseuropa;

public class Fresco extends Perecedero {

	public Fresco(String nombre, float precio, int stock, float tempCons) {
		super(nombre, precio, stock, tempCons);
	}

	public Fresco(String nombre, float precio, int stock, String fechaCreacion, float tempCons) {
		super(nombre, precio, stock, fechaCreacion, tempCons);
	}
	
}
