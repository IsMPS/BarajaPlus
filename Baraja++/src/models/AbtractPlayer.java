package models;

public class AbtractPlayer {
	private String nombre;
	private int puntos;
	private Mano mano;
	private Mesa mesa;
	
	abstract void jugarTurno() {
		
	}
}
