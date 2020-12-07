package com.example.blogPessoal.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;


@Entity
@Table(name = "Postagem")
public class Postagem {
	
	//___________________________________________________atributos_________________________________________________________________________________________	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //(primarykey)
	private Long id;
	
	@NotNull
	@Size(min = 5, max =100) //determinar a quantiade de caracter que o cliente pode enviar como titulo
	private String titulo;
	
	@NotNull
	@Size(min = 10, max =500)
	private String texto;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date = new java.sql.Date(System.currentTimeMillis());

	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Tema tema;
	
	//__________________________________________________Gets and Setters_____________________________________________________________________
	
	
	public Long getId() {
		return id;
	}
	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	public Tema getTema() {
		return tema;
	}
		


}
