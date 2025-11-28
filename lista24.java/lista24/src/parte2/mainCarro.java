package parte2;

import java.util.Scanner;

public class mainCarro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro carro = new Carro();

        System.out.print("Digite a marca do carro: ");
        carro.setMarca(sc.nextLine());

        System.out.print("Digite o ano do carro: ");
        carro.setAno(sc.nextInt());

        System.out.print("Digite a quantidade de portas: ");
        carro.setPortas(sc.nextInt());

        System.out.println();
        carro.exibirInfo();
        System.out.println("Portas: " + carro.getPortas());
        carro.abrirPortaMalas();

        sc.close();
    }
}
