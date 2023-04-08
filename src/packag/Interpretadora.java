package packag;

import java.util.Arrays;
import java.util.HashSet;

public class Interpretadora {
	
	private HashSet<String> palavrasChave;

	public  HashSet<String> getpalavrasChave() {
		return palavrasChave;
	}

	public void getpalavrasChave( HashSet<String> palavrasChave) {
		this.palavrasChave = palavrasChave;
	}

	public Interpretadora( HashSet<String> palavrasChave) {
		this.palavrasChave = palavrasChave;
	}
	public Interpretadora() {
		this.palavrasChave = new HashSet<String>();
	}
	public void separarPalavras(String frase) {
		String[] palavras = frase.split("\\s+"); // divide a frase em um array de palavras
	    this.palavrasChave = new HashSet<>(Arrays.asList(palavras)); // adiciona as palavras ao HashSet		
	}
	

}
