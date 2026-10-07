package br.gov.sp.cps.projeto_soap.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import br.gov.sp.cps.projeto_soap.model.ConsultarProdutoRequest;
import br.gov.sp.cps.projeto_soap.model.ConsultarProdutoResponse;

@Endpoint
public class ProdutoEndpoint {
	private static final String NAMESPACE = "http://cps.sp.gov.br/produtos";
	
	@PayloadRoot( namespace = NAMESPACE, localPart = "consultarProdutoRequest" )
	@ResponsePayload
	public ConsultarProdutoResponse consultarAluno( @RequestPayload ConsultarProdutoRequest request) {
		ConsultarProdutoResponse response = new ConsultarProdutoResponse();
		
		if (request.getRa() == 1) {
			response.setNome("Samsung S21");
			response.setDescricao("Smartphone");
			response.setMarca("Samsung");
			response.setEstoque(23);
		} else {
			response.setNome("Produto não Encontrado");
			response.setDescricao("-");
			response.setMarca("-");
			response.setEstoque(0);
		}
		
		return response;
	}
}
