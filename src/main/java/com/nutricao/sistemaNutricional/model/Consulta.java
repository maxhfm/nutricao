package com.nutricao.sistemaNutricional.model;



public class Consulta {

	private int id;
	private String dataConsulta;
	private Paciente paciente;

	public Consulta(int id, String dataConsulta, Paciente paciente) {
		super();
		this.id = id;
		this.dataConsulta = dataConsulta;
		this.paciente = paciente;
	}

	public Consulta(String dataConsulta, Paciente paciente) {
		super();
		this.dataConsulta = dataConsulta;
		this.paciente = paciente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(String dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Consulta() {
		super();
	}
	
	

}
