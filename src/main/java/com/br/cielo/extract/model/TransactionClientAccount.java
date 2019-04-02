/**
 * 
 */
package com.br.cielo.extract.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * @author dpereira
 * @since  01/04/2019
 *
 */
public class TransactionClientAccount implements Serializable{

	private static final long serialVersionUID = 1L;
	private BigInteger numeroRemessaBanco;
	private String nomeSituacaoRemessa;
	private DomicileBankData dadosDomicilioBancario;
	private String nomeTipoOperacao;
	private List<Object> dadosAnaliticoLancamentoFinanceiroCliente;

	public TransactionClientAccount() {
		this.numeroRemessaBanco = BigInteger.ZERO;
		this.dadosDomicilioBancario = new DomicileBankData();
		this.dadosAnaliticoLancamentoFinanceiroCliente = new ArrayList<Object>();
	}

	/**
	 * @return the numeroRemessaBanco
	 */
	public BigInteger getNumeroRemessaBanco() {
		return numeroRemessaBanco;
	}

	/**
	 * @param numeroRemessaBanco
	 *            the numeroRemessaBanco to set
	 */
	public void setNumeroRemessaBanco(BigInteger numeroRemessaBanco) {
		this.numeroRemessaBanco = numeroRemessaBanco;
	}

	/**
	 * @return the nomeSituacaoRemessa
	 */
	public String getNomeSituacaoRemessa() {
		return nomeSituacaoRemessa;
	}

	/**
	 * @param nomeSituacaoRemessa
	 *            the nomeSituacaoRemessa to set
	 */
	public void setNomeSituacaoRemessa(String nomeSituacaoRemessa) {
		this.nomeSituacaoRemessa = nomeSituacaoRemessa;
	}

	/**
	 * @return the dadosDomicilioBancario
	 */
	public DomicileBankData getDadosDomicilioBancario() {
		return dadosDomicilioBancario;
	}

	/**
	 * @param dadosDomicilioBancario
	 *            the dadosDomicilioBancario to set
	 */
	public void setDadosDomicilioBancario(
			DomicileBankData dadosDomicilioBancario) {
		this.dadosDomicilioBancario = dadosDomicilioBancario;
	}

	/**
	 * @return the nomeTipoOperacao
	 */
	public String getNomeTipoOperacao() {
		return nomeTipoOperacao;
	}

	/**
	 * @param nomeTipoOperacao
	 *            the nomeTipoOperacao to set
	 */
	public void setNomeTipoOperacao(String nomeTipoOperacao) {
		this.nomeTipoOperacao = nomeTipoOperacao;
	}

	/**
	 * @return the dadosAnaliticoLancamentoFinanceiroCliente
	 */
	public List<Object> getDadosAnaliticoLancamentoFinanceiroCliente() {
		return dadosAnaliticoLancamentoFinanceiroCliente;
	}

	/**
	 * @param dadosAnaliticoLancamentoFinanceiroCliente the dadosAnaliticoLancamentoFinanceiroCliente to set
	 */
	public void setDadosAnaliticoLancamentoFinanceiroCliente(
			List<Object> dadosAnaliticoLancamentoFinanceiroCliente) {
		this.dadosAnaliticoLancamentoFinanceiroCliente = dadosAnaliticoLancamentoFinanceiroCliente;
	}

}
