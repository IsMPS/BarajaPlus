package models;

public abstract class  AbstractPlayer {
	protected String nombre;
	protected double puntos;
	protected Mano mano;
	protected Mesa mesa;
	protected boolean perdido;
	
	/**
	 * @return the puntos
	 */
	protected double getPuntos() {
		return puntos;
	}

	/**
	 * @param perdido the perdido to set
	 */
	protected void setPerdido(boolean perdido) {
		this.perdido = perdido;
	}


	/**
	 * @return the perdido
	 */
	protected boolean isPerdido() {
		return perdido;
	}

	/**
	 * @param nombre
	 * @param puntos
	 * @param mano
	 * @param mesa
	 */
	public AbstractPlayer(String nombre) {
		super();
		this.nombre = nombre;
		this.puntos = 0;
		this.mano = null;
		this.mesa = null;
	}

	
	/**
	 * @param mano the mano to set
	 */
	protected void setMano(Mano mano) {
		this.mano = mano;
	}



	/**
	 * @return the nombre
	 */
	protected String getNombre() {
		return nombre;
	}



	/**
	 * @param mesa the mesa to set
	 */
	protected void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}


	abstract void jugarTurno();
	
	
}
