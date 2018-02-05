package com.nutricao.sistemaNutricional.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity

public class Consulta {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataConsulta;
	
	@ManyToOne
	@JoinColumn(name="paciente", referencedColumnName="id")
	private Paciente paciente;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate proximaConsulta;
	
		
	public LocalDate getProximaConsulta() {
		return proximaConsulta;
	}

	public void setProximaConsulta(LocalDate proximaConsulta) {
		this.proximaConsulta = proximaConsulta;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Consulta(Long id, LocalDate dataConsulta, Paciente paciente, LocalDate proximaConsulta) {
		super();
		this.id = id;
		this.dataConsulta = dataConsulta;
		this.paciente = paciente;
		this.proximaConsulta = proximaConsulta;
		
	}

	public LocalDate adiciona30diasConsulta(LocalDate data) {
		return data.plusDays(30);
	}

	
	
	
	
	

}
