package primeiroProjeto;

import java.util.Scanner;

public class lista07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//1
		
		System.out.println("Digita sua idade");
		int idade = scanner.nextInt();
		if (idade <16 ||idade>70) {
			System.out.println("Classificação especial");
		}else {
			System.out.println("Classificação regular");
		}

		
		//2
		
        System.out.print("Digite o valor do produto: ");
        double valor = scanner.nextDouble();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();
        double total = valor * quantidade;
        if (total > 200 && quantidade > 5) {
            double desconto = total * 0.15;
            double valorFinal = total - desconto;
            System.out.printf("Desconto de 15%% aplicado! Valor final: R$ %.2f\n", valorFinal);
        } else {
            System.out.printf("Valor total sem desconto: R$ %.2f\n", total);
        }
		
		
		
	//3
        System.out.println("Digite sua frequêcia cardíaca (em bpm)");
        double fre = scanner.nextDouble();
        System.out.println("Voçê sente tontura?");
        String tontu = scanner.next();
        if (fre >=100 && tontu.equalsIgnoreCase("Sim") ) {
        	System.out.println("Procure um medico");
        }else {
        	System.out.println("Sem sinais de alerta");
        }
		
        
        //4
        System.out.println("Digite sua idade");
        int idade1 =scanner.nextInt();
        System.out.println("Você é residente do estado?");
        String resposta = scanner.next();
        if(idade1 >=18 && idade1 <30 && resposta.equalsIgnoreCase("Sim") ) {
        	System.out.println("egível para o concurso");
        }else {
        	System.out.println("Não elegivel para o concurso");
        }
		
        
        
        //5
        System.out.println("Digite o número de projeto concluídos");
        double projeto = scanner.nextDouble();
        System.out.println("E qual foi o números de erro");
        double erros = scanner.nextDouble();
        if (projeto >10 && erros <3) {
        	System.out.println("Recompensa concedida");
        }else {
        	System.out.println("Sem recompesa");
        }
		
        
        
        
     // 6 - 
      
        System.out.print("Digite sua idade: ");
        int idade4 = scanner.nextInt();
        System.out.print("Possui passaporte válido? (sim/nao): ");
        String passaporte = scanner.next();

        if (idade4 >= 18 && passaporte.equalsIgnoreCase("sim")) {
            System.out.println("Viagem autorizada");
        } else {
            System.out.println("Viagem não autorizada");
        }

        // 7 - 
        System.out.print("Digite sua nota final (0 a 100): ");
        int nota = scanner.nextInt();
        System.out.print("Digite o número de aulas assistidas (0 a 50): ");
        int aulas = scanner.nextInt();

        if (nota >= 70 && aulas >= 40) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        // 8 -
        System.out.print("Digite a umidade do solo (%): ");
        int umidade = scanner.nextInt();
        System.out.print("Digite a temperatura (°C): ");
        int temperatura = scanner.nextInt();

        if (umidade < 30 || temperatura > 30) {
            System.out.println("Irrigação necessária");
        } else {
            System.out.println("Irrigação não necessária");
        }

        // 9 - 
        System.out.print("Digite sua idade: ");
        int idadeFeira = scanner.nextInt();
        System.out.print("Possui experiência prévia? (sim/nao): ");
        String experiencia = scanner.next();

        if (idadeFeira >= 20 && idadeFeira <= 40 && experiencia.equalsIgnoreCase("sim")) {
            System.out.println("Inscrição aceita");
        } else {
            System.out.println("Inscrição não permitida");
        }
	}

}
