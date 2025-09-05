package primeiroProjeto;

import java.util.Scanner;

public class lista09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//1
		
		int numero =1;
		while (numero <=10) {
			System.out.println(numero);
			numero++; //+1
		}

		
		//2
		
		int numero2 =10;
		while (numero2 >=1) {
			System.out.println(numero2);
			numero2--; //-1
		
		}
		
		//3
		int numero3 = 0;
		while (numero3 >=100) {
			System.out.println(numero3);
			numero3 +=5;
		}
		
		//4
		int ago =0;
		while (ago <5) {
			System.out.println("Eu gosto java");
			ago++;;
		}
		
		//5
		int soma =0;
		int valor ;
		int contador =1;
		System.out.println("Digite 5 números");
		while (contador <=5) {
			valor =scanner.nextInt();
			soma +=valor;
			contador+=1;
			
		}
		
		System.out.println("A soma dos números é "+soma);
		
		//6
		int senha;
		System.out.println("Digite sua senha");
		senha = scanner.nextInt();
		while (senha !=1234) {
			System.out.println("Tente novamente");
			senha = scanner.nextInt();
		}
	
		//7
		int num =1;
		System.out.println("Informe um numero possitivo");
		num = scanner.nextInt();
		while (num!=1) {
			System.out.println(num);
			num--;
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	}


