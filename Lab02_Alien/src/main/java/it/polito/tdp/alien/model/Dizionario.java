package it.polito.tdp.alien.model;

import java.util.*;

/**
 * Memorizza e gestisce un dizionario
 * 
 * @author Giacomino
 *
 */
public class Dizionario {
	private List<Word> lista2 = new LinkedList<Word>();
	private List<Word> lista = new LinkedList<Word>();

	public void addWord(Word nuova) {
		if (this.giaPresente(nuova)) {
			this.aggiornaDizionario(nuova);
		} else {
			lista.add(nuova);
		}
	}

	public String translateWord(String alienword) {
		Word prova = new Word(alienword, "");
		if (this.giaPresente(prova))
			return this.cercaParola(prova).getTraduzione();
		else
			return null; //ciao
	}

	public boolean giaPresente(Word nuova) {
		if (lista.contains(nuova))
			return true;
		else
			return false;
	}

	public void aggiornaDizionario(Word nuova) {
		for (Word w : lista) {
			if (nuova.equals(w)) {
				w.setTraduzione(nuova.getTraduzione());
			}
		}
	}

	public Word cercaParola(Word parola) {
		for (Word w : lista) {
			if (parola.equals(w)) {
				return w;
			}
		}
		return null;
	}

	public String toString() {
		String elenco = "";
		for (Word w : lista) {
			elenco = elenco + w.toString() + "\n";
		}
		return elenco;
	}
}
