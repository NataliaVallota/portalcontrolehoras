package br.com.itau.portalcontrolehoras.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="itmn232_atividade")
public class Atividade {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_atividade;
	@Column(name="nome_atividade", length=100)
	private String nome_atividade;
	
	public Atividade() {
		super();		
	}
	
	public Atividade(int id_atividade, String nome_atividade) {
		super();
		this.id_atividade = id_atividade;
		this.nome_atividade = nome_atividade;
	}
	
	public int getId_atividade() {
		return id_atividade;
	}
	public void setId_atividade(int id_atividade) {
		this.id_atividade = id_atividade;
	}
	public String getNome_atividade() {
		return nome_atividade;
	}
	public void setNome_atividade(String nome_atividade) {
		this.nome_atividade = nome_atividade;
	}
	
	
}
