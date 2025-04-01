package com.todo.list.dto;

import com.todo.list.entities.Usuario;


public class UsuarioDTO {
	private long id;
	 private String nome;
	 private String email;
	public UsuarioDTO() {
	}
	public UsuarioDTO(long id, String nome, String email) {
		//o this sinaliza que o id é o id que foi declarado no DTO, e o que vem depois do sinal de igual é o que você passou nos parenteses :))
		this.id = id;
		this.nome = nome;
		this.email = email;
	}
	public UsuarioDTO(Usuario entity) {
		id = entity.getId();
		nome = entity.getNome();
		email = entity.getEmail();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
