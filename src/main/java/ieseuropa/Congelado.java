package main.java.ieseuropa;

import static java.time.temporal.ChronoUnit.DAYS;

import java.time.LocalDate;

public class Congelado extends Perecedero {

	public Congelado(String nombre, float precio, int stock, float tempCons) {
		super(nombre, precio, stock, tempCons, 21);
	}

	public Congelado(String nombre, float precio, int stock, String fechaCreacion, float tempCons) {
		super(nombre, precio, stock, fechaCreacion, tempCons, 21);
	}
	
	@Override
	public float calcPrecioCompra() {
		
		switch ((int)DAYS.between(getFechaCreacion(), LocalDate.now())) {
			case 4,5,6:
				return 0.8f;
			case 1,2,3:
				return 0.55f;
			default:
				return 1;
		}
	}
	
}
