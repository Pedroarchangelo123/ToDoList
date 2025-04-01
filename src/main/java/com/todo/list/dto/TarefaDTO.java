package com.todo.list.dto;

import java.time.LocalDate;

import com.todo.list.entities.Tarefas;
import com.todo.list.entities.enums.Prioridade;
import com.todo.list.entities.enums.Status;


public class TarefaDTO {
	private long id;
	private String descricao;
	private String Setor;
	private Prioridade prioridade;
	private LocalDate dataCadastro;
	private Status status;
	private Long idUsuario;
	public TarefaDTO() {
	}
	public TarefaDTO(long id, String descricao, String setor, Prioridade prioridade, LocalDate dataCadastro,
			Status status, Long idUsuario) {
		this.id = id;
		this.descricao = descricao;
		Setor = setor;
		this.prioridade = prioridade;
		this.dataCadastro = dataCadastro;
		this.status = status;
		this.idUsuario = idUsuario;
	}
	public TarefaDTO(Tarefas entity) {
		id = entity.getId();
		descricao = entity.getDescricao();
		Setor = entity.getSetor();
		this.prioridade = entity.getPrioridade();
		this.dataCadastro = entity.getDataCadastro();
		this.status = entity.getStatus();
		this.idUsuario = entity.getUsuario().getId();
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
		return Setor;
	}
	public void setSetor(String setor) {
		Setor = setor;
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
	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	

	
}
