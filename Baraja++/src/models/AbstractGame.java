package models;

import java.util.ArrayList;

public abstract class AbstractGame {
	protected boolean finished;
//	private enum modoJuego; 
	// solitario, 1vsCPU, PvP, multiplayer
	protected ArrayList<AbstractPlayer> jugadores = new ArrayList<AbstractPlayer>();
	protected Mesa mesa;
	protected int ronda;
	
	abstract void bienvenida();
	
	 abstract void menuPrincipal(); 
//		{
//		Scanner sc = new Scanner(System.in);
//		do {
//			boolean juegaso = falso;
//			System.out.println("A qué modo de juego quieres jugar?");
//			int modo =Integer.parseInt(sc.nextLine());
//			switch(modo) {
//			case 1:
//				modoJuego m1= modoJuego.solitario;  
//				break;
//			case 2:
//				modoJuego m1= modoJuego.1vsCPU;  
//				break;
//			case 3:
//				modoJuego m1= modoJuego.PvP;  
//				break;
//			case 4:
//				modoJuego m1= modoJuego.multiplayer;  
//				break;
//				default:
//					System.out.println("Error");
//					juegaso=true;
//					break;
//			}
//		}while(juegaso);
//	}
	
	abstract AbstractPlayer nextTurno();
	
	abstract void start();	
	
	public void barajar() {	
		this.mesa.baraja.Barajar();;
	}
	
	public void finish() {
		System.out.println("\nHa terminado la partida.");
		this.finished = false;
	}
	
	
}
