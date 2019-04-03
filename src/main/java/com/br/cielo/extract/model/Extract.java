/**
 * 
 */
package com.br.cielo.extract.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * @author dpereira
 * @since 01/04/2019
 * Objeto para receber os atributos da massa de dados do JSON
 *
 */

public class Extract implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private TransactionControlTotal totalControleLancamento;
	 private List<TransactionAccount> listaControleLancamento; 
	 private Integer indice;
	 private Integer tamanhoPagina;
	 private Integer totalElements;
	 
	 public Extract(){
		 this.totalControleLancamento = new TransactionControlTotal();
		 this.listaControleLancamento = new ArrayList<TransactionAccount>();
		 this.indice = 0;
		 this.tamanhoPagina = 0;
		 this.totalElements = 0;
	 }

	/**
	 * @return the totalControleLancamento
	 */
	public TransactionControlTotal getTotalControleLancamento() {
		return totalControleLancamento;
	}

	/**
	 * @param totalControleLancamento the totalControleLancamento to set
	 */
	public void setTotalControleLancamento(TransactionControlTotal totalControleLancamento) {
		this.totalControleLancamento = totalControleLancamento;
	}


	/**
	 * @return the listaControleLancamento
	 */
	public List<TransactionAccount> getListaControleLancamento() {
		return listaControleLancamento;
	}


	/**
	 * @param listaControleLancamento the listaControleLancamento to set
	 */
	public void setListaControleLancamento(List<TransactionAccount> listaControleLancamento) {
		this.listaControleLancamento = listaControleLancamento;
	}


	/**
	 * @return the indice
	 */
	public Integer getIndice() {
		return indice;
	}


	/**
	 * @param indice the indice to set
	 */
	public void setIndice(Integer indice) {
		this.indice = indice;
	}


	/**
	 * @return the tamanhoPagina
	 */
	public Integer getTamanhoPagina() {
		return tamanhoPagina;
	}


	/**
	 * @param tamanhoPagina the tamanhoPagina to set
	 */
	public void setTamanhoPagina(Integer tamanhoPagina) {
		this.tamanhoPagina = tamanhoPagina;
	}


	/**
	 * @return the totalElements
	 */
	public Integer getTotalElements() {
		return totalElements;
	}


	/**
	 * @param totalElements the totalElements to set
	 */
	public void setTotalElements(Integer totalElements) {
		this.totalElements = totalElements;
	}
	 
	 
}
