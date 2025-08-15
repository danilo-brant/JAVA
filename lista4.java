package primeiroProjeto;

import java.util.Scanner;

public class lista4 {
	//1

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int idade;
		System.out.println("Qual sua idade?");
		idade = scanner.nextInt();
		if (idade >=18) {
			System.out.println("Você é maior de idade");
		}else {
			System.out.println("Você menor de idade");
			
			//2
			int numero1;
			int n2;
			System.out.println("Informe um número");
			numero1 = scanner.nextInt();
			System.out.println("Iforme outro número");
			n2 = scanner.nextInt();
			if (numero1 > n2) {
				System.out.println( "primeiro número é maior");
			}
			else {
				System.out.println( "primeiro número é menor ou igual");
				//3
				
				
				double nota;
				System.out.println("Qual foi sua nota");
				nota = scanner.nextDouble();
				if (nota >= 7) {
					System.out.println("Aprovado sua nota foi\n"+nota);
				}
				else {
					System.out.println("Reprovado sua nota foi\n"+nota);
					
					
					
					//4
					double num1D;
					System.out.println("informe um número");
					num1D = scanner.nextDouble();
					if (num1D >=0) {
						System.out.println("O número é positivo");
					}
					else {
						System.out.println("O número é negativo ou zero");
					}
					
					//5
					double distancia;
				
					System.out.println("Informe a distância");
					distancia = scanner.nextDouble();
					double Frete = distancia * 0.5;
					if (distancia <=50) {
						System.out.println("O frete custa R$10");
					}
					else {
						System.out.println("Valor do frete \n"+Frete);
					}
					//6
					double num10;
					System.out.println("Me informe um número");
					num10 = scanner.nextDouble();
					if (num10 >=10) {
						System.out.println("O numero é 10");
					}
					else {
						System.out.println("O número não é 10");
					}
				}
			}
			
		}

	}

}
