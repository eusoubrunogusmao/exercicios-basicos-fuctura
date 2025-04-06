package exerciciosbasicos;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		
		
		// exercício 04
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o número de horas trabalhadas:");
		int horasTrabalhadas = scan.nextInt();
		
		System.out.println("Informe o valor da hora trabalhada:");
		double valorHora = scan.nextDouble();
		
		double salarioBruto = horasTrabalhadas * valorHora;
		
		System.out.printf("\nO salário bruto deste funcionário é R$ %.2f", salarioBruto);
		
		
		
		
	}
}
