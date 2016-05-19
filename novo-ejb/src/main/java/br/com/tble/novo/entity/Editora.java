package br.com.tble.novo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.tble.commons.entity.AbstractCrudEntity;
import br.com.tble.commons.validation.NotEmpty;

@Entity
@Table(name = "BLK_EDITORA")
@SequenceGenerator(name = "BLK_EDITORA_SEQ", sequenceName = "BLK_EDITORA_SEQ", allocationSize = 1)
public class Editora extends AbstractCrudEntity {

	private static final long serialVersionUID = -1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BLK_EDITORA_SEQ")
	@Column(name = "CD_EDITORA")
	private Long id;

	@Column(name = "NM_EDITORA")
	private String nome;

	@ManyToOne
	@JoinColumn(name= "CD_PAIS")
	private Pais pais;

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_CADASTRO")
	private Date dataCadastro;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Editora other = (Editora) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return nome;
	}

}