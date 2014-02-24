package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Pessoa implements Cloneable, Comparable<Pessoa>, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8023909735069877938L;
	@Id
	@GeneratedValue
	private Integer id;
	@Column(name="nome")
	private String nome;
	@Column(name="endereco")
	private String endereco;
	@Column(name="telefone")
	private String telefone;
	
	public Pessoa(String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public Pessoa() {
	
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
	@Override
	public int compareTo(Pessoa o) {
		return this.nome.compareTo(o.getNome()); 
	}
	
	

}
