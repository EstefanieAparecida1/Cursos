package exercicio2;

import java.util.Scanner;

public class ipi {
	
	public static void main(String[] Args) {
		Scanner ler = new Scanner(System.in);
		
		int Peca1, Codigo1, Quantidade1, Peca2, Codigo2, Quantidade2, IPI;
		
		System.out.println("Calcular valor e quantia das pecas");
		
		System.out.println("Insira Valor peça:");
		Peca1 = ler.nextInt();
		
		System.out.println("Insira Valor peça:");
		Peca2 = ler.nextInt();
		
		System.out.println("Insira Codigo:");
		Codigo1 = ler.nextInt();
		
		System.out.println("Insira Codigo:");
		Codigo2 = ler.nextInt();
		
		System.out.println("Insira Quantidade:");
		Quantidade1 = ler.nextInt();
		
		System.out.println("Insira Quantidade:");
		Quantidade2 = ler.nextInt();
		
		System.out.println("Insira o IPI:");
		IPI = ler.nextInt();
		
		System.out.println("Quantidade de Peça:"+ Quantidade1+", Codigo da Peça:"+Codigo1+", Valor Unitario:"+Peca1+", Valor Total:"+Peca1*Quantidade1);
		System.out.println("Quantidade de Peça:"+ Quantidade2+", Codigo da Peça:"+Codigo2+", Valor Unitario:"+Peca2+", Valor Total:"+Peca2*Quantidade2);
		
		double Valor_total = (((Peca1*Quantidade1)+(Peca2*Quantidade2))*((IPI/100.0)+1));
		System.out.println("Valor total = "+Valor_total);
		
		
	}

}
