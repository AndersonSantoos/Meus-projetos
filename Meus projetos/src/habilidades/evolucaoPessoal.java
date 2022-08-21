package habilidades;

import java.util.Scanner;

public class evolucaoPessoal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("=========================Bem vindo Alunos!!!=================================\n");
		System.out.println("=============================================================================\n");
		System.out.println("Nesse portal você informará seus dados e saberá o que conseguiu com sua nota!");
		
		System.out.println("Informe seu nome: ");
		String nome = entrada.nextLine();
		System.out.println("Seja bem vindo: " + nome);
		
		System.out.println("Informe sua idade: ");
		int idade = entrada.nextInt();
		
		
		System.out.println("Aluno: " + nome + " Idade - " +  idade +"anos " );
		
		
		System.out.println("Informe sua primeira nota: ");
		int nota1 = entrada.nextInt();
		
		System.out.println("Informe sua segunda nota: ");
		int nota2 = entrada.nextInt();
		
		System.out.println("Informe sua terceira nota: ");
		int nota3 = entrada.nextInt();
		
		System.out.println("Informe sua quarta nota: ");
		int nota4 = entrada.nextInt();
		
		double NotaFinal = ((nota1 + nota2 + nota3+ nota4) / 4);
		
		System.out.print(nome + " Sua nota final foi de : " + NotaFinal + "\n");
		
		
		if (NotaFinal >= 9 && NotaFinal < 10) {
			System.out.println(" Você ganhou uma bolsa de estudos para cursar Medicina/TI");
		} else {
			if (NotaFinal >= 7 && NotaFinal < 8);
			System.out.println(nome +" Você ganhou uma bolsa de estudos para cursar ADM/Engenharia");
		} if (NotaFinal >= 5 && NotaFinal < 6) {
			System.out.println(nome + " você ganhou uma bolsa de estudos para cursar Matemática/História");
		}
		
		
		System.out.println(nome +"," + " Parabéns no curso que você escolher e uma excelente graduação!!!");
	
		entrada.close();

	}

}
