package habilidades;

public class IMC {
	public static void main(String[] args) {
		int PESO = 93;
		double ALTURA = 1.65;
		double IMC = PESO / (ALTURA * ALTURA);
		System.out.printf("%.2f" , IMC);
		
	}

}
