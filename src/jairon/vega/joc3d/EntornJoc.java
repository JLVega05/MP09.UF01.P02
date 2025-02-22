package jairon.vega.joc3d;

import java.util.Random;

public class EntornJoc {
	private int ampleMaximPantalla;
	private int alturaMaximPantalla;
	private int midaProfunditatPantalla;
	private Random random = new Random();
	
	public EntornJoc(int ampleMaximPantalla, int alturaMaximPantalla, int midaProfunditatPantalla) {
		this.ampleMaximPantalla = ampleMaximPantalla;
		this.alturaMaximPantalla = alturaMaximPantalla;
		this.midaProfunditatPantalla = midaProfunditatPantalla;
	}

	public int getAmpleMaximPantalla() {
		return ampleMaximPantalla;
	}

	public int getAlturaMaximPantalla() {
		return alturaMaximPantalla;
	}

	public int getMidaProfunditatPantalla() {
		return midaProfunditatPantalla;
	}

	public int getPosicioX() {
		return getPosicio(0, ampleMaximPantalla);
	}

	public int getPosicioY() {
		return getPosicio(0, alturaMaximPantalla);
	}

	public int getPosicioZ() {
		return getPosicio(0, midaProfunditatPantalla);
	}

	private int getPosicio(int min, int max) {
		int range = (max - min) + 1;
		return random.nextInt(range) + min;
	}
}
