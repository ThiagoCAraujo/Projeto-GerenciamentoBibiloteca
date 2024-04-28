package entities;

import java.util.ArrayList;

public class Cliente extends Pessoa{
    protected String usuario;
    protected String senha;
    private Integer idCliente;
    protected ArrayList<Livro> livrosEmprestados;

    public Cliente() {
    }
    public Cliente (String usuario, String senha){
        this.usuario = usuario;
        this.senha = senha;
    }
    public Cliente(String nome, String endereco, String telefone, Integer idCliente,
                   ArrayList<Livro> livrosEmprestados) {
        super(nome, endereco, telefone);
        this.idCliente = idCliente;
        this.livrosEmprestados = livrosEmprestados;
    }
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public ArrayList<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void emprestarLivro(Livro livro) {
        livrosEmprestados.add(livro);
    }

    public void devolverLivro(Livro livro) {
        livrosEmprestados.remove(livro);
    }

    public void imprimirDetalhes() {
        super.imprimirDetalhes();
        System.out.println("ID do Cliente: " + idCliente);
        System.out.println("Livros Emprestados:");
        for (Livro livro : livrosEmprestados) {
            System.out.println("- " + livro.getTitulo());
        }
    }
}
