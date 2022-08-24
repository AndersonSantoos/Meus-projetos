package habilidades;

import java.util.Scanner;

public class TriangEqui {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Triângulo Equilátero ou Isósceles");
		System.out.println("=================================\n\n");
		
		System.out.println("Informe o valor do primeiro lado: ");
		double l1 = entrada.nextInt();
		System.out.println("Informe o valor do segundo lado: ");
		double l2 = entrada.nextInt();
		System.out.println("Informe o valor do terceiro lado: ");
		double l3 = entrada.nextInt();
		
		if (l1 == l2 && l1 == l3 && l2 == l3) {
			System.out.println("O triângulo é equilátero!");
		} else {
			if (l1 == l2 || l1 == l3 || l2 == l3 ) {
					System.out.println("O triângulo é Isósceles!");
						entrada.close();
			}
		}

	 }
}
