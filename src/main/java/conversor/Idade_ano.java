package conversor;

import java.util.Scanner;

public class Idade_ano {
	
	public static void main(String[] Args) {
		
		Scanner ler = new Scanner(System.in);		
		
		int IdadeAnos, IdadeMeses, IdadeDias, IdadeTotalDias; 
		
		System.out.println("Calculadora de idade em dias");
		
		System.out.println("insira os anos:");
		IdadeAnos = ler.nextInt();
		
		System.out.println("insira os meses:");
		IdadeMeses = ler.nextInt();
		
		System.out.println("insira os dias:");
		IdadeDias = ler.nextInt();
		
		
		IdadeTotalDias = IdadeAnos * 365 + IdadeMeses * 30 + IdadeDias;
		System.out.println(" idade total em dias" + IdadeTotalDias);
		
		
		
	}

}
