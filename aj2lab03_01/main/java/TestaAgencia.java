/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
public class TestaAgencia {

    public static void main(String[] args) {
        // Inicializar um objeto do tipo Agencia
        // usar o metodo inicializaAgencia (ver quais sao os parametros na classe Agencia)
        // Imprimir os dados da agencia
    	Agencia agencia = new Agencia();
    	
    	agencia.inicializaAgencia("1", 2);
    	agencia.imprimeDados();
    }
}
