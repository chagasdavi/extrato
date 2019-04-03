/**
 * 
 */
package com.br.cielo.extract.repositoryImpl;

import java.io.BufferedReader;
import java.io.IOException;

import com.br.cielo.extract.model.Extract;
import com.br.cielo.extract.repository.ExtractRepository;
import com.google.gson.Gson;

/**
 * @author dpereira implementação da interface do repositorio(simulando a origem
 *         da massa no banco de dados) de Extract
 *
 */
public class ExtractRepositoryImpl implements ExtractRepository {
	
	public Extract viewExtract() throws IOException {
		Gson gson = null;

		java.io.FileReader fr = new java.io.FileReader(ExtractRepository.SELECT_EXTRACT_PATH_FILE);
		java.io.BufferedReader br = new BufferedReader(fr);
		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = br.readLine()) != null) {
			sb = sb.append(line);
		}

		br.close();
		fr.close();

		gson = new Gson();

		/**
		 * Obtem a massa de dados do arquivo(JSON) para o objeto Extract
		 */
		Extract extract = gson.fromJson(sb.toString().trim(), Extract.class);
		
		return extract;

	}

}
