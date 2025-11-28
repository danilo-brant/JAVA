package lista24;

import java.util.Scanner;

public class mainAnimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cachorro c = new Cachorro();
        System.out.print("Digite o nome do cachorro: ");
        c.setNome(sc.nextLine());

        System.out.print("Digite a raça do cachorro: ");
        c.setRaca(sc.nextLine());

        System.out.print("Digite a idade do cachorro: ");
        c.setIdade(sc.nextInt());

        System.out.println();
        c.mostrarInfo();
        c.abanarRabo();
    }
}
