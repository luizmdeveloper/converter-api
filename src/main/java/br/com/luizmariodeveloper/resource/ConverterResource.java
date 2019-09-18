package br.com.luizmariodeveloper.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.luizmariodeveloper.model.Converter;
import br.com.luizmariodeveloper.repository.ConverterRepository;
import br.com.luizmariodeveloper.service.ConverterService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/converter")
@Api(value="converter API REST")
@CrossOrigin(origins = "*")
public class ConverterResource {
	
	@Autowired
	private ConverterService converterService;
	
	@Autowired
	private ConverterRepository converterRepository;
	
	@GetMapping
	@ApiOperation(value="Lista as conversões realizada")
	public ResponseEntity<List<Converter>> findAll(){
		return ResponseEntity.ok().body(converterRepository.findAll());
	}
	
	
	@GetMapping("/{celsius}")
	@ApiOperation(value="Convete graus celsius e converter para farehint")
	public ResponseEntity<Converter> converterCelsiusToFarehint(@PathVariable String celsius){
		return ResponseEntity.ok().body(converterService.converterCelsiusParaFahrenheit(celsius));
	}
	
	@GetMapping(value = "/{fahrenheit}", params = "fahrenheit")
	@ApiOperation(value="Converte farehint para graus celsius")
	public ResponseEntity<Converter> converterFarehintToCelsius(@PathVariable String fahrenheit){
		return ResponseEntity.ok().body(converterService.converterFahrenheitPraCelsius(fahrenheit));
	}
}
