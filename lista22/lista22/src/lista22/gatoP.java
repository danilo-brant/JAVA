package lista22;

import java.util.Scanner;

public class gatoP {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		gato cat = new gato();
		
		cat.nome = "Mingau";
		cat.idade = 2;
		cat.raca = "Gato Persa";
		
		
		cat.miar();
		cat.comer();
		cat.mostrarInformacoes();
		
		gato cat2 = new gato();
		
		cat.nome = "Fubá";
		cat.idade = 4;
		cat.raca = "Siamês";
		
		
		cat.miar();
		cat.comer();
		cat.mostrarInformacoes();
	}

}
