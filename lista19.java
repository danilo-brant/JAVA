package primeiroProjeto;

import java.util.Scanner;

public class lista19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // 1 – 
        System.out.println("Digite um número para classificar (positivo/negativo/zero): ");
        int numero = sc.nextInt();
        classificarValor(numero);

        // 2 – 
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        maioridade(idade);

        // 3 –
        System.out.println("Digite seu nome: ");
        String nome = sc.next();
        boasVindas(nome);

        // 4 – 
        System.out.println("Digite um número para ver a tabuada: ");
        int nTabuada = sc.nextInt();
        tabuada(nTabuada);

        // 5 – 
        System.out.println("Digite a primeira palavra: ");
        String p1 = sc.next();
        System.out.println("Digite a segunda palavra: ");
        String p2 = sc.next();
        juntarPalavras(p1, p2);

        // 6 –
        System.out.println("Digite um número para verificar se é par ou ímpar: ");
        int numParImpar = sc.nextInt();
        verificarParImpar(numParImpar);

        // 7 – 
        System.out.println("Digite a temperatura: ");
        int temp = sc.nextInt();
        classificarTemperatura(temp);

        // 8 – 
        System.out.println("Digite o turno (manha/tarde/noite): ");
        String turno = sc.next();
        saudacaoTurno(turno);

        // 9 –
        System.out.println("Digite a primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double n2 = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double n3 = sc.nextDouble();
        calcularMedia(n1, n2, n3);

        // 10 – 
        System.out.println("Digite a nota final do aluno: ");
        double notaFinal = sc.nextDouble();
        verificarAprovacao(notaFinal);

        
    }

    public static void classificarValor(int numero) {
        if (numero > 0) {
            System.out.println(numero + " é positivo");
        } else if (numero < 0) {
            System.out.println(numero + " é negativo");
        } else {
            System.out.println("Zero");
        }
    }

    public static void maioridade(int idade) {
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }

    public static void boasVindas(String nome) {
        System.out.println("Bem-vindo(a), " + nome + "!");
    }

    public static void tabuada(int numero) {
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void juntarPalavras(String p1, String p2) {
        System.out.println("Concatenadas: " + p1 + p2);
    }

    public static void verificarParImpar(int numero) {
        if (numero % 2 == 0) {
            System.out.println(numero + " é par");
        } else {
            System.out.println(numero + " é ímpar");
        }
    }

    public static void classificarTemperatura(int temp) {
        if (temp < 15) {
            System.out.println("Frio");
        } else if (temp <= 25) {
            System.out.println("Agradável");
        } else {
            System.out.println("Quente");
        }
    }

    public static void saudacaoTurno(String turno) {
        switch (turno.toLowerCase()) {
            case "manha":
                System.out.println("Bom dia!");
                break;
            case "tarde":
                System.out.println("Boa tarde!");
                break;
            case "noite":
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Turno inválido!");
        }
    }

    public static void calcularMedia(double n1, double n2, double n3) {
        double media = (n1 + n2 + n3) / 3;
        System.out.println("Média = " + media);
    }

    public static void verificarAprovacao(double nota) {
        if (nota >= 7) {
            System.out.println("Aprovado!");
        } else if (nota >= 5) {
            System.out.println("Em recuperação.");
        } else {
            System.out.println("Reprovado.");
        }
    }

	}
	      
