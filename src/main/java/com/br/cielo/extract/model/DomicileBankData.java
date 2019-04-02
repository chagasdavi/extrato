/**
 * 
 */
package com.br.cielo.extract.model;

import java.io.Serializable;


/**
 * @author dpereira
 * @since  01/04/2019
 */
public class DomicileBankData implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer codigoBanco;
	private Integer numeroAgencia;
	private String numeroContaCorrente;
	
	public DomicileBankData(){
		this.codigoBanco = 0;
		this.numeroAgencia = 0;
		this.numeroContaCorrente = "";
	}
	
	/**
	 * @return the codigoBanco
	 */
	public Integer getCodigoBanco() {
		return codigoBanco;
	}
	/**
	 * @param codigoBanco the codigoBanco to set
	 */
	public void setCodigoBanco(Integer codigoBanco) {
		this.codigoBanco = codigoBanco;
	}
	/**
	 * @return the numeroAgencia
	 */
	public Integer getNumeroAgencia() {
		return numeroAgencia;
	}
	/**
	 * @param numeroAgencia the numeroAgencia to set
	 */
	public void setNumeroAgencia(Integer numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	/**
	 * @return the numeroContaCorrente
	 */
	public String getNumeroContaCorrente() {
		return numeroContaCorrente;
	}
	/**
	 * @param numeroContaCorrente the numeroContaCorrente to set
	 */
	public void setNumeroContaCorrente(String numeroContaCorrente) {
		this.numeroContaCorrente = numeroContaCorrente;
	}
}
