package com.nutricao.sistemaNutricional.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity

public class Consulta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "data_consulta")
	private LocalDate dataConsulta;

	@ManyToOne
	private Paciente paciente;

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "proxima_consulta")
	private LocalDate proximaConsulta;

	private float pesoHabitual;
	private float pesoIdeal;
	private float pesoIMC;
	private float pesoAtual;
	private float estatura;
	private float porcentagemGordura;
	private float porcentagemMassaMagra;
	private float gorduraVisceral;
	private int idadeMetabolica;
	private float circunferenciaBraco;
	private float circunferenciaBracoContraido;
	private float circunferenciaQuadril;
	private float circunferenciaAbnominal;
	private float circunferenciaPerna;
	private float circunferenciaCoxa;
	private float circunferenciaPeito;
	private float circunferenciaCintura;
	private float circunferenciaPanturrilha;
	private String usodeBebidaAlcoolica;
	private String fumante;
	private String consumoAgua; //informa quantidade
	private String consumoSal;
	private String consumoSuplemento;
	private String recordatorioHabitual; //dejejum / colação / almoco / lanche / janta / ceia
	private String alimentos; //
	private String horarioRefeicao; // dejejum / colação / almoco / lanche / janta / ceia

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

	public float getPesoHabitual() {
		return pesoHabitual;
	}

	public void setPesoHabitual(float pesoHabitual) {
		this.pesoHabitual = pesoHabitual;
	}

	public float getPesoIdeal() {
		return pesoIdeal;
	}

	public void setPesoIdeal(float pesoIdeal) {
		this.pesoIdeal = pesoIdeal;
	}

	public float getPesoIMC() {
		return pesoIMC;
	}

	public void setPesoIMC(float pesoIMC) {
		this.pesoIMC = pesoIMC;
	}

	public float getPesoAtual() {
		return pesoAtual;
	}

	public void setPesoAtual(float pesoAtual) {
		this.pesoAtual = pesoAtual;
	}

	public float getEstatura() {
		return estatura;
	}

	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}

	public float getPorcentagemGordura() {
		return porcentagemGordura;
	}

	public void setPorcentagemGordura(float porcentagemGordura) {
		this.porcentagemGordura = porcentagemGordura;
	}

	public float getPorcentagemMassaMagra() {
		return porcentagemMassaMagra;
	}

	public void setPorcentagemMassaMagra(float porcentagemMassaMagra) {
		this.porcentagemMassaMagra = porcentagemMassaMagra;
	}

	public float getGorduraVisceral() {
		return gorduraVisceral;
	}

	public void setGorduraVisceral(float gorduraVisceral) {
		this.gorduraVisceral = gorduraVisceral;
	}

	public int getIdadeMetabolica() {
		return idadeMetabolica;
	}

	public void setIdadeMetabolica(int idadeMetabolica) {
		this.idadeMetabolica = idadeMetabolica;
	}

	public float getCircunferenciaBraco() {
		return circunferenciaBraco;
	}

	public void setCircunferenciaBraco(float circunferenciaBraco) {
		this.circunferenciaBraco = circunferenciaBraco;
	}

	public float getCircunferenciaBracoContraido() {
		return circunferenciaBracoContraido;
	}

	public void setCircunferenciaBracoContraido(float circunferenciaBracoContraido) {
		this.circunferenciaBracoContraido = circunferenciaBracoContraido;
	}

	public float getCircunferenciaQuadril() {
		return circunferenciaQuadril;
	}

	public void setCircunferenciaQuadril(float circunferenciaQuadril) {
		this.circunferenciaQuadril = circunferenciaQuadril;
	}

	public float getCircunferenciaAbnominal() {
		return circunferenciaAbnominal;
	}

	public void setCircunferenciaAbnominal(float circunferenciaAbnominal) {
		this.circunferenciaAbnominal = circunferenciaAbnominal;
	}

	public float getCircunferenciaPerna() {
		return circunferenciaPerna;
	}

	public void setCircunferenciaPerna(float circunferenciaPerna) {
		this.circunferenciaPerna = circunferenciaPerna;
	}

	public float getCircunferenciaCoxa() {
		return circunferenciaCoxa;
	}

	public void setCircunferenciaCoxa(float circunferenciaCoxa) {
		this.circunferenciaCoxa = circunferenciaCoxa;
	}

	public float getCircunferenciaPeito() {
		return circunferenciaPeito;
	}

	public void setCircunferenciaPeito(float circunferenciaPeito) {
		this.circunferenciaPeito = circunferenciaPeito;
	}

	public float getCircunferenciaCintura() {
		return circunferenciaCintura;
	}

	public void setCircunferenciaCintura(float circunferenciaCintura) {
		this.circunferenciaCintura = circunferenciaCintura;
	}

	public float getCircunferenciaPanturrilha() {
		return circunferenciaPanturrilha;
	}

	public void setCircunferenciaPanturrilha(float circunferenciaPanturrilha) {
		this.circunferenciaPanturrilha = circunferenciaPanturrilha;
	}

	public Consulta(Long id, LocalDate dataConsulta, Paciente paciente, LocalDate proximaConsulta, float pesoHabitual,
			float pesoIdeal, float pesoIMC, float pesoAtual, float estatura, float porcentagemGordura,
			float porcentagemMassaMagra, float gorduraVisceral, int idadeMetabolica, float circunferenciaBraco,
			float circunferenciaBracoContraido, float circunferenciaQuadril, float circunferenciaAbnominal,
			float circunferenciaPerna, float circunferenciaCoxa, float circunferenciaPeito, float circunferenciaCintura,
			float circunferenciaPanturrilha) {
		super();
		this.id = id;
		this.dataConsulta = dataConsulta;
		this.paciente = paciente;
		this.proximaConsulta = proximaConsulta;
		this.pesoHabitual = pesoHabitual;
		this.pesoIdeal = pesoIdeal;
		this.pesoIMC = pesoIMC;
		this.pesoAtual = pesoAtual;
		this.estatura = estatura;
		this.porcentagemGordura = porcentagemGordura;
		this.porcentagemMassaMagra = porcentagemMassaMagra;
		this.gorduraVisceral = gorduraVisceral;
		this.idadeMetabolica = idadeMetabolica;
		this.circunferenciaBraco = circunferenciaBraco;
		this.circunferenciaBracoContraido = circunferenciaBracoContraido;
		this.circunferenciaQuadril = circunferenciaQuadril;
		this.circunferenciaAbnominal = circunferenciaAbnominal;
		this.circunferenciaPerna = circunferenciaPerna;
		this.circunferenciaCoxa = circunferenciaCoxa;
		this.circunferenciaPeito = circunferenciaPeito;
		this.circunferenciaCintura = circunferenciaCintura;
		this.circunferenciaPanturrilha = circunferenciaPanturrilha;
	}

	public Consulta(Long id, Paciente paciente, LocalDate dataConsulta, LocalDate proximaConsulta) {
		super();
		this.id = id;
		this.dataConsulta = dataConsulta;
		this.paciente = paciente;
		this.proximaConsulta = proximaConsulta;
	}

	public LocalDate adiciona45diasConsulta(LocalDate data) {
		return data.plusDays(45);
	}

}
