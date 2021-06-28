package graus1;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] Args) {
		
		double Celsius2;
				
		Scanner ler = new Scanner(System.in);
		
    	System.out.println("Temperatura");
		
		System.out.println("insira os graus Celsius: ");
		Celsius2 = ler.nextDouble();
		
		String Resposta;
		
		System.out.println("Para qual escala voce quer? ");
	    Resposta = ler.next();
	    
	
		switch(Resposta){
		
		case ("Fahrenheit"):
			System.out.println("A temperatura em Fahrenheit é:" +( Celsius2 * 1.8 + 32));
			break;
			
		case ("Kelvin"):
			System.out.println("A temperatura em Kelvin é: " + (Celsius2 +273.15));
			break;
			
		case ("Rankine"):
			System.out.println("A temperatura em Rankine é: " +  (Celsius2 * 1.8 + 32 + 459.67));
			break;
			
		case ("Reaumur"):
			System.out.println("A temperatura em Reaumur é: " +  (Celsius2 * 0.8));
			break;
			
		
		}
	
	}

}
