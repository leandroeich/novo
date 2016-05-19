package br.com.tble.novo.repository;

import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.tble.novo.entity.Livro;

@Named
public class LivroRepository {

	@PersistenceContext
	private EntityManager em;

	public List<Livro> findLivros() {
		return this.em.createQuery("SELECT l FROM Livro l", Livro.class).getResultList();
	}
	
}
