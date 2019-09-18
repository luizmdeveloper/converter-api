package br.com.luizmariodeveloper.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.luizmariodeveloper.model.Converter;
import br.com.luizmariodeveloper.repository.ConverterRepository;

@Service
public class ConverterService {

	@Autowired
	private ConverterRepository converterRepository;
	
	public Converter converterCelsiusParaFahrenheit(String celsius) {
		double valorCelsius = Double.parseDouble(celsius.replaceAll(",", "."));
		double valorFarehint = (valorCelsius * 1.8) + 32;
		
		return salvar(valorCelsius, valorFarehint);
	}
	
	public Converter converterFahrenheitPraCelsius(String fahrenheit) {
		double valorFarehint = Double.parseDouble(fahrenheit.replaceAll(",", ".")); 
		double valorCelsius = (valorFarehint -32) * 5/9;
		
		return salvar(valorCelsius, valorFarehint);
	}
	

	private Converter salvar(double valorCelsius, double valorFarehint) {
		Converter converter = new Converter();
		converter.setCelsius(new BigDecimal(valorCelsius));
		converter.setFarehint(new BigDecimal(valorFarehint));
		return converterRepository.save(converter);
	}
}