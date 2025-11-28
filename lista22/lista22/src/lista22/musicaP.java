package lista22;

public class musicaP {
public static void main(String[] args) {
musica m1 = new musica();
m1.titulo = "A Última dança";
m1.artista = "Matuê";
m1.duracao = 3.32;

musica m2 = new musica();
m2.titulo = "Maria";
m2.artista = "Matuê";
m2.duracao = 3.16;

musica m3 = new musica();
 m3.titulo = "Gorila Roxo";
 m3.artista = "Matuê";
 m3.duracao = 2.46;

m1.tocar(); m1.mostrarDetalhes(); m1.pausar();
m2.tocar(); m2.mostrarDetalhes(); m2.pausar();
m3.tocar(); m3.mostrarDetalhes(); m3.pausar();
		    }


	}

