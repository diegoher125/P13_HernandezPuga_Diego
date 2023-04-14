package main.java.ieseuropa;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

public class Prueba {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate inicio = LocalDate.of(2021, 1, 1);
        LocalDate fin = LocalDate.of(2020, 1, 1);
        
        long dias = DAYS.between(inicio, fin);
 
        System.out.println("Numero de dias: " + dias);
        
        
        Producto uno = new NoPerecedero("", 1.2f, 15);
        Producto dos = new Fresco("", 1.2f, 15, 1.6f);
        Producto tres = new Congelado("", 1.2f, 15, 1.6f);
        
        
        
	}

}
