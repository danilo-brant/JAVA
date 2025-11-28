package lista22;

public class produtoP {
public static void main(String[] args) {
 produto p1 = new produto();
 p1.nome = "Mouse Gamer";
 p1.preco = 150.0;
 p1.estoque = 10;

	produto p2 = new produto();
	p2.nome = "Teclado Mecânico";
	p2.preco = 250.0;
	p2.estoque = 5;

	p1.vender(3);
 	p1.mostrarInformacoes();

 	p2.vender(7);
	p2.mostrarInformacoes();
		    }


	}

