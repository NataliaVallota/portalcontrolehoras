package br.com.itau.portalcontrolehoras.beans;


import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="itmn232_ocorrencia")
public class Ocorrencia {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int num_seq;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "itmn232_usuario", referencedColumnName = "id_usuario")
	private Usuario usuario;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "itmn232_atividade", referencedColumnName = "id_atividade")
	private Atividade atividade;
	
	@Column(name="descricao")
	private String descricao;
	@Column(name="data")
	private LocalDate data;
	@Column(name="hora")
	private LocalTime hora;
	@Column(name="ponto_manual")
	private int ponto_manual;
	@Column(name="status")
	private int status;
	
		
	public Ocorrencia() {
		super();
		
	}
	
	public Ocorrencia(int num_seq, Usuario usuario, Atividade atividade, String descricao, LocalDate data, LocalTime hora,
			int ponto_manual, int status) {
		super();
		this.num_seq = num_seq;
		this.usuario = usuario;
		this.atividade = atividade;
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
	public Usuario getId_usuario() {
		return usuario;
	}
	public void setId_usuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Atividade getId_atividade() {
		return atividade;
	}
	public void setId_atividade(Atividade atividade) {
		this.atividade = atividade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public LocalTime getHora() {
		return hora;
	}
	public void setHora(LocalTime hora) {
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
