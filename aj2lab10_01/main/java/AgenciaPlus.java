/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 1) Analise os atributos e o construtor desta classe
 *  
 * 2) Sobrescreva o metodo abstrato ajustarLimiteIndividual herdado da classe Agencia 
 *    de acordo com as seguintes regras de negocio:
 *    
 *    a) se o saldo estiver abaixo do saldoMinimo o limite deve ser ajustado em -25%
 *    b) se o saldo estiver acima do saldoMaximo o limite deve ser ajustado em +25%
 *      
 */
public class AgenciaPlus extends Agencia {

    private double saldoMinimo;
    private double saldoMaximo;
    
    public AgenciaPlus(String num, Banco bc, double saldoMinimo, double saldoMaximo) {
        super(num, bc);
        this.saldoMinimo = saldoMinimo;
        this.saldoMaximo = saldoMaximo;
    }
    
    public double getSaldoMaximo() {
        return saldoMaximo;
    }

    public void setSaldoMaximo(double saldoMaximo) {
        this.saldoMaximo = saldoMaximo;
    }
    
    public double getSaldoMinimo() {
        return saldoMinimo;
    }
    
    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
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
                }
                else {
                    double limiteAntigo = ce.getLimite();
                    ajustarLimiteIndividual(ce); // metodo abstrato
                    double limiteAjustado = ce.getLimite();
                    System.out.println("conta " + ce.getNumero() +
                                       "\tlimite antigo: " + limiteAntigo +
                                       "\tlimite ajustado: " + limiteAjustado);
                }
            }
        }
    }

	@Override
	protected void ajustarLimiteIndividual(ContaEspecial contaEspecial) {
		if(contaEspecial.saldo<saldoMinimo) {
			contaEspecial.setLimite(contaEspecial.getLimite()-contaEspecial.getLimite()*.25);
		}
		else if(contaEspecial.saldo>saldoMaximo) {
			contaEspecial.setLimite(contaEspecial.getLimite()+contaEspecial.getLimite()*.25);
		}
	}
		
}




