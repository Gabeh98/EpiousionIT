/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
public class TestaConta {

    public static void main(String[] args) {
        // Criar um objeto do tipo Conta
        // Usar o metodo inicializaConta para fazer a inicializacao do objeto criado
        // executar um deposito
        // Imprimir o saldo apos o deposito
        // executar um saque cujo valor seja menor que o saldo
        // Imprimir o saldo apos o deposito
        // executar uma retirada cujo valor seja maior que o saldo
        // Imprimir o saldo apos o deposito
    	
    	
    	Conta conta = new Conta();  
    	conta.inicializaConta(0, "1", "Gabriel", 2, 3);
    	
    	conta.deposito(1000);
    	System.out.println(conta.getSaldo());
    	
    	conta.saque(100);
    	System.out.println(conta.getSaldo());
    	
    	conta.saque(9000);
    	System.out.println(conta.getSaldo());
    	
    }
}
