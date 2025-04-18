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
	
	public Person(String[] split) {
		this.name = split[0];
		boolean genderEmpty = this.genderEmpty(split);
		if (!genderEmpty) this.gender = split[1];
	}
	
	
	public boolean genderEmpty(String[] arr) {
		if (arr.length == 1) return true;
		else return false;
	}
	
	/** To String
	 * 
	 */
	public String toString() {
		return name + " " + gender;
	}
}
