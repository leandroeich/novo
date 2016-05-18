package br.com.tble.novo.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import br.com.tble.api.entity.Empregado;
import br.com.tble.api.service.EmpregadoService;

@LocalBean
@Stateless
public class NovoService {

	@EJB(lookup = "java:global/tble-api-ear/tble-api-ejb/EmpregadoServiceBean")
	private EmpregadoService service;
	
	public List<Empregado> teste(){
		return this.service.findByNome("NAZARE", true);
	}
}
