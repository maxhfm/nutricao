package com.nutricao.sistemaNutricional.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Consulta {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataConsulta;
	@NotNull(message = "Campo obrigatório")
	@NotEmpty(message = "O campo não pode estar vazia")
	private int paciente;

	
		
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getPaciente() {
		return paciente;
	}

	public void setPaciente(int paciente) {
		this.paciente = paciente;
	}

	public Consulta() {
		super();
	}

	public LocalDate getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(LocalDate dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	public Consulta(Long id, LocalDate dataConsulta, int paciente) {
		super();
		this.id = id;
		this.dataConsulta = dataConsulta;
		this.paciente = paciente;
	}
	
	
	
	
	

}
