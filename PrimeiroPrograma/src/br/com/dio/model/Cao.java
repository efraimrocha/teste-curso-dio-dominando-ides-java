package br.com.dio.model;

import java.util.Objects;

public class Cao {

	private String nome;
	private String raca;
	private String cor;
	private Integer idade;
	
	
	
	public Cao() {
	}


	public Cao(String nome, String raca, String cor, Integer idade) {
		super();
		this.nome = nome;
		this.raca = raca;
		this.cor = cor;
		this.idade = idade;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getRaca() {
		return raca;
	}


	public void setRaca(String raca) {
		this.raca = raca;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public Integer getIdade() {
		return idade;
	}


	public void setIdade(Integer idade) {
		this.idade = idade;
	}


	@Override
	public String toString() {
		return "Cao [nome=" + nome + ", raca=" + raca + ", cor=" + cor + ", idade=" + idade + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(cor, idade, nome, raca);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cao other = (Cao) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome)
				&& Objects.equals(raca, other.raca);
	}
	
	
	
	
}
