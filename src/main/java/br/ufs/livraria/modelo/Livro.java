package br.ufs.livraria.modelo;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Livro extends Entidade implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(length = 50)
	private String titulo;
	
	private String sinopse;
	
	@Column(length = 2)
	private Integer edicao;
	
	@Column(length = 4)
	private Integer ano;
	
	@Column(length = 13)
	private String isbn;
	
	@Column(length = 4)
	private Integer estoque;
	
	@Column(length = 50)
	private String genero;
	
	@Column(length = 50)
	private String autor;
	
	@Column(length = 50)
	private String editora;
	
	@Column(precision = 4, scale = 2)
	private Float preco;

	public Livro() {
	}

	public String getTitulo() {
		return titulo;
	}
	
	public String getSinopse() {
		return sinopse;
	}

	public Integer getEdicao() {
		return edicao;
	}

	public Integer getAno() {
		return ano;
	}

	public String getIsbn() {
		return isbn;
	}

	public Integer getEstoque() {
		return estoque;
	}

	public String getGenero() {
		return genero;
	}

	public String getAutor() {
		return autor;
	}

	public String getEditora() {
		return editora;
	}
	
	public Float getPreco() {
		return preco;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public void setEdicao(Integer edicao) {
		this.edicao = edicao;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	public void setPreco(Float preco) {
		this.preco = preco;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Livro) {
			Livro outroLivro = (Livro) obj;
			return this.getId() == outroLivro.getId();
		}
		return false;
	}
	
	public String getSinopseCurta() {
		if (sinopse == null || sinopse.isEmpty()) {
			return "";
		}
		final int TAMANHO_MAXIMO = 100;
		int tamanho = (sinopse.length() < TAMANHO_MAXIMO) ? sinopse.length() : TAMANHO_MAXIMO - 3;
		return sinopse.substring(0, tamanho) + ((sinopse.length() > TAMANHO_MAXIMO) ? "..." : "");
	}

}