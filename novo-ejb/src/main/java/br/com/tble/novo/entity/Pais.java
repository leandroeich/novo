package br.com.tble.novo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.tble.commons.entity.AbstractCrudEntity;
import br.com.tble.commons.validation.NotEmpty;

@Entity
@Table(name = "BLK_PAIS")
@SequenceGenerator(name = "BLK_PAIS_SEQ", sequenceName = "BLK_PAIS_SEQ", allocationSize = 1)
public class Pais extends AbstractCrudEntity {

	private static final long serialVersionUID = -1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BLK_PAIS_SEQ")
	@Column(name = "CD_PAIS")
	private Long id;

	@Column(name = "NM_PAIS")
	private String nome;

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
		Pais other = (Pais) obj;
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