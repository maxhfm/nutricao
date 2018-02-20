package com.nutricao.sistemaNutricional.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Paciente {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message = "A descrição é obrigatória")
	@NotEmpty(message = "A descrição não pode estar vazia")
	private String nome;
	private String cpf;
	
	@Column(name="data_nascimento")
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private LocalDate dataNascimento;
	
	private String sexo;
	private String telefone1;
	private String telefone2;
	private String email;
	private String objetivo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTelefone1() {
		return telefone1;
	}

	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}

	public String getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Paciente() {
		super();
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Paciente(Long id, String nome, String cpf, LocalDate dataNascimento, String sexo, String telefone1,
			String telefone2, String email, String objetivo) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.telefone1 = telefone1;
		this.telefone2 = telefone2;
		this.email = email;
		this.objetivo = objetivo;
	}

	public Paciente(String nome, String telefone1) {
		super();
		this.nome = nome;
		this.telefone1 = telefone1;
	}

	
	
	

	
	

}
