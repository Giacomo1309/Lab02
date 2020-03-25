package it.polito.tdp.alien.model;

public class TestDizionario {
	Dizionario diz;

	private void run() {
		diz = new Dizionario();
		Word w1 = new Word("hi","CIAO");
		Word w2 = new Word("word","parola");
		Word w3 = new Word("table","tavolo");
		Word w4 = new Word("table","sedia");
		
		diz.addWord(w1);
		diz.addWord(w2);
		diz.addWord(w3);
		diz.addWord(w4);
		//System.out.println("sara presente o no :"+ diz.giaPresente(w4));
		System.out.println("la lista e :"+ diz.toString());
		System.out.println("la traduzione di hi e "+ diz.translateWord("hi"));
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDizionario test = new TestDizionario();
		test.run();
	}

}
