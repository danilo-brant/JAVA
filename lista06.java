package primeiroProjeto;

import java.util.Scanner;

public class lista06 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		
		System.out.println("Informe um número ");
		int num;
		num = scanner.nextInt();
		if (num >10 && num <20) {
		System.out.println("Número dentro do intervalo");
	}else {
		System.out.println("O número está fora do intervalo");
	}
		//2
		System.out.println("Qual sua idade?");
		int idade = scanner.nextInt();
		System.out.println("Voçê possui convite");
		boolean convite = scanner.nextBoolean();
		
		if (idade >= 18 && convite) {
			System.out.println("Etrada Permitida");
		}else {
			System.out.println("Entrada Negada");
		}
		
		//3
		System.out.println("Qual sua idade ?");
		int idade1 =scanner.nextInt();
		if (idade1 <12 || idade1>60) {
			System.out.println("Categoria especial");
		}else {
			System.out.println("Categoria normal");
		}
		
		//4
		System.out.println("Qual foi o valor");
		double valor = scanner.nextDouble();
		System.out.println("Qual forma de pagamento(avista ou cartão)");
		String pagamento =scanner.next();
		if (valor >100 && pagamento.equals("avista")) {
			System.out.println("Voçê recebeu um desconto de 10%");
		}else {
			System.out.println("O valor sem desconto é:"+valor);
		}
		
		//5
		System.out.println("Qual sua temperatura");
		double temp = scanner.nextDouble();
		System.out.println("Voçê tem sintomas ?");
		String sintomas = scanner.next();
		if (temp >=38 && sintomas.equals("sim")) {
			System.out.println("Procure um medico");
		}else {
			System.out.println("Sem sinais preocupants");
		}
		
		
		   // 6 -
        System.out.println(" Qual sua idade?");
        idade = scanner.nextInt();
        System.out.println("Você é brasileiro? (true/false)");
        boolean brasileiro = scanner.nextBoolean();
        if (idade >= 16 && brasileiro) {
            System.out.println("Pode votar.");
        } else {
            System.out.println("Não pode votar.");
        }

        System.out.println("---------------------------");

        // 7 - 
        System.out.println(" Quantidade de horas extras:");
        int horasExtras = scanner.nextInt();
        System.out.println("Número de faltas:");
        int faltas = scanner.nextInt();
        if (horasExtras > 20 && faltas < 5) {
            System.out.println("Ganha bônus.");
        } else {
            System.out.println("Não ganha bônus.");
        }

        System.out.println("---------------------------");

        // 8 - 
        System.out.println(" Qual sua idade?");
        idade = scanner.nextInt();
        System.out.println("Você possui carteira de motorista? (true/false)");
        boolean carteira = scanner.nextBoolean();
        if (idade >= 18 && carteira) {
            System.out.println("Pode dirigir.");
        } else {
            System.out.println("Não pode dirigir.");
        }

        System.out.println("---------------------------");

        // 9 -
        System.out.println("Qual sua nota média? (0 a 10)");
        double nota = scanner.nextDouble();
        System.out.println("Qual sua frequência? (0 a 100)");
        int frequencia = scanner.nextInt();
        if (nota >= 8 && frequencia >= 80) {
            System.out.println("Bolsa concedida");
        } else {
            System.out.println("Bolsa não concedida");
        }

        System.out.println("---------------------------");

        // 10 - 
        System.out.println(" Qual a temperatura ambiente (°C)?");
        double tempAmbiente = scanner.nextDouble();
        System.out.println("Qual a umidade (%)?");
        int umidade = scanner.nextInt();
        if ((tempAmbiente < 18 || tempAmbiente > 26) && umidade > 60) {
            System.out.println("Ajustar climatização");
        } else {
            System.out.println("Climatização não necessária");
        }
		
		
		
		
		
		
		
		
		
		
		
         }
	}