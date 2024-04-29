package entities;

public class Livro {
    public String titulo;
    public String autor;
    public int idLivro;
    public String status;

    // Construtor
    public Livro(String titulo, String autor, int idLivro) {
        this.titulo = titulo;
        this.autor = autor;
        this.idLivro = idLivro;
        this.status = "Disponível";
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    // Método para imprimir os detalhes do livro
    public void imprimirDetalhes() {
        System.out.println("- Título: " + titulo + ", Autor: " + autor + ", ID: " + idLivro);
    }
}
