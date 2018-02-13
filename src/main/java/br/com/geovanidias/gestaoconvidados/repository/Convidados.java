package br.com.geovanidias.gestaoconvidados.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.geovanidias.gestaoconvidados.model.Convidado;

@Repository
public interface Convidados extends JpaRepository<Convidado, Long> {
	
}
