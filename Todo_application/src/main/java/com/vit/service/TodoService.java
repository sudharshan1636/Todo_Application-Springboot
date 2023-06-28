package com.vit.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vit.model.Todo;
import com.vit.repository.TodoRepository;

@Service
public class TodoService implements ITodoService {
	
	@Autowired
	private TodoRepository todoRepository;

	@Override
	public List<Todo> getTodosByUser(String user) {
		List<Todo> list = todoRepository.findByUserName(user);
		return list;
	}

	@Override
	public Optional<Todo> getTodoById(long id) {
		Optional<Todo> todo = todoRepository.findById(id);
		return todo;
	}

	@Override
	public void updateTodo(Todo todo) {		
		todoRepository.save(todo);
	}

	@Override
	public void addTodo(String name, String desc, Date targetDate, boolean isDone) {
		Todo todo = new Todo(name, desc, targetDate, isDone);
		todoRepository.save(todo);
	}

	@Override
	public void deleteTodo(long id) {
		Optional<Todo> todo = todoRepository.findById(id);
		if(todo.isPresent()) {
			todoRepository.delete(todo.get());
		}
	}

	@Override
	public void saveTodo(Todo todo) {
		todoRepository.save(todo);
	}

}
