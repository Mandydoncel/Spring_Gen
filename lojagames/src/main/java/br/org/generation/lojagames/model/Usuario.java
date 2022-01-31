package br.org.generation.lojagames.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="tb_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message="O atribuo Nome é obrigatório!")
	private String nome;
	
	@NotNull(message="O atributo Usuário é obrigatório!")
	@Email(message="O atributo Usuário deve ser um email válido.")
	private String usuario;
	
	@NotBlank(message="O atributo Senha é obrigatório!")
	@Size(min=8, message="A senha deve ter no mínimo 8 caracteres")
	private String senha;
	
	private String foto;
	
	@Column(name="data_nascimento")
	@JsonFormat(pattern = "yyyy-MM-dd")
	@NotNull(message = "O atributo Data de Nascimento é obrigatório")
	private LocalDate dataNasc;
	
	public Usuario(Long id, String nome, String usuario, String senha, String foto, LocalDate dataNasc) {
		this.id= id;
		this.nome=nome;
		this.usuario=usuario;
		this.senha=senha;
		this.foto=foto;
		this.dataNasc=dataNasc;
	}
	
	public Usuario () {}

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

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
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

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}

}