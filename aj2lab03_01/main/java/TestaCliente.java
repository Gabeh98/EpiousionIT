/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
/**
 * @author Globalcode
 * 
 */
public class TestaCliente {

    public static void main(String[] args) {
        // Criacao do cliente
        // Inicializacao do cliente usando o metodo inicializaCliente
        // Impressao dos dados do cliente
    	Cliente cliente = new Cliente();
    	
    	cliente.setNome("Gabriel");
    	cliente.setCpf("123");
    	cliente.imprimeDados();
    }
}
