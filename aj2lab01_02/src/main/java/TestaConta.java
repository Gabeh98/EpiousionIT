/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
class TestaConta {

    public static void main(String[] args) {
        // Criacao da conta
        // Inicializacao da conta
        // Impressao dos dados da conta
        // Saque da conta
        // Impressao dos dados da conta
        // Deposito em conta
        // Impressao dos dados da conta
    	
    	Conta conta = new Conta();
    	conta.inicializaConta(0,"2", "Gabriel", 1, 1);
    	
    	
    	
    	conta.deposito(200);
    	conta.saque(50);

    	
    	conta.imprimeDados();
    	
    	System.out.println(conta.getSaldo());
    	
    }
}
