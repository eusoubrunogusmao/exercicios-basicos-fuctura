package exerciciosbasicos;

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double altura, largura, area, tinta;
		
		System.out.println("Informe a altura da parede (em Metros):");
		altura = scan.nextDouble();
		
		System.out.println("Informe a largura da parede (em Metros):");
		largura = scan.nextDouble();
		
		area = altura * largura;
		
		tinta = area / 2;
		
		System.out.printf("\nA área da parede é %.2f e a quantidade de tinta necessária é %.2f L.%n", area, tinta);
		
		
		
		
//		Scanner scan = new Scanner(System.in);
//
//		double alturaParede, larguraParede, qtdTinta;
//
//		System.out.println("Entre com a altura da parede (m):");
//		alturaParede = scan.nextDouble();
//
//		System.out.println("Entre com a largura da parede (m):");
//		larguraParede = scan.nextDouble();
//
//		double areaParede = alturaParede * larguraParede;
//		qtdTinta = areaParede / 2;
//
//		System.out.printf("A área da parede é %.2f m².%n", areaParede);
//		System.out.printf("A quantidade de tinta necessária é %.2f litros.%n", qtdTinta);

		
		
	}
	
}
