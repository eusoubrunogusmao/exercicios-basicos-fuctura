package exerciciosbasicos;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//exercicio 02
		
		System.out.println("Informe o preço do primeiro produto:");
		double valor1 = scan.nextDouble();
		
		System.out.println("Informe o preço do segundo produto:");
		double valor2 = scan.nextDouble();

		double total = valor1 + valor2;
		
		System.out.printf("\nO valor total é R$ %.2f.", total);
		
		//exercicio 03
		
//		System.out.println("Informe a distância percorrida (em Km):");
//		int distanciaEmKm = scan.nextInt();
//		
//		System.out.println("Informe o tempo gasto (em horas):");
//		int tempoEmHoras = scan.nextInt();
//		
//		int distanciaEmMetros = distanciaEmKm * 1000;
//		int tempoEmSegundos = tempoEmHoras * 3600;
//		
//		double velocidadeMedia = distanciaEmMetros / tempoEmSegundos;
//		
//		System.out.printf("\nA velocidad média é %.2f m/s.", velocidadeMedia);
		
	}

}
