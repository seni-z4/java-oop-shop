package org.lessons.java.shop;

import java.util.Random;

public class prodotto {

	/*
	 * Nel progetto java-oop-shop, package org.lessons.java.shop, @FATTO creare la
	 * classe Prodotto che gestisce i prodotti dello shop. @FATTO Un prodotto è
	 * caratterizzato da:@FATTO - codice (numero intero)@FATTO - nome @FATTO -
	 * descrizione @FATTO - prezzo @FATTO - iva Usate@FATTO opportunamente i livelli
	 * di accesso (public, private), i costruttori, i metodi getter e setter ed
	 * eventuali altri metodi di “utilità” per fare in modo che: - alla creazione di
	 * un nuovo prodotto il codice sia valorizzato con un numero random - il codice
	 * prodotto sia accessibile solo in lettura - gli altri attributi siano
	 * accessibili sia in lettura che in scrittura - il prodotto esponga un metodo
	 * per avere il prezzo base - il prodotto esponga un metodo per avere il prezzo
	 * comprensivo di iva - il prodotto esponga un metodo per avere il nome esteso,
	 * ottenuto concatenando codice-nome Nello stesso package aggiungete una classe
	 * Main con metodo main nella quale testate tutte le funzionalità della classe
	 * Prodotto.
	 */

	private double codice;
	private String nome;
	private String descrizione;
	private int prezzo;
	private int iva;
	

//	public prodotto() {
//		 this.codice = numeroRandom();
//	}

	public String stampaProdotto() {
		return codice + nome + descrizione;
	}

	public int getPrezzoIva() {
		return prezzo + iva;
	}

//	public int numeroRandom() {
//	}
	
	Random random = new Random();
	int upperbound = 10000;
	
	int min = 1;
	int max = 10000;

	int rand = random.nextInt(random.nextInt(max - min + 1) + min);
	
	
	public double getCodice() {
		return rand;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public String getdescrizione() {
		return descrizione;
	}
	public String setdescrizione(String descrizione) {
		return this.descrizione = descrizione;
	}
	public int getPrezzo() {
		return prezzo;
	}
	public int setPrezzo(int price) {
		return this.prezzo = prezzo;
	}
	
}
