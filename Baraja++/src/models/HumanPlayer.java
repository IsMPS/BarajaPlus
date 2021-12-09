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
		boolean perdido1=false;
		do {
			System.out.println("Qué quieres hacer?");
			System.out.println("1. Robar\n2.Pasar");
			int decision = Integer.parseInt(sc.next());
			switch (decision) {
			case 1:
				Carta carta = this.mesa.robarCartaDeBaraja();
				this.mano.lista_cartas.add(carta);
				double num = 0 ;
				System.out.println();
				for (Carta c : this.mano.lista_cartas) {
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
	}
	
	

}
