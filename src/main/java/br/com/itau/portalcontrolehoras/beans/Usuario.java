package br.com.itau.portalcontrolehoras.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="itmn232_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_usuario;
	@Column(name="nome_usuario",length=100)
	private String nome_usuario;
	@Column(name="email_usuario",length=100)
	private String email_usuario;
	@Column(name="racf",length=7)
	private String racf;
	@Column(name="senha",length=50)
	private String senha;
	@Column(name="link_foto",length=255)
	private String foto;
	@Column(name="gestor")
	private int gestor;
	
	public Usuario(int id_usuario, String nome_usuario, String email_usuario, String racf, String senha, String foto,
			int gestor) {
		super();
		this.id_usuario = id_usuario;
		this.nome_usuario = nome_usuario;
		this.email_usuario = email_usuario;
		this.racf = racf;
		this.senha = senha;
		this.foto = foto;
		this.gestor = gestor;
	}
	
	public Usuario() {
		super();		
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNome_usuario() {
		return nome_usuario;
	}

	public void setNome_usuario(String nome_usuario) {
		this.nome_usuario = nome_usuario;
	}

	public String getEmail_usuario() {
		return email_usuario;
	}

	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}

	public String getRacf() {
		return racf;
	}

	public void setRacf(String racf) {
		this.racf = racf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public int getGestor() {
		return gestor;
	}

	public void setGestor(int gestor) {
		this.gestor = gestor;
	}
	
}
