package br.com.tble.novo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.tble.commons.entity.AbstractCrudEntity;
import br.com.tble.commons.validation.NotEmpty;

@Entity
@Table(name = "BLK_LIVRO")
@NamedQueries({
		@NamedQuery(name = "Livro.findAll", query = "SELECT tC FROM Livro tc ORDER BY tc.nome "),
		@NamedQuery(name = "Livro.findAllWithNomeAndTitulo", query = "SELECT tc FROM Livro tc WHERE tc.nome LIKE :nome AND tc.titulo LIKE :titulo ORDER BY tc.nome ") })
@SequenceGenerator(name = "BLK_LIVRO_SEQ", sequenceName = "BLK_LIVRO_SEQ", allocationSize = 1)
public class Livro extends AbstractCrudEntity {

	private static final long serialVersionUID = -7466289523091330658L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BLK_LIVRO_SEQ")
	@Column(name = "CD_LIVRO")
	private Long id;

	@Column(name = "NM_LIVRO")
	private String nome;

	@Column(name = "DS_TITULO")
	private String titulo;

	@Column(name = "NR_IDADE")
	private Integer idade = 1;

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_IMPRESSAO")
	private Date dataImpressao;

	@Column(name = "VL_LIVRO")
	private Double valor;
	
	@ManyToOne
	@JoinColumn(name= "CD_EDITORA")
	private Editora editora;

	public Livro() {
	}

	public Livro(Long id, String nome, String titulo, Integer idade) {
		this.id = id;
		this.nome = nome;
		this.titulo = titulo;
		this.idade = idade;
	}

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

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = 1;
	}

	public Date getDataImpressao() {
		return dataImpressao;
	}

	public void setDataImpressao(Date dataImpressao) {
		this.dataImpressao = dataImpressao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
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
		Livro other = (Livro) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Livro [id=" + id + ", nome=" + nome + ", titulo=" + titulo + ", idade=" + idade + ", dataImpressao=" + dataImpressao + ", valor=" + valor + "]";
	}

}
