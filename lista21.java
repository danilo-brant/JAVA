package primeiroProjeto;

import java.util.Scanner;

public class lista21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== LISTA DE EXERCÍCIOS JAVA ===\n");

        // 1 - Somar
        System.out.println("1 - Digite dois números inteiros para somar:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Resultado da soma: " + somar(a, b));

        // 2 - Subtrair
        System.out.println("\n2 - Digite dois números inteiros para subtrair:");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Resultado da subtração: " + subtrair(a, b));

        // 3 - Multiplicar
        System.out.println("\n3 - Digite dois números para multiplicar:");
        double m1 = sc.nextDouble();
        double m2 = sc.nextDouble();
        System.out.println("Resultado da multiplicação: " + multiplicar(m1, m2));

        // 4 - Dividir
        System.out.println("\n4 - Digite dois números para dividir:");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        System.out.println(dividir(d1, d2));

        // 5 - Calcular média
        System.out.println("\n5 - Digite duas notas:");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        System.out.println("Média: " + calcularMedia(n1, n2));

        // 6 - Verificar aprovação
        System.out.println("\n6 - Digite duas notas para verificar aprovação:");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        System.out.println(verificarAprovacao(n1, n2));

        // 7 - Maior número
        System.out.println("\n7 - Digite dois números inteiros:");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(maiorNumero(a, b));

        // 8 - Converter Celsius para Fahrenheit
        System.out.println("\n8 - Digite a temperatura em Celsius:");
        double celsius = sc.nextDouble();
        System.out.println("Temperatura em Fahrenheit: " + converterCelsiusParaFahrenheit(celsius));

        // 9 - Calcular área do retângulo
        System.out.println("\n9 - Digite a base e a altura do retângulo:");
        double base = sc.nextDouble();
        double altura = sc.nextDouble();
        System.out.println("Área do retângulo: " + calcularAreaRetangulo(base, altura));

        // 10 - Gerar mensagem
        System.out.println("\n10 - Digite seu nome:");
        sc.nextLine(); // limpar buffer
        String nome = sc.nextLine();
        System.out.println(gerarMensagem(nome));

        // 11 - Juntar dois nomes
        System.out.println("\n11 - Digite dois nomes:");
        String nome1 = sc.nextLine();
        String nome2 = sc.nextLine();
        System.out.println("Nomes juntos: " + juntarNomes(nome1, nome2));

        // 12 - Avaliar idade
        System.out.println("\n12 - Digite sua idade:");
        int idade = sc.nextInt();
        System.out.println("Classificação: " + avaliarIdade(idade));

        System.out.println("\n=== FIM DA LISTA ===");
        sc.close();
    }

    // 1
    public static int somar(int a, int b) {
        return a + b;
    }

    // 2
    public static int subtrair(int a, int b) {
        return a - b;
    }

    // 3
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // 4
    public static String dividir(double a, double b) {
        if (b == 0) {
            return "Não é possível dividir por 0";
        } else {
            return "Resultado da divisão: " + (a / b);
        }
    }

    // 5
    public static double calcularMedia(double n1, double n2) {
        return (n1 + n2) / 2;
    }

    // 6
    public static String verificarAprovacao(double n1, double n2) {
        double media = calcularMedia(n1, n2);
        if (media >= 6) {
            return "Aprovado (média " + media + ")";
        } else {
            return "Reprovado (média " + media + ")";
        }
    }

    // 7
    public static String maiorNumero(int a, int b) {
        if (a > b) {
            return "O maior número é: " + a;
        } else if (b > a) {
            return "O maior número é: " + b;
        } else {
            return "Os números são iguais.";
        }
    }

    // 8
    public static double converterCelsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // 9
    public static double calcularAreaRetangulo(double base, double altura) {
        return base * altura;
    }

    // 10
    public static String gerarMensagem(String nome) {
        return "Olá, " + nome + "!";
    }

    // 11
    public static String juntarNomes(String nome1, String nome2) {
        return nome1 + " " + nome2;
    }

    // 12
    public static String avaliarIdade(int idade) {
        if (idade < 12) {
            return "Criança";
        } else if (idade < 18) {
            return "Adolescente";
        } else if (idade < 60) {
            return "Adulto";
        } else {
            return "Idoso";
        }
    }
}
