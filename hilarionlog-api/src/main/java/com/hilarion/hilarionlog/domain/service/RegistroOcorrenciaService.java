package com.hilarion.hilarionlog.domain.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.hilarion.hilarionlog.domain.model.Entrega;
import com.hilarion.hilarionlog.domain.model.Ocorrencia;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class RegistroOcorrenciaService {

	private BuscaEntregaService buscaEntregaService;
	
	@Transactional
	public Ocorrencia registrar(Long entregaId, String descricao) {
		Entrega entrega = buscaEntregaService.buscar(entregaId);
		
		return entrega.adicionarOcorrencia(descricao);
		
	}
	
}
