package models;

import java.util.Scanner;

public class Game extends AbstractGame {

	@Override
	public void bienvenida() {
		System.out.println("Bienvenido al mejor juego de cartas.");
		menuPrincipal();
	}

	@Override
	public void menuPrincipal() {
		Scanner sc = new Scanner(System.in);
		boolean juego = true;
		this.mesa = new Mesa();
		do {
			System.out.println("\n¿Quieres jugar a las 7 y media?\n");
			System.out.println("1.Jugar\n2.Añadir jugador\n3.Salir");
			int decision = Integer.parseInt(sc.next());
			switch (decision) {
			case 1:
				if(this.jugadores.isEmpty()) {
					System.out.println("\nDebe haber mínimo 1 jugador.");
				} else {
					System.out.println("\n¿Quiere jugar con 1 o 2 barajas?");
					int tipbar = Integer.parseInt(sc.next());
					mesa.setBaraja(tipbar);
					start();
				}
				break;
			case 2:
				
				System.out.print("\nIntroduzca número de jugadores: ");
				int njug = Integer.parseInt(sc.next());
				for (int i = 0; i < njug; i++) {
					System.out.print("\nIntroduzca su nombre Jugador ");
					String nombre = sc.next();
					HumanPlayer jugador = new HumanPlayer(nombre);
					jugador.setMesa(this.mesa);
					jugador.setMano(new Mano());
					this.jugadores.add(jugador);
				} 
				break;
			case 3:
				System.out.println("\nAdios, estas perdiendo tu tiempo al no jugar a este maravilloso juego.");
				juego = false;
				break;
			default:
				System.out.println("\n¿NO SABES LEER?");
			}
		} while (juego);
		sc.close();
	}

	@Override
	public AbstractPlayer nextTurno() {
		return null;
	}

	@Override
	public void start() {
		for (AbstractPlayer c : this.jugadores) {
			System.out.println("\nTurno del jugador " + c.getNombre() + "\n");
			c.jugarTurno();
		}
		double num = 0; 
		for (AbstractPlayer c : this.jugadores) {
			if(c.getPuntos()>num && !c.perdido) {
				num=c.getPuntos();
			}
		}
		for (AbstractPlayer c : this.jugadores) {
			if(c.getPuntos()==num){
				System.out.println("\nHa ganado "+ c.getNombre() + "\n") ;
			}
		}
	}

}
