package br.com.tble.novo.service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.tble.novo.entity.Livro;
import br.com.tble.novo.repository.LivroRepository;

/**
 * Session Bean implementation class LivroService
 */
@Stateless
@LocalBean
public class LivroService {

	@Inject
	private LivroRepository repository;
	

	public List<Livro> findLivros(){
		return this.repository.findLivros();
	}
	
}
