package habilidades;

import java.util.Scanner;

	public class BombaDeCombustivel {
		
		public static void main(String[] args) {
			
		
	
		
		final double valor_litro = 6.53;
		double valor_solicitado;
		double litros_abastecidos;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Informe quanto vai comprar de combustível em R$: ");
		valor_solicitado = input.nextDouble();
		
		litros_abastecidos = valor_solicitado / valor_litro;
		System.out.printf("O valor de litros abastecidos foram R$ : %.2f" , litros_abastecidos);
		
}

		
		}

