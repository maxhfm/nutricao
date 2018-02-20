package com.nutricao.sistemaNutricional.converter;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class ConvertDateLocalDate {

	/**
	 * Converte LocalDate para Date
	 *
	 * @param datePicker
	 * @return date
	 * 
	 *         public static Date toDate(DatePicker datePicker) {
	 *         if(datePicker.getValue() == null){ return null; } LocalDate ld =
	 *         datePicker.getValue(); Instant instant =
	 *         ld.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant(); Date
	 *         date = Date.from(instant);
	 * 
	 *         return date; }
	 * 
	 *         /** Converte Date para LocalDate
	 *
	 * @param d
	 * @return LocalDate
	 */

	public java.sql.Date asDate(LocalDate localDate) {
		Date data = Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
		java.sql.Date dataSql = new java.sql.Date(data.getTime());
		return dataSql;
	}

	public LocalDate toLocalDate(Date d) {
		Instant instant = Instant.ofEpochMilli(d.getTime());
		LocalDate localDate = LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).toLocalDate();
		return localDate;
	}

}
