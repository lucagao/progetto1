package com.example.restservice;

import java.util.ArrayList;

public class Fibonacci {
    
	int contatore;
	ArrayList<Integer> numero;
	
	public Fibonacci(int contatore, ArrayList<Integer> numero) {
		super();
		this.contatore = contatore;
		this.numero = numero;
	}
	public int getContatore() {
		return contatore;
	}
	public void setContatore(int contatore) {
		this.contatore = contatore;
	}
	public ArrayList<Integer> getNumero() {
		return numero;
	}
	public void setNumero(ArrayList<Integer> numero) {
		this.numero = numero;
	}

	
}
