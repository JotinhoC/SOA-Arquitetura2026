package br.gov.sp.cps.alunos_soap.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import br.gov.sp.cps.alunos_soap.model.ConsultarAlunoRequest;
import br.gov.sp.cps.alunos_soap.model.ConsultarAlunoResponse;

@Endpoint
public class AlunoEndpoint {
	private static final String NAMESPACE = "http://cps.sp.gov.br/alunos";
	
	@PayloadRoot( namespace = NAMESPACE, localPart = "consultarAlunoRequest" )
	@ResponsePayload
	public ConsultarAlunoResponse consultarAluno( @RequestPayload ConsultarAlunoRequest request) {
		ConsultarAlunoResponse response = new ConsultarAlunoResponse();
		
		if (request.getRa() == 123) {
			response.setNome("Maria Silva");
			response.setCurso("Sistemas para Internet");
		} else {
			response.setNome("Aluno não Encontrado");
			response.setCurso("-");
		}
		
		return response;
	}
}
