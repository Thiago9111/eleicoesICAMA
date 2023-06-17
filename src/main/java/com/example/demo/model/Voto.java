package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "calcme")
public class Voto {
	
	@Id
	private String id;
	private String matricula;
	private String candidato;
	private String telefone;
	
	public Voto() {
		super();
	}

	public Voto(String nome, String email, String telefone) {
		super();
		this.matricula = nome;
		this.candidato = email;
		this.telefone = telefone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCandidato() {
		return candidato;
	}

	public void setCandidato(String candidato) {
		this.candidato = candidato;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

}
