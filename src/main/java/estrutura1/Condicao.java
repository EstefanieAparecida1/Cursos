package estrutura1;
// if = se
// else = se não 
public class Condicao {

	public static void main(String[] args) {
		System.out.println("hello world");
		
		int idade = 41;

		if (idade <= 26) {
			System.out.println("adolecente");
		} else if (idade <= 40) {
			System.out.println("adulto");
		}else {
			System.out.println("idoso");
		}

	}
}
