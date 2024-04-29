package entities;

public class Livro {
	private String titulo;
	private String autor;
	private Integer idLivro;
	private Boolean status;
	
	public Livro() {
	}

	public Livro(String titulo, String autor, Integer idLivro, Boolean status) {
		this.titulo = titulo;
		this.autor = autor;
		this.idLivro = idLivro;
		this.status = status;
	}

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

	public Integer getIdLivro() {
		return idLivro;
	}

	public void setIdLivro(Integer idLivro) {
		this.idLivro = idLivro;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	public void exibirInformacoes() {
		System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("idLivro: " + idLivro);
        System.out.println("Status: " + (status ? "Disponível" : "Emprestado"));
	}
}
