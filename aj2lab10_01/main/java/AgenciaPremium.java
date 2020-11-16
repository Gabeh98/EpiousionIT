/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 *
 * 
 * 1) Modifique esta classe para que herde de Agencia
 * 
 * 2) Acrescente um construtor valido. 
 * 
 * 3) Sobrescreva o metodo abstrato ajustarLimiteIndividual
 *    de acordo com as seguintes regras de negocio:
 *    
 *    a) se o saldo estiver negativo, abaixo de -5000.00 o limite deve ser ajustado para 1000.00
 *    b) se o saldo estiver positivo, abaixo de +5000.00 o limite deve ser ajustado para 30% do saldo  
 *    c) se o saldo estiver positivo, acima de  +5000.00 o limite deve ser ajustado para 50% do saldo
 * 
 */
public class AgenciaPremium extends Agencia {

	public AgenciaPremium(String num, Banco bc) {
		super(num, bc);
	}
	@Override
    public void ajustarLimites(ContaEspecial[] contasEspeciais) {
        System.out.println("===================================================================");
        System.out.println("Agencia: " + this.getNumero() + " ajustando limites");
        
        for (int i = 0; i < contasEspeciais.length; i++) {
            ContaEspecial ce = contasEspeciais[i];
            if (ce != null) {
                if (ce.getAgencia() != this) {
                    System.out.println("A conta " + ce.getNumero() + " nao pertence a esta agencia");
                } else {
                    double limiteAntigo = ce.getLimite();
                    ajustarLimiteIndividual(ce); // metodo abstrato
                    double limiteAjustado = ce.getLimite();
                    System.out.println("conta " + ce.getNumero() +
                                       "\tlimite antigo: " + limiteAntigo +
                                       "\tlimite ajustado: " + limiteAjustado);
                }
            }
        }
        System.out.println("limites ajustados");
        System.out.println("===================================================================");
    }
	@Override
	protected void ajustarLimiteIndividual(ContaEspecial contaEspecial) {
		if (contaEspecial.saldo<-5000) {
			contaEspecial.setLimite(1000);
		}
		else if(contaEspecial.saldo<=5000) {
			contaEspecial.setLimite(contaEspecial.saldo*.3);
		}
		else{
			contaEspecial.setLimite(contaEspecial.saldo*.5);
		}
			
	}
}
