package models;

import java.util.Scanner;

public class HumanPlayer extends AbstractPlayer{

	public HumanPlayer(String nombre) {
		super(nombre);
	}

	
	@Override
	void jugarTurno() {
		Scanner sc = new Scanner(System.in);
		boolean juego=true;
		do {
			System.out.println("Qué quieres hacer?");
			System.out.println("1. Robar\n2.Pasar");
			int decision = Integer.parseInt(sc.next());
			switch (decision) {
			case 1:
				Carta carta = this.mesa.robarCartaDeBaraja();
				this.mano.lista_cartas.add(carta);
				this.puntos = 0;
				System.out.println();
				for (Carta c : this.mano.lista_cartas) {
					System.out.println(c.getNombreCarta());
					this.puntos = this.puntos + c.getValor7ymedia();
				}
				System.out.println();
				if(this.puntos > 7.5) {
					System.out.println("\nCagaste\n");
					this.perdido=true;
				}
				break;
			case 2:
				juego=false;
				break;
			default :
				System.out.println("Incorrecto. Elija una opción válida");
					break;
			}
		} while(juego && !this.perdido);
	}
	
	

}
