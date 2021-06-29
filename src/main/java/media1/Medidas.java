package media1;

import java.util.Scanner;

public class Medidas {
	/*
	 * Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino)
	 * de 10 pessoas. Fazer um algoritmo que calcule e escreva: a. a maior e a menor
	 * altura do grupo; b. média de altura dos homens; c. o número de mulheres.
	 */

	public static void main(String[] Args) {

		Scanner ler = new Scanner(System.in);

		int Mulher = 0;
		int Homem = 0;
		double AlturaM = 0;
		double AlturaH = 0;
		

		for (int Quantidade = 0; Quantidade < 2; Quantidade += 1) {

			System.out.println("Qual Genero Você se identifica? ");
			String resposta = ler.next();

			if (resposta.equals("Mulher")) {
				Mulher++;
				System.out.println("Qual a sua altura Mulher? ");
				AlturaM = ler.nextDouble();
			}
			else if (resposta.equals("Homem")) {
				Homem++;
				System.out.println("Qual a sua altura Homem? ");
				AlturaH = ler.nextDouble();
				
			} else {
				System.out.println("Invalido");
				Quantidade--;
			}
			
			
		}

		System.out.println("Quantidade de Mulher:" + Mulher);
		System.out.println("Quantidade de Homem: " + Homem);


	}

}
