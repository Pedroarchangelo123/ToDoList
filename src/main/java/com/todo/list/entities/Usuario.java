package com.todo.list.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name = "tb_usuario")
public class Usuario {
	//Identifica que é uma chave primária
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private long id;
 private String nome;
 //Essa anotacao faz com que o campo email seja unico por usuario
 @Column(unique = true)
 private String email;
<<<<<<< HEAD
 //Cria a relaçao um para muitos e o mappedby conecta o campo usuario que foi criado na tabela tarefas
 @OneToMany( mappedBy = "usuario")
 private List<Tarefas> tarefas;
=======
 //Cria a relaçao um para muitos 
 @OneToMany( mappedBy = "usuario")//mappedby:explica que o mapeamento é feito pela variavel "usuario" na entidade tarefas
 private List<Tarefas> tarefas;//Armazena as tarefas atribuidas ao usuario
>>>>>>> db3f86d (AGORA COM COMENTARIO AEEEE)

public Usuario() {
	this.id = id;
	this.nome = nome;
	this.email = email;
	//passa os argumentos id nome e email
}
//Os getters e setters ai embaixo é para criar os metodos de pegar os atributos e o set é para modificar eles
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

public List<Tarefas> getTarefas() {
	return tarefas;
}

public void setTarefas(List<Tarefas> tarefas) {
	this.tarefas = tarefas;
}
 
 
}