package main.java.ieseuropa;

import static java.time.temporal.ChronoUnit.DAYS;

import java.time.LocalDate;

public class Fresco extends Perecedero {

	public Fresco(String nombre, float precio, int stock, float tempCons) {
		super(nombre, precio, stock, tempCons, 10);
	}

	public Fresco(String nombre, float precio, int stock, LocalDate fechaCreacion, float tempCons) {
		super(nombre, precio, stock, fechaCreacion, tempCons, 10);
	}
	
	public Fresco(String nombre) {
		super(nombre, 10);
	}
	
	@Override
	public float calcPrecioCompra() {
		switch ((int)DAYS.between(getFechaCreacion(), LocalDate.now())) {
			case 5:
				return 0.7f;
			case 3,4:
				return 0.5f;
			case 1,2:
				return 0.3f;
			default:
				return 1;
		}
	}
	
}
