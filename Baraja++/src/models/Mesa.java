package models;

import java.util.ArrayList;
import java.util.List;

public class Mesa{
	private Baraja baraja;
	public Carta robarCartaDeBaraja() {
		return baraja.getLista_cartas().get(0);
				
	}
	
	public List<Carta> robarVariasCartas(int n){
		List<Carta> cartita = new ArrayList<Carta>();
		for (int i = 0; i < n; i++) {
			Carta carta = robarCartaDeBaraja();
			cartita.add(carta);
		}
		return cartita;
	}
	
	public void addCartaABaraja() {
//		Carta carta = elegirCarta();
//		InsertaCartaFinal(carta);
		baraja.InsertaCartaFinal(0);
	}
}
