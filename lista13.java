package primeiroProjeto;

import java.util.Scanner;

public class lista13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		   // 1 - Contador: Mostre os números de 10 a 30 no console.
        System.out.println("1 - Contador (10 a 30):");
        for (int i = 10; i <= 30; i++) {
            System.out.println(i);
        }
        System.out.println("------------------------------");
        
        // 2 - Classificação de Idades
        System.out.println("2 - Classificação de Idades:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite a " + i + "ª idade: ");
            int idade = scanner.nextInt();
            
            if (idade >= 18) {
                System.out.println("Maior de idade");
            } else {
                System.out.println("Menor de idade");
            }
        }
        System.out.println("------------------------------");
        
        // 3 - Eleição
        System.out.println("3 - Eleição:");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º voto (1-6): ");
            int voto = scanner.nextInt();
            
            switch (voto) {
                case 1: System.out.println("Voto para candidato 1"); break;
                case 2: System.out.println("Voto para candidato 2"); break;
                case 3: System.out.println("Voto para candidato 3"); break;
                case 4: System.out.println("Voto para candidato 4"); break;
                case 5: System.out.println("Voto nulo"); break;
                case 6: System.out.println("Voto em branco"); break;
                default: System.out.println("Voto inválido");
            }
        }
        System.out.println("------------------------------");
        
        // 4 - Repetição de Frase
        System.out.println("4 - Repetição de Frase:");
        scanner.nextLine(); // Limpar buffer
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        System.out.print("Quantas vezes repetir? ");
        int vezes = scanner.nextInt();
        
        for (int i = 1; i <= vezes; i++) {
            System.out.println(i + " - " + frase);
        }
        System.out.println("------------------------------");
        
        // 5 - Sequência (50 até 30)
        System.out.println("5 - Sequência (50 até 30):");
        for (int i = 50; i >= 30; i--) {
            System.out.println(i);
        }
        System.out.println("------------------------------");
        
        // 6 - Números Alternados
        System.out.println("6 - Números Alternados (1 a 50):");
        for (int i = 1; i <= 50; i += 2) {
            System.out.println(i);
        }
        System.out.println("------------------------------");
        
        // 7 - Aprovado ou Reprovado
        System.out.println("7 - Aprovado ou Reprovado:");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a " + i + "ª nota: ");
            double nota = scanner.nextDouble();
            
            if (nota >= 6.0) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        }
        System.out.println("------------------------------");
        
        // 8 - Categoria de Idade
        System.out.println("8 - Categoria de Idade:");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a " + i + "ª idade: ");
            int idade = scanner.nextInt();
            
            if (idade <= 12) {
                System.out.println("Criança");
            } else if (idade <= 17) {
                System.out.println("Adolescente");
            } else if (idade <= 59) {
                System.out.println("Adulto");
            } else {
                System.out.println("Idoso");
            }
        }
        System.out.println("------------------------------");
        
        // 9 - Número Positivo ou Negativo
        System.out.println("9 - Número Positivo ou Negativo:");
        for (int i = 1; i <= 7; i++) {
            System.out.print("Digite o " + i + "º número: ");
            double numero = scanner.nextDouble();
            
            if (numero > 0) {
                System.out.println("Positivo");
            } else if (numero < 0) {
                System.out.println("Negativo");
            } else {
                System.out.println("Zero");
            }
        }
        
		
		
		
		
		
		
		
		
		
		
	}

}
