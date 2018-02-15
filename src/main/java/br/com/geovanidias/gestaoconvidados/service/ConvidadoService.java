package br.com.geovanidias.gestaoconvidados.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.geovanidias.gestaoconvidados.model.Convidado;
import br.com.geovanidias.gestaoconvidados.repository.Convidados;

@Service
public class ConvidadoService {
	
	@Autowired
	private Convidados convidados;
	
	@Transactional
	public Convidado adicionar(Convidado convidado) {
		//Adiciona as regras de negócio
		
		return convidados.saveAndFlush(convidado);
	}
	
}
