/**
 * 
 */
package com.br.cielo.extract.model;

import java.io.Serializable;

/**
 * @author dpereira
 * @since 01/04/2019
 */
public class TransactionControlTotal implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer quantidadeLancamentos;
	private Integer quantidadeRemessas;
	private Double valorLancamentos;
	
	public TransactionControlTotal(){
		this.quantidadeLancamentos = 0;
		this.quantidadeRemessas = 0;
		this.valorLancamentos = 0.0;
	}
	
	public Integer getQuantidadeLancamentos() {
		return quantidadeLancamentos;
	}
	public void setQuantidadeLancamentos(Integer quantidadeLancamentos) {
		this.quantidadeLancamentos = quantidadeLancamentos;
	}
	public Integer getQuantidadeRemessas() {
		return quantidadeRemessas;
	}
	public void setQuantidadeRemessas(Integer quantidadeRemessas) {
		this.quantidadeRemessas = quantidadeRemessas;
	}
	public Double getValorLancamentos() {
		return valorLancamentos;
	}
	public void setValorLancamentos(Double valorLancamentos) {
		this.valorLancamentos = valorLancamentos;
	}
}