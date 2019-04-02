/**
 * 
 */
package com.br.cielo.extract.service;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.br.cielo.extract.model.Extract;

/**
 * @author dpereira
 * @since  01/04/2019
 * Serviço de extrato
 *
 */
public interface ExtractService {
	
	/**
	 * Visualizar extratos
	 * @return Extract object
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	Extract viewExtract() throws FileNotFoundException, IOException;
}
