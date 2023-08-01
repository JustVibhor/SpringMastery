package com.justvibhor.springboot.springwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

	private static List<Todo> todos = new ArrayList<>();
	private static int todoCount = 0;

	static {
		todos.add(new Todo(++todoCount, "JustVibhor", "Learn AWS", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todoCount, "JustVibhor", "DevOps", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todoCount, "JustVibhor", "Qubits", LocalDate.now().plusYears(3), false));
	}

	public List<Todo> findByUsername(String userName) {

		return todos;
	}

	public void addTodo(String userName, String description, LocalDate targetDate, boolean isDone) {
		Todo todo = new Todo(++todoCount, userName, description, targetDate, isDone);
		todos.add(todo);
	}

}
