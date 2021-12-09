package models;

public abstract class  AbstractPlayer {
	protected String nombre;
	protected int puntos;
	protected Mano mano;
	protected Mesa mesa;
	
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
