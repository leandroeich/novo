package br.com.tble.teste.web.mbean;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.tble.api.entity.Empregado;
import br.com.tble.novo.entity.Livro;
import br.com.tble.novo.service.LivroService;
import br.com.tble.novo.service.NovoService;

@ManagedBean
@ViewScoped
public class TesteMBean {

	
	@EJB
	private NovoService novoService;
	
	@EJB
	private LivroService livroService;
	
	public String getNome(){
		
		List<Empregado> teste = this.novoService.teste();
		
		List<Livro> findLivros = this.livroService.findLivros();
		
		System.out.println(findLivros.get(0).getNome());
		System.out.println(teste.get(0).getNome());
		
		return "teste";
	}
}
