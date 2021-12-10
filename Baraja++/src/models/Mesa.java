package models;

import java.util.ArrayList;
import java.util.List;

public class Mesa{
	protected Baraja baraja;
	
	
	
	/**
	 * @param baraja
	 */
	public Mesa() {
		super();
		this.baraja = new Baraja();
	}

	/**
	 * @param baraja the baraja to set
	 */
	public void setBaraja(int tipbaraja) {
		baraja = new Baraja(tipbaraja,true);
	}

	public Carta robarCartaDeBaraja() {
		baraja.getLista_cartas().remove(0);
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
	
	public void addCartaABaraja(Carta c) {
		baraja.InsertaCartaFinal(c);
	}
}
