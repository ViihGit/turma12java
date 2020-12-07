package com.example.blogPessoal.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_tema")
public class Tema {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private String descricao;
	
	@OneToMany(mappedBy = "tema" , cascade = CascadeType.ALL) //CascadeType.ALL = se por acaso alterar alguma coisa (delete, update...) refrente a este tema, todas as postagens referente aquele tema, sofrerão alteração, logo se deletar alguma postagem, todas as postagens que referem-se aquele tema, serão deletadas.
	@JsonIgnoreProperties ("tema")
	private List<Postagem> postagem;
	
	public long getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Postagem> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
	}

	public void setId(long id) {
		this.id = id;
	}
	



}
