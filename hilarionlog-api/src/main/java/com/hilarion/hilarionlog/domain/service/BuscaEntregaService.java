package com.hilarion.hilarionlog.domain.service;

import org.springframework.stereotype.Service;

import com.hilarion.hilarionlog.domain.exception.EntidadeNaoEncontradaException;
import com.hilarion.hilarionlog.domain.model.Entrega;
import com.hilarion.hilarionlog.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BuscaEntregaService {

	EntregaRepository entregaRepository;
	
	public Entrega buscar(Long entregaId) {
		return entregaRepository.findById(entregaId)
				.orElseThrow(() -> new EntidadeNaoEncontradaException("Entrega não encontrada"));
	}
	
}
