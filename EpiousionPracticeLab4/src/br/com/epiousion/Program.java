package br.com.epiousion;

public class Program {

	public static void main(String[] args) {
		
		Banco banco = new Banco();
		Agencia agencia = new Agencia();
		Cliente cliente = new Cliente();
		Conta conta = new Conta();
		
		banco.setNome("Itau");
		banco.setNumero(50);
		
		agencia.setNome("AgenciaItau");
		agencia.setNumero("123");
		agencia.setBanco(banco);
		
		cliente.setNome("Gabriel");
		cliente.setCpf("463");
		
		conta.setNumero("555");
		conta.setAgencia(agencia);
		conta.setCliente(cliente);
		
		System.out.println(conta);
		
		conta.deposito(500);
		System.out.println();
		System.out.println("Saldo atual: " + conta.getSaldo() + " R$");
		conta.saque(100);
		System.out.println();
		System.out.println("Saldo atual: " + conta.getSaldo() + " R$");
	}

}
