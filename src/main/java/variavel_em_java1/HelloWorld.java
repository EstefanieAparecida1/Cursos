package variavel_em_java1;

// String = texto
// byte = Numeros Inteiros (-128 ate 127)
// int = Numeros Inteiros (-2147483648 até 2147483647)
// long = Numeros ( numeros extensos)
// float = Numeros Decimais ( ate 7 casas apos a virgula)
// double = Numeros Decimais ( ate 15 casas apos a virgula)
// boolean = val0res booleanos = true ou false
// final = atributo constante (imudavel) é recomendavel a utilização de letras maiusculas para nome
//da variavel constante 


public class HelloWorld {
	
	public static void main(String [] args) {
		System.out.println("hello world!");
		
		// Tipo de variavel - nome da variavel - valor da variavel
		String nome = "Rafael Oliveira";
		
		System.out.println(nome);
		
	    byte numero = 26;
	    
	    System.out.println(numero);
	    
	    int numero1 = 21983198;
	    numero1 = 21928319;
	    
	    System.out.println(numero1);
	    
	    long numero11 = 928472919372892L;
	    
	    System.out.println(numero11);
	    
	    float preco = 1.29f;
	    
	    System.out.println(preco);
	    
	    double preco1 = 1.39802830; 
	    
	    System.out.println(preco1);
	    
	    boolean verdadeiro = true;
	    
	    System.out.println(verdadeiro);
	    
	    boolean falso = false;
	    
	    System.out.println(falso);
	    
	    
	    
	    // Operador de soma +
	    
	    int valor = 10;
	    int valor2 = 10;
	    
	    int soma = valor + valor2;
	    
	    System.out.println(soma);
	    
	    //Operador de subtração -
	    
	    int valor1 = 10;
	    int valor3 = 10;
	    
	    int subtracao = valor1 - valor3;
	    
	    System.out.println(subtracao);
	    
	    //Operador de mutiplicação *
	    
	    int valor4 = 10;
	    int valor5 = 10;
	    
	    int mutiplicacao = valor4 * valor5;
	    
	    System.out.println(mutiplicacao);
	    
	    //Operador de divisão 
	    
	    int valor11 = 10;
	    int valor22 = 10;
	    
	    int divisao = valor11 / valor22;
	    
	    System.out.println(divisao);
	    
	    /*
	     == Operador de igual.
	     < Operador de menor.
	     > Operdaor de maior.
	     <= Operador de menor ou igual.
	     >= Operador de maior ou igual.
	     != Operdor de diferente. 
	     retonar falso ou verdadeiro.
	     */
	    
	    int valor111 = 120;
	    int valor222 = 110;
	    
	    System.out.println(valor111 == valor222);
	    System.out.println(valor111 < valor222);
	    System.out.println(valor111 > valor222);
	    System.out.println(valor111 <= valor222);
	    System.out.println(valor111 >= valor222);
	    System.out.println(valor111 != valor222);
	}

}
