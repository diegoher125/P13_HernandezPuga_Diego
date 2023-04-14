package main.java.ieseuropa;

import java.time.LocalDate;
import java.time.Period;
import static java.time.temporal.ChronoUnit.DAYS;

public class Perecedero extends Producto {
	
	private float tempCons;
	private boolean caducado;
	private int dParaCad;

	public Perecedero(String nombre, float precio, int stock, String fechaCreacion, float tempCons, int dParaCad) {
		super(nombre, precio, stock, fechaCreacion);
		this.tempCons = tempCons;
		this.dParaCad = dParaCad;
	}

	public Perecedero(String nombre, float precio, int stock, float tempCons, int dParaCad) {
		super(nombre, precio, stock);
		this.tempCons = tempCons;
		this.dParaCad = dParaCad;
	}

	public float getTempCons() {
		return tempCons;
	}

	public void setTempCons(float tempCons) {
		this.tempCons = tempCons;
	}

	public boolean isCaducado() {
		return caducado;
	}

	public void setCaducado(boolean caducado) {
		this.caducado = caducado;
	}
	
	public int getdParaCad() {
		return dParaCad;
	}

	public void setdParaCad(int dParaCad) {
		this.dParaCad = dParaCad;
	}
	
	@Override
	public String reducirStock(int red) {
		if(!isCad()) {
			return super.reducirStock(red);
		}else {
			return "Esta caducado no se puede comprar";
		}
	}

	private boolean isCad() {
		if(DAYS.between(getFechaCreacion(), LocalDate.now()) <= 0) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Perecedero [ nombre=" + getNombre() + ", precio=" + getPrecio()
				+ ", stock=" + getStock() + ", fecha de creacion=" + getFechaCreacion() + ", tempCons=" + tempCons + "]";
	}
	
}
