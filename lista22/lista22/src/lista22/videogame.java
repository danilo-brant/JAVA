package lista22;

public class videogame {
	    String marca;
	    String modelo;
	    boolean ligado;

	    void ligar() {
	        ligado = true;
	        System.out.println("O console está ligado.");
	    }

	    void desligar() {
	        ligado = false;
	        System.out.println("O console foi desligado.");
	    }

	    void verificarStatus() {
	        System.out.println("Status: " + (ligado ? "Ligado" : "Desligado"));
	    }
	}


