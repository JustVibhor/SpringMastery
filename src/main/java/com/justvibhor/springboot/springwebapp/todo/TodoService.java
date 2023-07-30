package com.justvibhor.springboot.springwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

	private static List<Todo> todos = new ArrayList<>();

	static {
		todos.add(new Todo(1, "JustVibhor", "Learn AWS", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(2, "JustVibhor", "DevOps", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(2, "JustVibhor", "Qubits", LocalDate.now().plusYears(3), false));
	}

	public List<Todo> findByUsername(String userName) {

		return todos;
	}

}
