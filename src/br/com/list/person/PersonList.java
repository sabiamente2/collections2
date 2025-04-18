package br.com.list.person;

import java.util.ArrayList;
import java.util.List;

public class PersonList {
	List<Person> fen = new ArrayList<Person>();
	List<Person> male = new ArrayList<Person>();
	
	/** Método cria e introduz um novo Person para uma lista que sera definida de acordo com o genero masculino ou feminino
	 * 
	 * Retorna true se o genero é valido ou nãp
	 * Validação é true se genero igual à "f" (para feminino) ou "m" (para masculino).
	 * 
	 * @param nome - String
	 * @param genero - String
	 * @return boolean - retorna se genero é valido
	 */
	public boolean putInList(String nome, String genero){
		boolean gendervalid = true;
		boolean genderinvalid = false;
		if (genero.equalsIgnoreCase("f")) {
			genero = "Feminino";
			fen.add(new Person(nome, genero));
		}
		
		else if (genero.equalsIgnoreCase("m")) {
			genero = "Masculino";
			male.add(new Person(nome, genero));
		}
		return(genero.equalsIgnoreCase("f") || genero.equalsIgnoreCase("m")) ? gendervalid : genderinvalid;
	}
}
