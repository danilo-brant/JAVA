package primeiroProjeto;

import java.util.Scanner;

public class lista20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ============================
        // Funções sem parâmetro
        // ============================

        System.out.println("\n1 – Repetindo uma saudação:");
        saudacao();

        System.out.println("\n2 – Desenhando um retângulo:");
        desenharRetangulo();

        System.out.println("\n3 – Imprimindo múltiplos de 5:");
        multiplosDe5();

        System.out.println("\n4 – Exibindo contagem crescente:");
        contagem();

        System.out.println("\n5 – Mostrando os primeiros meses do ano:");
        mesesDoAno();

        // ============================
        // Funções com parâmetro (interativas)
        // ============================

        System.out.println("\n6 – Verificando divisibilidade por 5:");
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        divisivelPor5(numero);

        System.out.println("\n7 – Mensagem de despedida:");
        System.out.print("Digite seu nome: ");
        String nome = sc.next();
        despedida(nome);

        System.out.println("\n8 – Unindo nomes:");
        System.out.print("Digite o primeiro nome: ");
        String primeiroNome = sc.next();
        System.out.print("Digite o sobrenome: ");
        String sobrenome = sc.next();
        nomeCompleto(primeiroNome, sobrenome);

        System.out.println("\n9 – Verificando maior que 100:");
        System.out.print("Digite um número inteiro: ");
        int numero2 = sc.nextInt();
        maiorQue100(numero2);

        System.out.println("\n10 – Classificando velocidade:");
        System.out.print("Digite a velocidade: ");
        int velocidade = sc.nextInt();
        classificarVelocidade(velocidade);

        System.out.println("\n11 – Saudação por dia da semana:");
        System.out.print("Digite o dia da semana: ");
        String dia = sc.next();
        saudacaoDia(dia);

        System.out.println("\n12 – Verificando situação de estoque:");
        System.out.print("Digite a quantidade em estoque: ");
        int estoque = sc.nextInt();
        verificarEstoque(estoque);

        sc.close();
    }

    // ============================
    // Funções sem parâmetro
    // ============================

    public static void saudacao() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Bom dia!");
        }
    }

    public static void desenharRetangulo() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void multiplosDe5() {
        for (int i = 5; i <= 25; i += 5) {
            System.out.println(i);
        }
    }

    public static void contagem() {
        for (int i = 1; i <= 8; i++) {
            System.out.println(i);
        }
        System.out.println("Pronto!");
    }

    public static void mesesDoAno() {
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"};
        for (String mes : meses) {
            System.out.println(mes);
        }
    }

    // ============================
    // Funções com parâmetro
    // ============================

    public static void divisivelPor5(int numero) {
        if (numero % 5 == 0) {
            System.out.println(numero + " é divisível por 5");
        } else {
            System.out.println(numero + " não é divisível por 5");
        }
    }

    public static void despedida(String nome) {
        System.out.println("Até logo, " + nome + "!");
    }

    public static void nomeCompleto(String primeiroNome, String sobrenome) {
        System.out.println("Nome completo: " + primeiroNome + " " + sobrenome);
    }

    public static void maiorQue100(int numero) {
        if (numero > 100) {
            System.out.println(numero + " é maior que 100");
        } else {
            System.out.println(numero + " não é maior que 100");
        }
    }

    public static void classificarVelocidade(int velocidade) {
        if (velocidade < 40) {
            System.out.println("Lenta");
        } else if (velocidade <= 80) {
            System.out.println("Normal");
        } else {
            System.out.println("Rápida");
        }
    }

    public static void saudacaoDia(String dia) {
        System.out.println("Tenha uma ótima " + dia + "!");
    }

    public static void verificarEstoque(int quantidade) {
        if (quantidade >= 10) {
            System.out.println("Estoque suficiente");
        } else if (quantidade >= 5) {
            System.out.println("Estoque baixo");
        } else {
            System.out.println("Estoque crítico");
        }
    }
}
