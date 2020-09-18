package br.com.portalcontrolehoras.beans;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.sql.Date;

@Entity
@Table(name="tb_ocorrencia")
public class Ocorrencia {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int num_seq;
	
	private int id_usuario;
	private int id_atividade;
	@Column(name="descricao")
	private String descricao;
	@Column(name="data")
	private Date data;
	@Column(name="hora")
	private Time hora;
	@Column(name="ponto_manual")
	private int ponto_manual;
	@Column(name="status")
	private int status;
	
		
	public Ocorrencia() {
		super();
		
	}
	
	public Ocorrencia(int num_seq, int id_usuario, int id_atividade, String descricao, Date data, Time hora,
			int ponto_manual, int status) {
		super();
		this.num_seq = num_seq;
		this.id_usuario = id_usuario;
		this.id_atividade = id_atividade;
		this.descricao = descricao;
		this.data = data;
		this.hora = hora;
		this.ponto_manual = ponto_manual;
		this.status = status;
	}
	public int getNum_seq() {
		return num_seq;
	}
	public void setNum_seq(int num_seq) {
		this.num_seq = num_seq;
	}
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	public int getId_atividade() {
		return id_atividade;
	}
	public void setId_atividade(int id_atividade) {
		this.id_atividade = id_atividade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Time getHora() {
		return hora;
	}
	public void setHora(Time hora) {
		this.hora = hora;
	}
	public int getPonto_manual() {
		return ponto_manual;
	}
	public void setPonto_manual(int ponto_manual) {
		this.ponto_manual = ponto_manual;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
}
