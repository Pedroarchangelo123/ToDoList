package com.todo.list.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.list.dto.TarefaDTO;
import com.todo.list.entities.Tarefas;
import com.todo.list.entities.Usuario;
import com.todo.list.entities.enums.Prioridade;
import com.todo.list.entities.enums.Status;
import com.todo.list.repositories.TarefaRepository;
import com.todo.list.repositories.UsuarioRepository;

@Service
public class TarefaService {
<<<<<<< HEAD
@Autowired
TarefaRepository tarefaRepository;
@Autowired
=======
@Autowired// Injeta a dependência do repository de tarefas
TarefaRepository tarefaRepository;
@Autowired// Injeta a dependência do repository de usuarios
>>>>>>> db3f86d (AGORA COM COMENTARIO AEEEE)
UsuarioRepository usuarioRepository;

public TarefaDTO salvarTarefa(TarefaDTO dto){
	Tarefas task = new Tarefas();
<<<<<<< HEAD
	task.setDescricao(dto.getDescricao());
	task.setSetor(dto.getSetor());
	task.setPrioridade(Prioridade.BAIXA);
	task.setDataCadastro(LocalDate.now());
	task.setStatus(Status.A_FAZER);
	Usuario user = usuarioRepository.getReferenceById(dto.getIdUsuario());
	task.setUsuario(user);
	
	task = tarefaRepository.save(task);
	return new TarefaDTO(task);
}
public List<Tarefas> listarTarefas(){
	List<Tarefas> tarefas = tarefaRepository.findAll();	
	return tarefas;
=======
	// Cria uma nova instância da entidade Tarefas
    task.setDescricao(dto.getDescricao()); // Define a descrição da tarefa
    task.setSetor(dto.getSetor()); // Define o setor da tarefa
    task.setPrioridade(Prioridade.BAIXA); // Define a prioridade inicial como BAIXA 
    task.setDataCadastro(LocalDate.now()); // Define a data de cadastro como a data atual
    task.setStatus(Status.A_FAZER); // Define o status inicial como "A FAZER"
    
    // Busca o usuário associado à tarefa pelo ID
    Usuario user = usuarioRepository.getReferenceById(dto.getIdUsuario());
    task.setUsuario(user); // Define o usuário da tarefa
 // Salva a tarefa no banco de dados
	task = tarefaRepository.save(task);
	
	// Retorna a tarefa salva convertida para DTO
	return new TarefaDTO(task);
}
//Método para listar todas as tarefas salvas no banco de dados
public List<Tarefas> listarTarefas(){
	List<Tarefas> tarefas = tarefaRepository.findAll();	// Busca todas as tarefas no banco
	return tarefas;//Retorna a lista de tarefas
>>>>>>> db3f86d (AGORA COM COMENTARIO AEEEE)
}
}
