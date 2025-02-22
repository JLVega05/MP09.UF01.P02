package jairon.vega.joc3d;

public class Main {
	public static void main(String[] args) {
		EntornJoc entorn = new EntornJoc(800, 600, 400);
		EventJoc e01 = new EventJoc("Meteorit", null, entorn);
		EventJoc e02 = new EventJoc("Misil", 2, entorn);
		EventJoc e03 = new EventJoc("Pantà", 5, entorn);
		
		e01.start();
		e02.start();
		e03.start();
	}
}
