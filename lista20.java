package primeiroProjeto;

public class lista20 {

    public static void main(String[] args) {
 

        
        repetirSaudacao();

        desenharRetangulo();

        imprimirMultiplos5();


        contagemCrescente();

 
        mostrarMeses();

   

     
        verificarDivisivelPor5(10);
        verificarDivisivelPor5(7);

   
        despedida("DANILO ");

     
        unirNomes("DANILO", "BRANT");

   
        verificarMaiorQue100(50);
        verificarMaiorQue100(150);

    
        classificarVelocidade(30);
        classificarVelocidade(60);
        classificarVelocidade(100);

        
        saudacaoDiaSemana("segunda");
        saudacaoDiaSemana("sexta");

        verificarEstoque(3);
        verificarEstoque(7);
        verificarEstoque(12);
    }

    

    // 1
    public static void repetirSaudacao() {
        System.out.println("1 – Repetindo uma saudação");
        for (int i = 0; i < 5; i++) {
            System.out.println("Bom dia!");
        }
        System.out.println();
    }

    // 2
    public static void desenharRetangulo() {
        System.out.println("2 – Desenhando um retângulo");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // 3
    public static void imprimirMultiplos5() {
        System.out.println("3 – Imprimindo múltiplos de 5");
        for (int i = 5; i <= 25; i += 5) {
            System.out.println(i);
        }
        System.out.println();
    }

    // 4
    public static void contagemCrescente() {
        System.out.println("4 – Exibindo contagem crescente");
        for (int i = 1; i <= 8; i++) {
            System.out.print(i + " ");
        }
        System.out.println("Pronto!\n");
    }

    // 5
    public static void mostrarMeses() {
        System.out.println("5 – Mostrando os meses do ano");
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"};
        for (String mes : meses) {
            System.out.println(mes);
        }
        System.out.println();
    }

    

    // 1
    public static void verificarDivisivelPor5(int numero) {
        System.out.println("1 – Verificando divisibilidade de " + numero);
        if (numero % 5 == 0) {
            System.out.println(numero + " é divisível por 5");
        } else {
            System.out.println(numero + " não é divisível por 5");
        }
        System.out.println();
    }

    // 2
    public static void despedida(String nome) {
        System.out.println("2 – Mensagem de despedida");
        System.out.println("Até logo, " + nome + "!\n");
    }

    // 3
    public static void unirNomes(String primeiroNome, String sobrenome) {
        System.out.println("3 – Unindo nomes");
        System.out.println(primeiroNome + " " + sobrenome + "\n");
    }

    // 4
    public static void verificarMaiorQue100(int numero) {
        System.out.println("4 – Verificando se " + numero + " é maior que 100");
        if (numero > 100) {
            System.out.println(numero + " é maior que 100");
        } else {
            System.out.println(numero + " não é maior que 100");
        }
        System.out.println();
    }

    // 5
    public static void classificarVelocidade(int velocidade) {
        System.out.println("5 – Classificando velocidade: " + velocidade);
        if (velocidade < 40) {
            System.out.println("Lenta");
        } else if (velocidade <= 80) {
            System.out.println("Normal");
        } else {
            System.out.println("Rápida");
        }
        System.out.println();
    }

    // 6
    public static void saudacaoDiaSemana(String dia) {
        System.out.println("6 – Saudação por dia da semana");
        System.out.println("Tenha uma ótima " + dia + "!\n");
    }

    // 7
    public static void verificarEstoque(int quantidade) {
        System.out.println("7 – Verificando situação de estoque: " + quantidade);
        if (quantidade >= 10) {
            System.out.println("Estoque suficiente");
        } else if (quantidade >= 5) {
            System.out.println("Estoque baixo");
        } else {
            System.out.println("Estoque crítico");
        }
        System.out.println();
    }
}