package lista22;

public class filmeP {
		    public static void main(String[] args) {
		        filme f1 = new filme();
	f1.titulo = "Vingadores";
	f1.genero = "Ação";
 	f1.duracao = 140;

 	filme f2 = new filme();
	f2.titulo = "Titanic";
	f2.genero = "Romance";
	f2.duracao = 195;

	filme f3 = new filme();
	f3.titulo = "Toy Story";
	f3.genero = "Animação";
	f3.duracao = 90;

		        f1.assistir(); f1.mostrarInformacoes();
		        f2.assistir(); f2.mostrarInformacoes();
		        f3.assistir(); f3.mostrarInformacoes();
		    }
		}


	


