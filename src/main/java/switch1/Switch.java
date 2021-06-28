package switch1;

public class Switch {
	
	public static void main(String[] Args) {
		
		int opcoes = 2;

		switch(opcoes){
			
			case 1:
				System.out.println("Abra sua conta");
				break;
				
			case 2:
				System.out.println("Fatura do Cartao");
				break;
				
			case 3:
				System.out.println("Cedito Imoboliario");
				break;
				
			default:
				System.out.println("Escolha uma opcao valida");
			
		}

		
	}

	
}
