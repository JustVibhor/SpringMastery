package com.justvibhor.springboot.learnSpringBoot.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

	private static List<Todo> todos = new ArrayList<>();
	private static int todoCount = 0;

	static {
		todos.add(new Todo(++todoCount, "JustVibhor", "Learn AWS 1", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todoCount, "JustVibhor", "DevOps 1", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todoCount, "JustVibhor", "Qubits 1", LocalDate.now().plusYears(3), false));
	}

	public List<Todo> findByUsername(String userName) {

		Predicate<? super Todo> predicate = todo -> todo.getUserName().equalsIgnoreCase(userName);
		return todos.stream().filter(predicate).toList();
	}

	public void addTodo(String userName, String description, LocalDate targetDate, boolean isDone) {
		Todo todo = new Todo(++todoCount, userName, description, targetDate, isDone);
		todos.add(todo);
	}

	public void deleteById(int id) {

		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		todos.removeIf(predicate);
	}

	public Todo findById(int id) {
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		Todo todo = todos.stream().filter(predicate).findFirst().get();
		return todo;
	}

	public void updateTodo(Todo todo) {
		deleteById(todo.getId());
		todos.add(todo);
	}

}
