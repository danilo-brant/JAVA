package Restaurante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Prato p1 = new Pizza();
        Prato p2 = new Lasanha();
        Prato p3 = new Salada();

        System.out.println("Pizza - R$ " + p1.calcularPreco());
        System.out.println("Lasanha - R$ " + p2.calcularPreco());
        System.out.println("Salada - R$ " + p3.calcularPreco());

        System.out.print("Qual prato você escolheria (pizza, lasanha ou salada)? ");
        String escolha = sc.nextLine();

        System.out.println("Você escolheu: " + escolha);
    }
}
