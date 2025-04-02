package com.todo.list.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.list.dto.TarefaDTO;
import com.todo.list.entities.Tarefas;
import com.todo.list.services.TarefaService;


@RestController
<<<<<<< HEAD
@RequestMapping("tarefa")
public class TarefaController {
	 @Autowired
	 TarefaService tarefaService;
	 @PostMapping
=======
@RequestMapping("tarefa") // Define o caminho base para os endpoints desse controller
public class TarefaController {
	 @Autowired
	 TarefaService tarefaService;
	 @PostMapping // Define um endpoint HTTP POST para criar uma nova tarefa
>>>>>>> db3f86d (AGORA COM COMENTARIO AEEEE)
	 public ResponseEntity<TarefaDTO> criarTarefa(@RequestBody TarefaDTO dto){
		 dto = tarefaService.salvarTarefa(dto);
		 return ResponseEntity.ok(dto);
	 }
<<<<<<< HEAD
	 @GetMapping
=======
	 @GetMapping// Define um endpoint HTTP GET para listar todas as tarefas
>>>>>>> db3f86d (AGORA COM COMENTARIO AEEEE)
	 public ResponseEntity<List<Tarefas>> listarTarefas(){
		 
		 return ResponseEntity.ok(tarefaService.listarTarefas());
	 }
}
