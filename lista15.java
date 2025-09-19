package primeiroProjeto;

import java.util.Scanner;

public class lista15 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1
        
        System.out.println("------------------------");
		String[] frutas = new String [5];
		for (int i = 0; i < 5; i++) {
			System.out.println("frutas["+i+"]: ");
			frutas [i] = scanner.next();
		}
		for(int i =0 ; i <5 ;i++) {
			System.out.println(frutas[i]);
		}

		
		//2
		System.out.println("------------------------");

		String[]num = new String [10];
		for (int i = 0; i <10; i++) {
			System.out.println("Digite os números["+i+"]:");
			num [i] = scanner.next();
			
			
		}
		System.out.println("Valores armazenados");
		for(int i = 0;i <10; i++) {
			System.out.println(num[i]);
		}
		//3
		String[]num1 = new String[7];
		for (int i =0; i <7;i++) {
			System.out.println("Digite os números["+i+"]:");
			num1 [i] = scanner.next();
			
			
			
		}
		 System.out.println("Mostrando os valores invertido");
		 for (int i =6 ; i>0;i--) {
			 System.out.println(num1 [i]);
		 }
		//4
	        int[] num3 = new int[10]; 

	        // leitura dos 10 números
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Digite o número " + (i+1) + ": ");
	            num3[i] =scanner.nextInt();
	        }
	        for (int i = 0; i < 10; i++) {
	            if (num3[i] > 100) {
	                System.out.println(num3[i] + " é maior do que 100");
	            } else {
		
			}
			
			
	        }
			
			
			
			
			
			
			
			
			
			
			
	}

}
