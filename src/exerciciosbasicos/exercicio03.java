package exerciciosbasicos;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
	
		//exercicio 03
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a distância percorrida (em Km):");
		int distanciaEmKm = scan.nextInt();
		
		System.out.println("Informe o tempo gasto (em horas):");
		int tempoEmHoras = scan.nextInt();
		
		int distanciaEmMetros = distanciaEmKm * 1000;
		int tempoEmSegundos = tempoEmHoras * 3600;
		
		double velocidadeMedia = distanciaEmMetros / tempoEmSegundos;
		
		System.out.printf("\nA velocidad média é %.2f m/s.", velocidadeMedia);

	}

}
