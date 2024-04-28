package entities;

import java.util.ArrayList;

public class Biblioteca {
	protected ArrayList<Livro> listaLivros;
	protected ArrayList<Cliente> listaClientes;
	
	public Biblioteca() {
	}

	public Biblioteca(ArrayList<Livro> listaLivros, ArrayList<Cliente> listaClientes) {
		this.listaLivros = listaLivros;
		this.listaClientes = listaClientes;
	}
	
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
		if(livro.getStatus()) {
			livro.setStatus(false);
			cliente.emprestarLivro(livro);
		} else {
			System.out.println("Livro nao disponivel para emprestimo!");
		}
	}
	
	public void devolverLivro(Cliente cliente, Livro livro) {
		if(livro.getStatus()) {
			cliente.devolverLivro(livro);
			livro.setStatus(true);
		} else {
			System.out.println("Esse livro nao foi emprestado por esse cliente!");
		}
	}
}