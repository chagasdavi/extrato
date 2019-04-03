/**
 * 
 */
package com.br.cielo.extract.serviceImpl;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.stereotype.Service;

import com.br.cielo.extract.model.Extract;
import com.br.cielo.extract.repository.ExtractRepository;
import com.br.cielo.extract.repositoryImpl.ExtractRepositoryImpl;
import com.br.cielo.extract.service.ExtractService;

/**
 * @author dpereira
 * @since  01/04/2019
 *
 */
@Service
public class ExtractServiceImpl implements ExtractService {
	
	//@inject
	private ExtractRepository extractRepository;

	@Override
	public Extract viewExtract() throws FileNotFoundException, IOException {
		extractRepository = new ExtractRepositoryImpl();
		return extractRepository.viewExtract();
	}
}
