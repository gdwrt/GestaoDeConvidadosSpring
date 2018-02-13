package br.com.geovanidias.gestaoconvidados.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.geovanidias.gestaoconvidados.model.Convidado;
import br.com.geovanidias.gestaoconvidados.repository.Convidados;
import br.com.geovanidias.gestaoconvidados.service.ConvidadoService;


@Controller //Informa que essa classe será o nosso controller
@RequestMapping("/convidados")
public class ConvidadoController {
	
	@Autowired //Injeta repositório
	private Convidados convidados;
	
	@Autowired //Injeta service
	private ConvidadoService convidadoService;
	
	// Acessando essa url no browser localhost.../convidados/listaconvidados
	@RequestMapping("/listaconvidados")
	public ModelAndView listar() {
		
		ModelAndView mv = new ModelAndView("ListaConvidados");
		//lista todos os convidados e envia para view
		mv.addObject("convidados", convidados.findAll());
		// cria um novo convidado para ser usado na view pelo thymeleaf
		mv.addObject(new Convidado());
		
		// Retorna uma view e uma model
		return mv;
	}
	@RequestMapping(method = RequestMethod.POST)
	public String adicionar(Convidado convidado) {
		//adiciona o convidado no banco de dados
		convidadoService.adicionar(convidado);
		// rediciona para a view listaconvidados
		return "redirect:/convidados/listaconvidados";
	}
}
