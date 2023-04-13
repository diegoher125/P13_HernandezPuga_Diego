package main.java.ieseuropa;

import java.time.LocalDate;
import java.time.Period;

public abstract class Perecedero extends Producto {
	
	private float tempCons;
	private boolean caducado;

	public Perecedero(String nombre, float precio, int stock, String fechaCreacion, float tempCons) {
		super(nombre, precio, stock, fechaCreacion);
		this.tempCons = tempCons;
	}

	public Perecedero(String nombre, float precio, int stock, float tempCons) {
		super(nombre, precio, stock);
		this.tempCons = tempCons;
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
	/*
	private boolean comprobarCaducidad() {
		if(Period.between(getFechaCreacion(), LocalDate.now())) {
			return true;
		}else {
			return false;
		}
	}*/

	@Override
	public String toString() {
		return "Perecedero [ nombre=" + getNombre() + ", precio=" + getPrecio()
				+ ", stock=" + getStock() + ", fecha de creacion=" + getFechaCreacion() + ", tempCons=" + tempCons + "]";
	}
	
}
