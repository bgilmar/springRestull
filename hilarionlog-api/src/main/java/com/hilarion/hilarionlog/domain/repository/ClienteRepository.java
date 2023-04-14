package com.hilarion.hilarionlog.domain.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hilarion.hilarionlog.domain.model.Cliente;

//@Repository // No JavaSE-17 não precisa mais desta anotação
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	List<Cliente> findByNome(String nome);
	List<Cliente> findByNomeContaining(String nome);
	Optional<Cliente> findByEmail(String email);
	
}
