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
		double MaiorH = 0;
		double MenorH = 999999999;
		double MaiorM = 0;
		double MenorM = 888888888;
		double MediaH = 0;
		double MediaM = 0;

		for (int Quantidade = 0; Quantidade < 6; Quantidade += 1) {

			System.out.println("Qual Genero Você se identifica? ");
			String resposta = ler.next();

			if (resposta.equals("Mulher")) {
				Mulher++;
				System.out.println("Qual a sua altura Mulher?(usando virgula) ");
				AlturaM = ler.nextDouble();
				if (AlturaM > MaiorM) {
					MaiorM = AlturaM;
				} else if (AlturaM < MenorM) {
					MenorM = AlturaM;
				}

			} else if (resposta.equals("Homem")) {
				Homem++;
				System.out.println("Qual a sua altura Homem?(usando virgula) ");
				AlturaH = ler.nextDouble();
				if (AlturaH > MaiorH) {
					MaiorH = AlturaH;
				} else if (AlturaH < MenorH) {
					MenorH = AlturaH;

				} else {
					System.out.println("Invalido");
					Quantidade--;
				}
				
			}
			
		}
		
		MediaH = MaiorH + MenorH;
		MediaH = MediaH / Homem;
		
		MediaM = MaiorM + MenorM;
		MediaM = MediaM / Mulher;

		System.out.println("Quantidade de Mulher:" + Mulher);
		System.out.println("Quantidade de Homem: " + Homem);
		
		System.out.println("Maior do grupo Mulheres: " + MaiorM);
		System.out.println("Menor do grupo Mulheres: " + MenorM);
		
		System.out.println("Maior do grupo Homens: " + MaiorH);
		System.out.println("Menor do grupo Homens: " + MenorH);
		
		System.out.println("Media altura Homens: " + MediaH);
		System.out.println("Media altura Mulher: " + MediaM);
	}
}
