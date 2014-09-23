package edu.upc.eetac.dsa.asantamaria.ejerciciosobjetos;

public class Arbol {

	int high;
	String type;

	// Constructores

	public Arbol() {
		high = 0;
		type = "genérico";
		MostrarArbol();
	}

	public Arbol(int high) {
		this.high = high;
		type = "genérico";
		MostrarArbol(high);
		
	}

	public Arbol(String type) {
		high = 0;
		this.type = type;
		MostrarArbol(type);
	}

	public Arbol(int high, String type) {
		this.high = high;
		this.type = type;
		MostrarArbol(high,type);
	}

	// Metodos

	public void MostrarArbol() {
		System.out.println("Un árbol " + type);
	}
	public void MostrarArbol(String type) {
		System.out.println("Un " + type);
	}
	public void MostrarArbol(int high) {
		System.out.println("Un arbol de " + high + " metros");
	}
	public void MostrarArbol(int high, String type) {
		System.out.println("Un " + type + " de "+ high + " metros");
	}

}
