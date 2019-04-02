/**
 * 
 */
package com.br.cielo.extract.repository;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.br.cielo.extract.model.Extract;

/**
 * @author dpereira
 * Interface padrão para o repositório de Extract
 * @since 01/04/2019
 *
 */
public interface ExtractRepository {
	
	/**
	 * {@code Select} retorna dados de extrato da massa de dados no arquivo
	 */
	String SELECT_EXTRACT_PATH_FILE = "lancamento-conta-legado.json";
	
	/**
	 * Visualizar extratos
	 * @return Extract object
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	Extract viewExtract() throws FileNotFoundException, IOException;
}
