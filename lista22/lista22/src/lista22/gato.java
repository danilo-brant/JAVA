package lista22;

public class gato {
	String nome;
	String raca;
	int idade;
	
	void miar () {
		System.out.println("Miau!");
	}
	void comer () {
		System.out.println(nome + " está comendo");
	}
	void mostrarInformacoes() {
		System.out.println("O nome do gato é " + nome + " a raça é " + raca + " e a idade é " + idade);
		
	}

}
