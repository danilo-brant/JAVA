package primeiroProjeto;

import java.util.Scanner;

public class Primeira {

	public static void main(String[] args) {
		System.out.println("Olá Mundo");
		
		// Declaração de variável
		int idade = 24;
		double salario =  2000.50;
		char letra = 'D';
		String nome = "Danilo";
		boolean chuva = false;
		
		System.out.println(idade);
		System.out.println("O salario é: "+ salario + "reais");  
		System.out.println("Letra:"+letra);
		System.out.println("O nome é:"+nome);
		System.out.println(chuva);
		
		// Operadores 
		
		int num1 =10;
		int num2 = 3;
		double soma = num1 + num2;
		double sub = num1 - num2;
        double div =num1 / num2;
        double mult = num1 * num2;
        double resto =num1 % num2 ; //modulo - resto 
        
        System.out.println("Soma"+soma);
        System.out.println("Substração"+sub);
        System.out.println("Multiplicação"+ mult);
        System.out.println("Divisão:" + div );
        System.out.println("Resto:"+resto);
        
        //Entrada de dados 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual seu Nome?");
        String nome1 =scanner.nextLine();
        System.out.println("Olá "  + nome1);
        
        
      //soma de dois numeros 
        int numero1;
        int numeros2;
        System.out.println("Informe um número: ");
        numero1 = scanner.nextInt();
        System.out.println("Informe outro número");
        numeros2 = scanner.nextInt();
        int soma1 = numero1 + numeros2;
        System.out.println("O Resultado é :"+soma1);
        
        
        
       //1 
        int nascimento;
        int ano =  2025;
        System.out.println("Qual ano vc nasceu");
        nascimento= scanner.nextInt();
        int total = ano - nascimento;
        System.out.println( "vc tem "+ total + "anos");
         
        //2 
        double preco;
        double desconto;
        System.out.println("Qual o valor da compra");
        preco = scanner.nextDouble();
        System.out.println("Qual é o valor do desconto");
        desconto = scanner.nextDouble();
        double pagar = preco - desconto;
        System.out.println("Pague: "+ pagar);
         
        //3
        double nota1;
        double nota2;
        System.out.println("Qual foi a nota");
       nota1= scanner.nextDouble();
       System.out.println("Digite outra nota");
       nota2 =scanner.nextDouble();
       double media =(nota1 + nota2) /2;
       System.out.println("sua media é "+media);
       
       
        		
        
       
        
        		
        		
        		
        		
        	
        		
		
	}

}
