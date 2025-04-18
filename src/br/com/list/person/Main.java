package br.com.list.person;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static Tools t = new Tools();
	static Scanner s = new Scanner(System.in);
	static PersonList lists = new PersonList();
	
	
	public static void main(String[] args) {
		
		int i = 1;
		do {
			do {
				int door = start();
				if (door == 1) task1();
				else if (door == 2) task2();
				else if (door == 0) {
					i = 0;
					break;
				}
			} while (true);
		} while(i != 0);
	}
	
	
	static int start() {
		t.out("***** Inicio *****");
		t.out("O que deseja fazer?");
		t.ln();
		t.out("Digite \"1\" para Tarefa 1.");
		t.out("Digite \"2\" para tarefa 2");
		t.out("Digite \"0\" para finalizar programa.");
		t.ln();
		
		int entrada = s.nextInt();
		
		t.ln();
		if (entrada == 1) {
			return 1;
		}
		else if (entrada == 2) {
			return 2;
		}
		else if (entrada == 0) {
			return 0;
		}
		else t.out("Valor invalido.");
		return -1;
	}
	
	
	static void task1() {
		t.out("***** Tarefa 1 *****");
		t.ln();
		
		t.out("Aqui será necessário a entrada de alguns nomes");
		t.out("logo após esses nomes serão imprimidos em ordem alfabetica");
		t.ln();
		
		t.out("Digite alguns nomes separando-os por \",\" (vírgula).");
		String[] people = s.next().split(",");

		t.out("***** Sem ordenação *****");
		t.ln();
		for (String name : people) {
			t.out(name);
		}
		
		Arrays.sort(people);
		
		t.out("***** com ordenação *****");
		t.ln();
		
		for (String name : people) {
			t.out(name);
		}
	}
	
	static void task2() {
		String[] arr = new String[2];
		String nome = arr[0];
		String genero = arr[1];
		
		
		t.out("***** Tarefa 2 *****");
		t.ln();
		
		t.out("Aqui será necessário a entrada de nome gênero");
		t.out("Logo serão imprimidos no console separado por genero");
		t.ln();
		int i = 1;
		do {
			t.out("Digite o nome e o gênero separados por \"-\"");
			t.out("genero deve ser \"m\" para masculino e \"f\" para feminino");
			arr = s.next().split("-", 2);
			t.ln();
			
			t.out("O nome " + nome + " está correto?");
			mensageValidName(nome);
			do {
				t.out("Digite \"s\" ou \"n\"");
				String input = s.next();
				t.ln();
				if (input.equalsIgnoreCase("s")) break;
				else if (input.equalsIgnoreCase("n")) {
					t.ln();
					t.out("Digite o nome novamente");
					nome = s.next();
					mensageValidName(nome);
				}
				else t.out("entrada inválida");
				t.ln();
			} while(true);
			
			do {
				boolean genderValid = true;
				boolean genderInvalid = false;
				lists.putInList(nome, genero);
				if (lists.putInList(nome, genero) == genderInvalid) {
					t.out("Gênero invalido");
					t.out("Gênero deve ser \"f\" ou \"m\"");
					t.out("Digite o gênero novament");
					genero = s.next();
				}
				if (lists.putInList(nome, genero) == genderValid) break;
			}while(true);
			t.ln();
			t.out("Deseja cadastrar outra pessoa?");
			do {
				t.out("Responda com \"s\" ou \"n\"");
				String input = s.next();
				if (input.equalsIgnoreCase("s")) break;
				else if (input.equalsIgnoreCase("n")) {
					i = 0;
					break;
				}
				else t.out("Entrada inválida");
			} while(true);
				
		} while(i == 1);
		
		lists.fen.forEach(System.out :: println);
		lists.male.forEach(System.out :: println);
	}
	
	/** Métodp imprime uma mensagem no console perguntando se o parametro "nome" está correto
	 * Criadp apenas para não haver repetição de código
	 * 
	 * @param nome - String
	 */
	static void mensageValidName(String nome) {
		t.out("O nome " + nome + " está correto?");
	}
}
