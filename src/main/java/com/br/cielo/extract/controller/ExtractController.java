/**
 * 
 */
package com.br.cielo.extract.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.cielo.extract.model.Extract;
import com.br.cielo.extract.response.ResponseError;
import com.br.cielo.extract.service.ExtractService;
import com.br.cielo.extract.serviceImpl.ExtractServiceImpl;

/**
 * @author dpereira
 * @since 01/04/2019 
 * Servico REST retornar as informações do extrato de todas as transações
 * 
 */

@RestController
@Api(value = "Extract")
public class ExtractController {

	private static final Logger logger = LogManager.getLogger(ExtractController.class);

	
	@ApiOperation(value = "Visualizar os extratos de todas as transações", response = Extract.class, notes = "Esta operação retorna o registro de todas as transações.")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Retorna todas as transações com sucesso", response = Extract.class),
			@ApiResponse(code = 500, message = "Caso haja algum erro interno será informado o codigo e a mensagem de erro", response = ResponseError.class),
			@ApiResponse(code = 404, message = "Caso haja algum erro interno será informado o codigo e a mensagem de erro", response = ResponseError.class)

	})
	
	@CrossOrigin(origins = "http://localhost")
	@GetMapping(value = "/extract", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Object> viewAllExtract() {
		ExtractService extracService = new ExtractServiceImpl();

		Extract extract = new Extract();
		ResponseError responseError = null;

		try {
			extract = extracService.viewExtract();

			if (null != extract) {
				return new ResponseEntity<Object>(extract, HttpStatus.OK);
			}

			responseError = new ResponseError(HttpStatus.NOT_FOUND.name(), HttpStatus.NOT_FOUND.value());
			return new ResponseEntity<Object>(responseError, HttpStatus.NOT_FOUND);

		} catch (FileNotFoundException e) {
			logger.error("Arquivo de massa de dados não encontrado", e);

			responseError = new ResponseError(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value());
			return new ResponseEntity<Object>(responseError, HttpStatus.INTERNAL_SERVER_ERROR);
		} catch (IOException e) {
			logger.error("Erro ao ler os dados do arquivo", e);
			responseError = new ResponseError(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value());
			return new ResponseEntity<Object>(responseError, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	
}
