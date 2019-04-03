/**
 * 
 */
package com.br.cielo.extract.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author dpereira
 * @since  01/04/2019
 *
 */
public class TransactionControl implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String dataEfetivaLancamento;
	private String dataLancamentoContaCorrenteCliente;
	private Integer numeroEvento;
	private String descricaoGrupoPagamento;
	private String codigoIdentificadorUnico;
	private String nomeBanco;
	private Integer quantidadeLancamentoRemessa;
	private String numeroRaizCNPJ;
	private String numeroSufixoCNPJ;
	private BigDecimal valorLancamentoRemessa;
	private Long dateLancamentoContaCorrenteCliente;
	private Long dateEfetivaLancamento;
	
	public TransactionControl(){
		this.numeroEvento = 0;
		this.quantidadeLancamentoRemessa = 0;
		this.valorLancamentoRemessa = BigDecimal.ZERO;
		this.dateLancamentoContaCorrenteCliente = new Long("0");
		this.dateEfetivaLancamento = new Long("0");
	}
	
	/**
	 * @return the dataEfetivaLancamento
	 */
	public String getDataEfetivaLancamento() {
		return dataEfetivaLancamento;
	}
	/**
	 * @param dataEfetivaLancamento the dataEfetivaLancamento to set
	 */
	public void setDataEfetivaLancamento(String dataEfetivaLancamento) {
		this.dataEfetivaLancamento = dataEfetivaLancamento;
	}
	/**
	 * @return the dataLancamentoContaCorrenteCliente
	 */
	public String getDataLancamentoContaCorrenteCliente() {
		return dataLancamentoContaCorrenteCliente;
	}
	/**
	 * @param dataLancamentoContaCorrenteCliente the dataLancamentoContaCorrenteCliente to set
	 */
	public void setDataLancamentoContaCorrenteCliente(
			String dataLancamentoContaCorrenteCliente) {
		this.dataLancamentoContaCorrenteCliente = dataLancamentoContaCorrenteCliente;
	}
	/**
	 * @return the numeroEvento
	 */
	public Integer getNumeroEvento() {
		return numeroEvento;
	}
	/**
	 * @param numeroEvento the numeroEvento to set
	 */
	public void setNumeroEvento(Integer numeroEvento) {
		this.numeroEvento = numeroEvento;
	}
	/**
	 * @return the descricaoGrupoPagamento
	 */
	public String getDescricaoGrupoPagamento() {
		return descricaoGrupoPagamento;
	}
	/**
	 * @param descricaoGrupoPagamento the descricaoGrupoPagamento to set
	 */
	public void setDescricaoGrupoPagamento(String descricaoGrupoPagamento) {
		this.descricaoGrupoPagamento = descricaoGrupoPagamento;
	}
	/**
	 * @return the codigoIdentificadorUnico
	 */
	public String getCodigoIdentificadorUnico() {
		return codigoIdentificadorUnico;
	}
	/**
	 * @param codigoIdentificadorUnico the codigoIdentificadorUnico to set
	 */
	public void setCodigoIdentificadorUnico(String codigoIdentificadorUnico) {
		this.codigoIdentificadorUnico = codigoIdentificadorUnico;
	}
	/**
	 * @return the nomeBanco
	 */
	public String getNomeBanco() {
		return nomeBanco;
	}
	/**
	 * @param nomeBanco the nomeBanco to set
	 */
	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
	/**
	 * @return the quantidadeLancamentoRemessa
	 */
	public Integer getQuantidadeLancamentoRemessa() {
		return quantidadeLancamentoRemessa;
	}
	/**
	 * @param quantidadeLancamentoRemessa the quantidadeLancamentoRemessa to set
	 */
	public void setQuantidadeLancamentoRemessa(Integer quantidadeLancamentoRemessa) {
		this.quantidadeLancamentoRemessa = quantidadeLancamentoRemessa;
	}
	/**
	 * @return the numeroRaizCNPJ
	 */
	public String getNumeroRaizCNPJ() {
		return numeroRaizCNPJ;
	}
	/**
	 * @param numeroRaizCNPJ the numeroRaizCNPJ to set
	 */
	public void setNumeroRaizCNPJ(String numeroRaizCNPJ) {
		this.numeroRaizCNPJ = numeroRaizCNPJ;
	}
	/**
	 * @return the numeroSufixoCNPJ
	 */
	public String getNumeroSufixoCNPJ() {
		return numeroSufixoCNPJ;
	}
	/**
	 * @param numeroSufixoCNPJ the numeroSufixoCNPJ to set
	 */
	public void setNumeroSufixoCNPJ(String numeroSufixoCNPJ) {
		this.numeroSufixoCNPJ = numeroSufixoCNPJ;
	}
	/**
	 * @return the valorLancamentoRemessa
	 */
	public BigDecimal getValorLancamentoRemessa() {
		return valorLancamentoRemessa;
	}
	/**
	 * @param valorLancamentoRemessa the valorLancamentoRemessa to set
	 */
	public void setValorLancamentoRemessa(BigDecimal valorLancamentoRemessa) {
		this.valorLancamentoRemessa = valorLancamentoRemessa;
	}
	/**
	 * @return the dateLancamentoContaCorrenteCliente
	 */
	public Long getDateLancamentoContaCorrenteCliente() {
		return dateLancamentoContaCorrenteCliente;
	}
	/**
	 * @param dateLancamentoContaCorrenteCliente the dateLancamentoContaCorrenteCliente to set
	 */
	public void setDateLancamentoContaCorrenteCliente(
			Long dateLancamentoContaCorrenteCliente) {
		this.dateLancamentoContaCorrenteCliente = dateLancamentoContaCorrenteCliente;
	}
	/**
	 * @return the dateEfetivaLancamento
	 */
	public Long getDateEfetivaLancamento() {
		return dateEfetivaLancamento;
	}
	/**
	 * @param dateEfetivaLancamento the dateEfetivaLancamento to set
	 */
	public void setDateEfetivaLancamento(Long dateEfetivaLancamento) {
		this.dateEfetivaLancamento = dateEfetivaLancamento;
	}

	
}
