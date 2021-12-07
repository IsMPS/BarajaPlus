package main;

import java.util.ArrayList;
import java.util.Scanner;

import models.Baraja;
import models.Carta;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean juego = true;
		boolean perdido1 = false;
		boolean perdido2 = false;
		boolean prog = true;
		double num1 = 0;
		do {
			ArrayList<Carta> mano1 = new ArrayList<Carta>();
			ArrayList<Carta> mano2 = new ArrayList<Carta>();
			Baraja baraja = new Baraja(1,true);
			double num = 0 ;
			System.out.println("Comienza la partida");
			do {
				menu();
				int decision = Integer.parseInt(sc.next());
				switch (decision) {
				case 1:
					Carta carta = baraja.Robar();
					mano1.add(carta);
					num = 0 ;
					System.out.println();
					for (Carta c : mano1) {
						System.out.println(c.getNombreCarta());
						num = num + c.getValor7ymedia();
					}
					System.out.println();
					if(num > 7.5) {
						System.out.println("\nCagaste\n");
						perdido1=true;
					}
					break;
				case 2:
					juego=false;
					break;
				default :
					System.out.println("Incorrecto. Elija una opción válida");
						break;
				}
			} while(juego && !perdido1);	
			System.out.println();
			System.out.println("Turno del segundo jugador");
			System.out.println();
			System.out.println("Comienza la partida");
			do {
				juego=true;
				menu();
				int decision = Integer.parseInt(sc.next());
				switch (decision) {
				case 1:
					Carta carta = baraja.Robar();
					mano2.add(carta);
					num1 = 0 ;
					System.out.println();
					for (Carta c : mano2) {
						System.out.println(c.getNombreCarta());
						num1 = num1 + c.getValor7ymedia();
					}
					System.out.println();
					if(num1 > 7.5) {
						System.out.println("\nCagaste\n");
						perdido2=true;
					}
					break;
				case 2:
					juego=false;
					break;
				default :
					System.out.println("Incorrecto. Elija una opción válida");
						break;
				}
			} while(juego && !perdido2);	
			if (perdido2 || num>num1) {
				System.out.println("Ha ganado el jugador 1");
			} else if (perdido1 || num1>num) {
				System.out.println("Ha ganado el jugador 2");
			} else {
				System.out.println("Empate");
			}
			System.out.println("\nQuieres seguir jugando?\n1. Si\n2. No");
			int decision = Integer.parseInt(sc.next());
			switch(decision) {
			case 1:
				prog=true;
				break;
			case 2:
				prog=false;
				break;
			}
		} while(prog);
		sc.close();
	}
	private static void menu() {
			System.out.println("Qué quieres hacer?");
			System.out.println("1. Robar\n2.Pasar");
	}
}
