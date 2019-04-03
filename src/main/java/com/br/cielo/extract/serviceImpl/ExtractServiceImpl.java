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
	
	/*private ExtractDTO viewExtract(Extract extract){
		ExtractDTO extractDTO = new ExtractDTO();
		extractDTO.setIndice(extract.getIndice());
		extractDTO.setTamanhoPagina(extract.getTamanhoPagina());
		extractDTO.setTotalControleLancamento(extract.getTotalControleLancamento());
		extractDTO.setTotalElements(extract.getTotalElements());
		
		
		for (TransactionAccount rs : extract.getListaControleLancamento()) {
			TransactionAccountDTO transactionAccountDTO = new TransactionAccountDTO();
			transactionAccountDTO.setDataEfetivaLancamento(UtilDateFormat.covertStringToDate(rs.getDataEfetivaLancamento()));
			transactionAccountDTO.setDataLancamentoContaCorrenteCliente(UtilDateFormat.covertStringToDate(rs.getDataLancamentoContaCorrenteCliente()));
			transactionAccountDTO.setCodigoIdentificadorUnico(rs.getCodigoIdentificadorUnico());
			transactionAccountDTO.setDateEfetivaLancamento(rs.getDateEfetivaLancamento());
			transactionAccountDTO.setDateLancamentoContaCorrenteCliente(rs.getDateLancamentoContaCorrenteCliente());
			transactionAccountDTO.setDescricaoGrupoPagamento(rs.getDescricaoGrupoPagamento());
			transactionAccountDTO.setLancamentoContaCorrenteCliente(rs.getLancamentoContaCorrenteCliente());
			transactionAccountDTO.setNomeBanco(rs.getNomeBanco());
			transactionAccountDTO.setNumeroEvento(rs.getNumeroEvento());
			transactionAccountDTO.setNumeroRaizCNPJ(rs.getNumeroRaizCNPJ());
			transactionAccountDTO.setNumeroSufixoCNPJ(rs.getNumeroSufixoCNPJ());
			transactionAccountDTO.setQuantidadeLancamentoRemessa(rs.getQuantidadeLancamentoRemessa());
			transactionAccountDTO.setValorLancamentoRemessa(rs.getValorLancamentoRemessa());
			extractDTO.getListaControleLancamento().add(transactionAccountDTO);
			
		}
		
		return extractDTO;
	}*/

}
