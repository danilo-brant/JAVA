package primeiroProjeto;

import java.util.Scanner;

public class lista12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//1
		
		
		int contador =10 ;
		do {
			System.out.println(contador);
			contador++;
		
		}while (contador <=30);
		System.out.println("-------------------");
		
		
		//2
		int num;
		do {
			System.out.println("informe um número");
			num = scanner.nextInt();
			}while (num !=5);
		//3
		int peso;
		do {
			System.out.println("Informe o peso da mala ");
			peso = scanner.nextInt();
			if (peso >=23) {
		System.out.println("peso excedido");
			}
			}while (peso>=23);
			System.out.println("peso dentro do limite");
		
		
		
		
		
		//4
			   int livro;
		        int totallivro = 0;
		        int dias = 1;

		        do {
		            System.out.println("Quantas páginas você leu?");
		            livro = scanner.nextInt();
		            totallivro = totallivro + livro;
		            dias++;
		        } while (dias <= 7);

		        System.out.println("Você leu " + totallivro + " páginas.");
		
		        //5
		        int senha;
		        do {
		        	System.out.println("Qual é o código");
		        	senha = scanner.nextInt();
		        	if (senha !=789){
		        	System.out.println("senha incorreta");
		        	}
		        }while (senha !=789);
		        System.out.println("senha correta");
		        
		        //6
		        
		        int comb;
		        do {
		        	System.out.println("Informe o nivel de combustivel (em litros)");
		        	comb  = scanner.nextInt();
		        	if ( comb <=10) {
		        		System.out.println("combustivel baixo");
		        		}
		        }while (comb <=10);
		        System.out.println(" combustível está suficiente");
		        	
		        //7
		        int distancia;
		        int totalQuilometros = 0;

		        System.out.println("Digite a distância percorrida em cada trecho (0 ou negativo para finalizar):");

		        do {
		            System.out.print("Distância do trecho: ");
		            distancia = scanner.nextInt();

		            if (distancia > 0) {
		                totalQuilometros += distancia;
		            }

		        } while (distancia > 0);

		        System.out.println("Total de quilômetros percorridos: " + totalQuilometros);
		         
		        	
		
		
		
		

	}

}
