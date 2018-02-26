package com.nutricao.sistemaNutricional.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Antropometria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private Paciente paciente;
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

	public Antropometria() {
		super();
	}

	public Antropometria(Paciente paciente, float pesoHabitual, float pesoIdeal, float pesoIMC, float pesoAtual,
			float estatura, float porcentagemGordura, float porcentagemMassaMagra, float gorduraVisceral,
			int idadeMetabolica, float circunferenciaBraco, float circunferenciaBracoContraido,
			float circunferenciaQuadril, float circunferenciaAbnominal, float circunferenciaPerna,
			float circunferenciaCoxa, float circunferenciaPeito, float circunferenciaCintura,
			float circunferenciaPanturrilha) {
		super();
		this.paciente = paciente;
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

	public Antropometria(Long id, Paciente paciente, float pesoHabitual, float pesoIdeal, float pesoIMC,
			float pesoAtual, float estatura, float porcentagemGordura, float porcentagemMassaMagra,
			float gorduraVisceral, int idadeMetabolica, float circunferenciaBraco, float circunferenciaBracoContraido,
			float circunferenciaQuadril, float circunferenciaAbnominal, float circunferenciaPerna,
			float circunferenciaCoxa, float circunferenciaPeito, float circunferenciaCintura,
			float circunferenciaPanturrilha) {
		super();
		this.id = id;
		this.paciente = paciente;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public float calcularPesoIdeal(String sexo, Float estatura) {
		float pesoIdeal = 0;
		if (sexo.equals("F"))
			pesoIdeal = ((estatura * estatura) * (float) 20.8);

		if (sexo.equals("M"))
			pesoIdeal = ((estatura * estatura) * (float) 22);

		return pesoIdeal;
	}

	public float calcularImc(float peso, float estatura) {
		float imc = (peso / (estatura * estatura));
		return imc;
	}

}
