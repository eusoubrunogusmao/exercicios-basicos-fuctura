package exerciciosbasicos;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
			double cotacaoDolar, valorReais, valorDolar;
			
			System.out.println("Informe a cotação do Dolar:");
				cotacaoDolar = scan.nextDouble();
				
			System.out.println("Informe o valor em Reais:");
				valorReais = scan.nextDouble();
				
				valorDolar = cotacaoDolar * valorReais;
			
			System.out.printf("\nO valor convertido em dólares é: $ %.2f.%n", valorDolar);
		
		
		
		
	}
	
}
