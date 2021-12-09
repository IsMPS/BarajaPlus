package models;

import java.util.Scanner;

public class Mano extends Baraja{
	
	public void listarCartas() {
		for (Carta c : this.lista_cartas) {
			System.out.println(c.getNombreCarta());
		}
	}
	
	public Carta elegirCarta() {
		Scanner sc = new Scanner(System.in);
		listarCartas();
		System.out.println("Qué carta deseas seleccionar?");
		int posicion =Integer.parseInt(sc.nextLine());
		return this.lista_cartas.get(posicion-1);
	}
}
