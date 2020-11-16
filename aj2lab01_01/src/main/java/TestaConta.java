/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 
 * 1) Crie um objeto da classe Conta 
 * 2) Inicialize todos os atributos deste objeto 
 * 3) Imprima os valores dos atributos da classe Conta de forma a obter o seguinte resultado:
 * 
 * ----------------------------- 
 * AGENCIA: 1 BANCO : 234 
 * NUMERO : 01945 
 * TITULAR: Globalcode 
 * SALDO : R$10000.0
 * -----------------------------
 * 
 * Sugestoes: 
 * Utilizando '\t' para tab
 * Ex: System.out.println("Texto\tTexto");
 * 
 * voce produzira a seguinte saida: 
 * Texto  Texto
 */
class TestaConta {

    public static void main(String[] args) {
    	Conta conta = new Conta();
    	conta.agencia = 1;
    	conta.banco = 234;
    	conta.numero = "01945";
    	conta.titular = "Globalcode";
    	conta.saldo = 10000.0;
    	
    	System.out.println("AGENCIA: " + conta.agencia + " BANCO:" + conta.banco);
    	System.out.println("NUMERO : " + conta.numero);
    	System.out.println("TITULAR: " + conta.titular);
    	System.out.println("SALDO : R$" + conta.saldo);
    	
    }
}
