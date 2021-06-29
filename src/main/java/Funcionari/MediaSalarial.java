package Funcionari;

import java.util.Scanner;

public class MediaSalarial {
	/*
	 * Criar um programa que calcule a média de salários de uma empresa, pedindo ao
	 * usuário a grade de funcionários e os salários, e devolvendo a média salarial.
	 * Exemplo: Funcionário 1 = R$2.000 Funcionário 2 = R$3.000 Funcionário 3 =
	 * R$4.000 Média = f1+f2+f3/3 Média = R$3.000
	 */

	public static void main(String[] Args) {

		Scanner ler = new Scanner(System.in);

		int Funcionarios;

		System.out.println("Media_Salarial");

		System.out.println("Qual a Grade de Funcionarios? ");
		Funcionarios = ler.nextInt();

		double Salario_funcionarios;
		double Soma_salarial = 0;

		for (int a = 0; a < Funcionarios; a += 1) {
			System.out.println("Insira salario do funcionario: ");
			Salario_funcionarios = ler.nextDouble();

			Soma_salarial = Salario_funcionarios + Soma_salarial;

		}
		
		Soma_salarial = Soma_salarial / Funcionarios;

		System.out.println("Media Salarial é:" + Soma_salarial);
	}

}
