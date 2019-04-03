/**
 * 
 */
package com.br.cielo.extract.response;

import java.io.Serializable;

/**
 * @author dpereira
 * Objeto responsavel por retornar erros no servico rest
 *
 */

public class ResponseError implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private String message;
	private int code;
	
	public ResponseError(String message, int code){
		this.message = message;
		this.code = code;
	}
	
	
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}
	
	
}
