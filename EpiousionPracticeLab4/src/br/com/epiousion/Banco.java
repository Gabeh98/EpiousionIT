package br.com.epiousion;

public class Banco {
	private String nome;
	private int numero;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Banco [nome=" + nome + ", numero=" + numero + "]";
	}
	
}
