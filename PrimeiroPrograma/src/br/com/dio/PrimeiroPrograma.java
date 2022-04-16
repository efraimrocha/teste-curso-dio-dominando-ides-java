package br.com.dio;

import br.com.dio.model.Cao;
import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Cao cao = new Cao();
		Livros livros = new Livros();
	
		System.out.println(gato);
		System.out.println(livros);
		System.out.println(cao);

	}

}


class Livros{
	private String nome;
	private String npage;
	@Override
	public String toString() {
		return "Livros [nome=" + nome + ", npage=" + npage + "]";
	}
	
	
}