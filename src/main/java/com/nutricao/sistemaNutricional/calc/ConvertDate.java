package com.nutricao.sistemaNutricional.calc;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class ConvertDate {

	public String proximaConsulta(String dataParm) {
		DateTimeFormatter dataBanco = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate dataConvertida = LocalDate.parse(dataParm,dataBanco);
		
		//adicionando 30 dias
		return dataConvertida.plusDays(30).format(dataFormatada);
	}

}