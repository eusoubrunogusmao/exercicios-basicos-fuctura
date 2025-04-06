package exerciciosbasicos;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o nome do usuário:");
		String nome = entrada.nextLine();
		
//		System.out.println("Olá, " + nome + "! Bem-vindo ao nosso programa!");
		
		System.out.printf("\nOlá, %s! Bem-vindo ao nosso programa!%n", nome);
		
		
		
		
		
		

	}

}
