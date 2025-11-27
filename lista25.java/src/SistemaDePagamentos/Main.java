package SistemaDePagamentos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pagamento p1 = new Pix();
        Pagamento p2 = new CartaoCredito();
        Pagamento p3 = new Dinheiro();

        p1.processarPagamento();
        p2.processarPagamento();
        p3.processarPagamento();

        System.out.print("Qual forma de pagamento você usaria (pix, cartão ou dinheiro)? ");
        String escolha = sc.nextLine();

        System.out.println("Você escolheu: " + escolha);
    }
}
