package models;

public class Carta {
	private int numero;
	private int palo;

	/**
	 * @param numero
	 * @param palo
	 */
	public Carta(int numero, int palo) {
		super();
		this.numero = numero;
		this.palo = palo;
	}

	/**
	 * @param id
	 */
	public Carta(int id) {
		super();
		if (id < 81 && id > 40) {
			id = id - 40;
		}
		if (id % 10 == 0) {
			this.numero = 10;
		} else {
			this.numero = id % 10;
		}
		this.palo = (id - 1) / 10;
	}

	/**
	 * @return the id
	 */
	public int getId(int numero, int palo) {
		int id = palo * 10 + numero;
		return id;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return this.numero;
	}

	/**
	 * @return the palo
	 */
	public int getPalo() {
		return this.palo;
	}

	/**
	 * @return the nombrePalo
	 */
	public String getNombrePalo(int palo) {
		String[] array = { "oros", "copas", "espadas", "bastos" };
		if (palo >= 0 && palo < array.length) {
			String nombrePalo = array[palo];
			return nombrePalo;
		} else {
			System.out.println("Numero incorrecto, algo falla");
			return null;
		}
//		switch (palo) {
//		case 1:
//			nombrePalo = "oros";
//			break;
//		case 2:
//			nombrePalo = "copas";
//			break;
//		case 3:
//			nombrePalo = "espadas";
//			break;
//		case 4:
//			nombrePalo = "bastos";
//			break;
//		default:
//			System.out.println("ERROR");
//			break;
//		}

	}

	/**
	 * @return the nombreNumero
	 */
	public String getNombreNumero() {
		if (this.numero >= 0 && this.numero <= 10) {
			String[] num = { "as", "2", "3", "4", "5", "6", "7", "sota", "caballo", "rey" };
			String nombreNumero = num[this.numero - 1];
			return nombreNumero;
		} else {
			System.out.println("Ta mal");
			return null;
		}
//		switch (numero) {
//		case 1:
//			nombreNumero = "as";
//			break;
//		case 8:
//			nombreNumero = "sota";
//			break;
//		case 9:
//			nombreNumero = "caballo";
//			break;
//		case 10:
//			nombreNumero = "rey";
//			break;
//		default:
//			if (numero > 0 && numero < 8) {
//
//			}
//			break;
//		}	
	}

	/**
	 * @return the nombreCarta
	 */
	public String getNombreCarta() {
		String[] num = { "as", "2", "3", "4", "5", "6", "7", "sota", "caballo", "rey" };
		String[] array = { "oros", "copas", "espadas", "bastos" };
		String nombreCarta = num[this.numero - 1] + " de " + array[this.palo];
		return nombreCarta;
	}

	/**
	 * @return the valorTute
	 */
	public int getValorTute() {
		int valorTute;
		if(this.numero>0 && this.numero<11) {
		switch(this.numero) {
		case 1:
			valorTute=11;
			break;
		case 3:
			valorTute=10;
			break;
		case 10:
			valorTute=4;
			break;
		case 9:
			valorTute=3;
			break;
		case 8:
			valorTute=2;
			break;
			default :
				valorTute=0;
		}
		}else {
			System.out.println("Aquí hay un error");
			return 0;
		}
		return valorTute;
	}

	/**
	 * @return the valorMus
	 */
	public int getValorMus() {
		int valorMus;
		int[] array = {1,1,10,4,5,6,7,10,10,10};
		valorMus=array[this.numero-1];
//		switch(this.numero) {
//		case 1:
//		case 2:
//			valorMus=1;
//			break;
//		case 3:
//		case 8:
//		case 9:
//		case 10:
//			valorMus=10;
//			break;
//			default :
//				
//		}
		return valorMus;
	}

	/**
	 * @return the valor7ymedia
	 */
	public double getValor7ymedia() {
		double valor7ymedia;
		double[] array = {1,2,3,4,5,6,7,0.5,0.5,0.5};
		valor7ymedia=array[this.numero-1];
		return valor7ymedia;
	}

}
