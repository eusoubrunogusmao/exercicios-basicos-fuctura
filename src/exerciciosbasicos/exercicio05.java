package exerciciosbasicos;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		
		// Exercício 05
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor do empréstimo:");
		double valorEmprestimo = scan.nextDouble();
		
		System.out.println("Informe a taxa de juros mensal:");
		double taxaJuros = scan.nextDouble();
		
		System.out.println("Informe a quantidade de meses:");
		int qtdMeses = scan.nextInt();
		
		double valorTotal = valorEmprestimo + (valorEmprestimo * (taxaJuros / 100) * qtdMeses);
		double valorParcela = valorTotal / qtdMeses;
		
		System.out.printf("\nO valor da parcela mensal do empréstimo é de %.2f", valorParcela);
		
		
//		Scanner scan = new Scanner(System.in);
//
//		double valorEmprestimo, taxaJuros, valorTotal, valorParcela;
//		int qtdMeses;
//
//		System.out.println("Entre com o valor do empréstimo:");
//		valorEmprestimo = scan.nextDouble();
//
//		System.out.println("Qual a taxa de juros mensal?");
//		taxaJuros = scan.nextDouble();
//
//		System.out.println("O empréstimo foi em quantos meses?");
//		qtdMeses = scan.nextInt();
//
//		// Cálculo de juros simples
//		valorTotal = valorEmprestimo + (valorEmprestimo * (taxaJuros / 100) * qtdMeses);
//		valorParcela = valorTotal / qtdMeses;
//
//		System.out.printf("O valor total com juros é R$ %.2f%n", valorTotal);
//		System.out.printf("O valor de cada parcela será de R$ %.2f%n", valorParcela);

		

	}

}
