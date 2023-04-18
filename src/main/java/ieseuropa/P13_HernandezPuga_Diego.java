package main.java.ieseuropa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class P13_HernandezPuga_Diego {
	
	private static String pedirString(String texto) {
		Scanner teclado = new Scanner(System.in);
		System.out.println(texto);
		return teclado.nextLine();
	}

	private static int pedirInt(String texto) {
		Scanner teclado = new Scanner(System.in);
		System.out.println(texto);
		return teclado.nextInt();
	}
	
	private static float pedirFloat(String texto) {
		Scanner teclado = new Scanner(System.in);
		System.out.println(texto);
		return teclado.nextFloat();
	}
	
	private static ArrayList<Producto> pedirProductos() {
		ArrayList<Producto> productos = new ArrayList<>();
		String nombre = "";
		while(!nombre.equals("0")) {
			nombre = pedirString("Introduzca el nombre del producto: ");
			if(!nombre.equals("0")) {
				productos.add(nuevoProducto(nombre));
			}
		}
		return productos;
	}
	
	private static Producto nuevoProducto(String nombre) {
		float precio = pedirFloat("Indique el precio: ");
		int stock = pedirInt("Indique el stock: ");
		switch(pedirInt("Indique su tipo(1-No perecedero, 2-Fresco, 3-Congelado)")) {
			default: 
				return new NoPerecedero(nombre, precio, stock);
			case 2: 
				return new Fresco(nombre, precio, stock, pedirFechaCreacion(), pedirFloat("Indique la temperatura de conservacion:"));
			case 3:
				return new Congelado(nombre, precio, stock, pedirFechaCreacion(), pedirFloat("Indique la temperatura de conservacion:"));
		}
	}
	
	private static LocalDate pedirFechaCreacion() {
		int dia = pedirInt("Indique su dia de entrada(0 = hoy");
		if(dia != 0) {
			return LocalDate.of(pedirInt("Indique su año de entrada"), pedirInt("Indique su mes de entrada"), dia);
		}else {
			return LocalDate.now();
		}
	}
	
	private static void hacerCompra(ArrayList<Producto> productos) {
		String nombre = "";
		while(!nombre.equals("0")) {
			nombre = pedirString("Introduzca el producto que va a comprar: ");
			if(!nombre.equals("0")) {
				System.out.println(productos.get(productos.indexOf(new Producto(nombre))).calcPrecioCompra());
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("¡¡Bienvenido al supermercado!!");
		System.out.println("Hoy es " + LocalDate.now().getDayOfMonth() + "-" + LocalDate.now().getMonthValue() + "-" + LocalDate.now().getYear());
		ArrayList<Producto> productos = pedirProductos();
		System.out.println("---------------------------------------");
		System.out.println("Empezamos con las compras");
		System.out.println("---------------------------------------");
		hacerCompra(productos);
	}

}
