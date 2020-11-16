package br.com.epiousion;


public class Agenda {
	
	private Contato contato;
	
	public Agenda(){
	}
	public Agenda(Contato contato) {
		this.contato = contato;
	}
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	@Override
	public String toString() {
		return "Agenda [contato=" + contato + "]";
	}

}
