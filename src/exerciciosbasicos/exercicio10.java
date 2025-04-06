package exerciciosbasicos;

import java.util.Scanner;

public class exercicio10 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double juros = 0.02;
		
		System.out.println("Informe o preço à vista do produto:");
		double precoAVista = scan.nextDouble();
		
		System.out.println("Informe o numero de parcelas:");
		int numeroParcelas = scan.nextInt();
		
		double precoAPrazo = precoAVista * (1 + juros * numeroParcelas);
		double valorParcela = precoAPrazo / numeroParcelas;
		
		System.out.printf("\nO valor de cada parcela é R$ %.2f.", valorParcela);
		
		
		
		
	}
	

}
