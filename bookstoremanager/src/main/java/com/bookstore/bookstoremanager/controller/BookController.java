package com.bookstore.bookstoremanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

	@GetMapping
	@ApiOperation(value = "Retorna dados sobre o pagamento")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success mehod return"), @ApiResponse(code = 404, message = "nenhum olá encontrado")
	})
	public String pagamento() {
		
		return "Realizando pagamento";
	}
}
