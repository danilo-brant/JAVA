package parte4;

public class mainProduto {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.setNome("Dom Casmurro");
        livro.setPreco(39.90);
        livro.setAutor("Machado de Assis");

        livro.mostrarInfo();
    }
}
