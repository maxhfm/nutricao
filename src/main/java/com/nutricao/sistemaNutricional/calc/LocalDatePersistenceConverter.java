package com.nutricao.sistemaNutricional.calc;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class LocalDatePersistenceConverter implements AttributeConverter<LocalDate, Date> {

	@Override
    public java.sql.Date convertToDatabaseColumn(LocalDate localDate) {
        return java.sql.Date.valueOf(localDate);
    }

    //public LocalDate convertToEntityAttribute(java.sql.Date databaseValue) {
     //   return databaseValue.toLocalDate();
    //}

	@Override
	public LocalDate convertToEntityAttribute(Date date) {
		// TODO Auto-generated method stub
		return ((java.sql.Date) date).toLocalDate();
	}
	
	@SuppressWarnings("deprecation")
	public static Date valueOf(LocalDate date) {
		return new Date(date.getYear() - 1900, date.getMonthValue() - 1, date.getDayOfMonth());
	}
	
	
	
}