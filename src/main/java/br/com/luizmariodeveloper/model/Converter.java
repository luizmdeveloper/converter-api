package br.com.luizmariodeveloper.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="tb_conversao")
public class Converter {
	
	private Long codigo;
	private BigDecimal celsius;	
	private BigDecimal farehint;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	public Long getCodigo() {
		return codigo;
	}
	
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	
	@NotNull
	public BigDecimal getCelsius() {
		return celsius;
	}
	
	public void setCelsius(BigDecimal celsius) {
		this.celsius = celsius;
	}
	
	@NotNull
	public BigDecimal getFarehint() {
		return farehint;
	}
	
	public void setFarehint(BigDecimal farehint) {
		this.farehint = farehint;
	}
}
