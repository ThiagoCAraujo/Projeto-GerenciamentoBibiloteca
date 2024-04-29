package entities;

import java.util.ArrayList;

public class Cliente extends Pessoa {
    private int idCliente;
    protected ArrayList<Livro> livrosEmprestados;

    // Construtor
    public Cliente(String nome, String endereco, String telefone, int idCliente) {
        super(nome, endereco, telefone);
        this.idCliente = idCliente;
        this.livrosEmprestados = new ArrayList<>();
    }

    // Getters e Setters
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public ArrayList<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    // Método para emprestar livro
    public void emprestarLivro(Livro livro) {
        livrosEmprestados.add(livro);
        livro.setStatus("Emprestado");
    }

    // Método para devolver livro
    public void devolverLivro(Livro livro) {
        livrosEmprestados.remove(livro);
        livro.setStatus("Disponível");
    }

    // Sobrescrita do método para imprimir detalhes
    @Override
    public void imprimirDetalhes() {
        super.imprimirDetalhes();
        System.out.println("ID do Cliente: " + idCliente);
        System.out.println("Livros Emprestados:");
        for (Livro livro : livrosEmprestados) {
            System.out.println("- " + livro.getTitulo());
        }
    }
}
