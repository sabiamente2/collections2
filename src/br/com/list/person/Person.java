package br.com.list.person;

public class Person {
	private String name;
	private String gender;
	
	/** Metodp altera variavel name e variavel gender
	 * this.name = nomo;
	 * this.gender = genero;
	 * 
	 * @param nome 
	 * @param genero
	 */
	public Person (String nome, String genero) {
		this.name = nome;
		this.gender = genero;
	}
	
	/** To String
	 * 
	 */
	public String toString() {
		return "Nome: " + this.name + " Gênero: " + this.gender;
	}
}
