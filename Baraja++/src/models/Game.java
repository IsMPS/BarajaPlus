package models;

import java.util.Scanner;

public class Game extends AbstractGame {

	@Override
	void bienvenida() {
		System.out.println("Bienvenido al mejor juego de cartas.");
		menuPrincipal();
	}

	@Override
	void menuPrincipal() {
		Scanner sc = new Scanner(System.in);
		boolean juego = true;
		do {
			System.out.println("¿A qué juego quieres jugar?");
			System.out.println("1.Jugar\n2.Salir\n");
			int decision = Integer.parseInt(sc.next());
			switch (decision) {
			case 1:
				start();
				break;
			case 2:
				System.out.println("Adios, estas perdiendo tu tiempo al no jugar a este maravilloso juego.");
				juego = false;
				break;
			default:
				System.out.println("¿NO SABES LEER?");
			}
		} while (juego);
	}

	@Override
	AbstractPlayer nextTurno() {
		return null;
	}

	@Override
	void start() {
		for (AbstractPlayer c : this.array) {
			System.out.println("Turno del jugador " + c.getNombre());
			c.jugarTurno();
		}
	}

}
