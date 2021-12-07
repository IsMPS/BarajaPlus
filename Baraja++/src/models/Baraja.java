package models;

import java.util.ArrayList;
import java.util.Collections;

public class Baraja {
	
	public static void main(String[] args) {
	}
	
	protected ArrayList<Carta> lista_cartas;

	/**
	 * @param lista_cartas
	 */
	public Baraja() {
		super();
		this.lista_cartas = new ArrayList<Carta>(40);
	}

	/**
	 * @param lista_cartas
	 */
	public Baraja(int tipobaraja) {
		super();
		this.lista_cartas = new ArrayList<Carta>(tipobaraja*40);
		for (int i = 1; i <= tipobaraja * 40; i++) {
			this.lista_cartas.add(new Carta(i));
		}
	}

	/**
	 * @param lista_cartas
	 */
	public Baraja(int tipobaraja, boolean barajar) {
		super();
		this.lista_cartas = new ArrayList<Carta>(tipobaraja*40);
		for (int i = 1; i <= tipobaraja * 40; i++) {
			this.lista_cartas.add(new Carta(i));
		}
		if(barajar) {
		Barajar();
		}
	}

	public void Barajar() {
//		ArrayList<Carta> baraja = new ArrayList<Carta>();
//		ArrayList<Carta> barajabarajada = new ArrayList<Carta>();
//		for (int i = 1; i <= 40; i++) {
//			baraja.add(new Carta(i));
//		}
//		for (Carta c : baraja) {
//				int num = (int) Math.random() * baraja.size();
//				barajabarajada.add(baraja.remove(num));
//		}
//		this.lista_cartas = barajabarajada;
		Collections.shuffle(this.lista_cartas);
	}
	
	public void Cortar(int posicion) {
		for (int i = 1; i < posicion; i++) {
			this.lista_cartas.add(0,this.lista_cartas.remove(posicion));
		}
	}
	
	public ArrayList<Carta> getLista_cartas() {
		return lista_cartas;
	}

	public Carta Robar() {
		Carta robada = this.lista_cartas.get(0);
		this.lista_cartas.remove(0);
		return robada;
	}
	
	public void InsertaCartaFinal(int id_carta) {
		this.lista_cartas.add(new Carta (id_carta));
	}
	
	public void InsertaCartaPrincipio(int id_carta) {
		this.lista_cartas.add(0, new Carta (id_carta));
	}
	
	public void InsertaCartaFinal(Carta c) {
		this.lista_cartas.add(c);
	}
	
	public void InsertaCartaPrincipio(Carta c) {
		this.lista_cartas.add(0, c);
	}
	
	public int getNumeroCartas() {
		return this.lista_cartas.size();
	}
	
	public boolean isVacia() {
		return this.lista_cartas.isEmpty();
	}
	
	
}
