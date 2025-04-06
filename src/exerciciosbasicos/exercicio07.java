package exerciciosbasicos;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner (System.in);
		
		
		double	pesoEncomenda, valorFrete, custoPorKg = 5;
		
		System.out.println("Informe o peso da encomenda (em Kg):");
		pesoEncomenda = scan.nextDouble();
		valorFrete = pesoEncomenda * custoPorKg;
		
		System.out.printf("O valor do frete é: R$ %.2f.%n", valorFrete);
		
		
//		Scanner scan = new Scanner(System.in);
//
//		double fretePorKg = 5;
//
//		System.out.println("Informe o peso da encomenda (em kg):");
//		double pesoEncomenda = scan.nextDouble();
//
//		double frete = pesoEncomenda * fretePorKg; 
//
//		System.out.printf("O valor do frete é R$ %.2f%n", frete);


	}

}
