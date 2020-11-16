package br.com.epiousion;

public class Conta {
	private double saldo=0;
	public double getSaldo() {
		return saldo;
	}

	private String numero;
	private Agencia agencia;
	private Cliente cliente;
	

	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	void saque(double valor) {
		saldo -= valor; 
	}
	void deposito(double valor) {
		saldo+=valor;
	}
	
	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + ", numero=" + numero + ", agencia=" + agencia + ", cliente=" + cliente + "]";
	}
	
	
}
