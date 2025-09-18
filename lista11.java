package primeiroProjeto;

import java.util.Scanner;

public class lista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
 
    // 1 
        int num = 1;
        do {
            System.out.println(num);
            num += 2;
        } while (num <= 31);
    }

    // 2 
    public static void adivinhacao(Scanner sc) {
        int numero;
        do {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();
        } while (numero != 100);

        System.out.println("Você acertou! O número é 100.");
    }

    // 3 
    public static void menuInterativo(Scanner sc) {
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Continuar");
            System.out.println("2 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Você escolheu continuar!");
            } else if (opcao == 2) {
                System.out.println("Encerrando menu interativo...");
            } else {
                System.out.println("Opção inválida!");
            }
        } while (opcao != 2);
    }

    // 4 
    public static void classificacao(Scanner sc) {
        int contador = 0;
        do {
            System.out.print("Digite um número: ");
            int num = sc.nextInt();

            if (num < 10) {
                System.out.println("Tipo A");
            } else if (num < 20) {
                System.out.println("Tipo B");
            } else {
                System.out.println("Fora da Categoria");
            }

            contador++;
        } while (contador < 5);
    }

    // 5 
    public static void forno(Scanner sc) {
        int temp;
        do {
            System.out.print("Digite a temperatura do forno: ");
            temp = sc.nextInt();

            if (temp >= 200) {
                System.out.println("ALERTA! Temperatura muito alta!");
            }
        } while (temp >= 200);

        System.out.println("Temperatura segura.");
    }

    // 6 
    public static void bateria(Scanner sc) {
        int nivel;
        do {
            System.out.print("Digite o nível da bateria (%): ");
            nivel = sc.nextInt();

            if (nivel <= 20) {
                System.out.println("Bateria baixa!");
            }
        } while (nivel <= 20);

        System.out.println("Bateria suficiente!");
    }

    // 7
    public static void conta(Scanner sc) {
        System.out.print("Deseja fazer uma conta? (sim/não): ");
        String resposta = sc.next();

        if (resposta.equalsIgnoreCase("sim")) {
            System.out.print("Digite o primeiro número: ");
            int n1 = sc.nextInt();

            System.out.print("Digite o segundo número: ");
            int n2 = sc.nextInt();

            System.out.println("Resultado da soma: " + (n1 + n2));
        } else {
            System.out.println("Ok, voltando ao menu principal.");
        }
        
        
        
        
    }
}

