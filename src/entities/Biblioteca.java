package entities;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> listaLivros;
    private ArrayList<Cliente> listaClientes;

    // Construtor
    public Biblioteca() {
        listaLivros = new ArrayList<>();
        listaClientes = new ArrayList<>();
    }

    // Getters
    public ArrayList<Livro> getListaLivros() {
        return listaLivros;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    // Métodos da Biblioteca
    public void adicionarLivro(Livro livro) {
        listaLivros.add(livro);
    }

    public void removerLivro(Livro livro) {
        listaLivros.remove(livro);
    }

    public void adicionarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public void removerCliente(Cliente cliente) {
        listaClientes.remove(cliente);
    }

    public void emprestarLivro(Cliente cliente, Livro livro) {
        if (livro.getStatus().equals("Disponível")) {
            cliente.emprestarLivro(livro);
            System.out.println("Livro pego emprestado com sucesso!");
        } else {
            System.out.println("O livro não está disponível para empréstimo.");
        }
    }

    public void devolverLivro(Cliente cliente, Livro livro) {
        if (cliente.getLivrosEmprestados().contains(livro)) {
            cliente.devolverLivro(livro);
            System.out.println("Livro devolvido com sucesso!");
        } else {
            System.out.println("Este cliente não tem este livro emprestado.");
        }
    }

    public Cliente encontrarClientePorID(int idCliente) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getIdCliente() == idCliente) {
                return cliente;
            }
        }
        return null;
    }

    public Livro encontrarLivroPorID(int idLivro) {
        for (Livro livro : listaLivros) {
            if (livro.getIdLivro() == idLivro) {
                return livro;
            }
        }
        return null;
    }
}
