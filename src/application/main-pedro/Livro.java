public class Main {
    public static void main(String[] args) {
        // criando os livros
        Livro livro1 = new Livro("Os Códigos do Milhão", "Pablo Marçal", 1, true);
        Livro livro2 = new Livro("O homem mais rico da Babilônia", "George Samuel Clason", 2, false);
        Livro livro3 = new Livro("Do Mil ao Milhão. Sem Cortar o Cafezinho", "Thiago Nigro", 3, true);
        Livro livro4 = new Livro("A arte da negociação", "Donald J. Trump", 4, false);

        // info dos livros
        System.out.println("Informações do Livro 1:");
        exibirInformacoesLivro(livro1);

        System.out.println("\nInformações do Livro 2:");
        exibirInformacoesLivro(livro2);

        System.out.println("\nInformações do Livro 3:");
        exibirInformacoesLivro(livro3);

        System.out.println("\nInformações do Livro 4:");
        exibirInformacoesLivro(livro4);

        // botando livro 2 para disponivel
        livro2.setStatus(true);
        System.out.println("\nStatus do Livro 2 atualizado para disponível.");
        System.out.println("Novo status do Livro 2: " + (livro2.getStatus() ? "Disponível" : "Indisponível"));
    }
     \\ botei essa função pra ficar mais facil de adicionar
    public static void exibirInformacoesLivro(Livro livro) {
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("ID: " + livro.getIdLivro());
        System.out.println("Status: " + (livro.getStatus() ? "Disponível" : "Indisponível"));
    }
}
