package br.com.epiousion;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		
		ArrayList <Contato> agenda = new ArrayList<Contato>();
		
		Contato contato1 = new Contato();
		contato1.setNome("Gabriel");
		contato1.setNumero("15998198879");
		
		Contato contato2 = new Contato();
		contato2.setNome("Joaozin");
		contato2.setNumero("1599798198");

		agenda.add(contato1);
		agenda.add(contato2);
		
		System.out.println(agenda);
	
	}
}
