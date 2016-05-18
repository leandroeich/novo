package br.com.tble.teste.web.mbean;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.tble.api.entity.Empregado;
import br.com.tble.novo.service.NovoService;

@ManagedBean
@ViewScoped
public class TesteMBean {

	
	@EJB
	private NovoService novoService;
	
	public String getNome(){
		
		List<Empregado> teste = this.novoService.teste();
		
		System.out.println(teste.get(0).getNome());
		
		return "teste";
	}
}
