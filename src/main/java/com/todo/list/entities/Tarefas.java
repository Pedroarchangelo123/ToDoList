package com.todo.list.entities;

import java.time.LocalDate;

import com.todo.list.entities.enums.Prioridade;
import com.todo.list.entities.enums.Status;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity //Identifica que é uma entidade
@Table(name = "tb_tarefas")
public class Tarefas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	//O column definition faz com que na hora de criar a tabela no banco, o campo descricao sera text e não stringgggg
	@Column(columnDefinition = "TEXT")
	@JoinColumn()
	private String descricao;
	private String setor;
	private Prioridade prioridade;
	private LocalDate dataCadastro;
	private Status status;

	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;
	public Tarefas() {
	}
	public Tarefas(long id, String descricao, String setor, Prioridade prioridade, LocalDate dataCadastro,
			Status status, Usuario usuario) {
		this.id = id;
		this.descricao = descricao;
		this.setor = setor;
		this.prioridade = prioridade;
		this.dataCadastro = dataCadastro;
		this.status = status;
		this.usuario = usuario;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public Prioridade getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(Prioridade prioridade) {
		this.prioridade = prioridade;
	}
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
