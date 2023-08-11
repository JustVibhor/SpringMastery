package com.justvibhor.springboot.springwebapp.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("name")
public class TodoControllerJPA {

	public TodoControllerJPA(TodoRepository todoRepository) {
		super();
		this.todoRepository = todoRepository;
	}

	private TodoRepository todoRepository;

	@RequestMapping("list-todos")
	public String listAllTodo(ModelMap model) {
		String username = getLoggedInUsername(model);

		List<Todo> todos = todoRepository.findByUsername(username);
		model.put("todos", todos);
		return "listTodos";
	}

	@RequestMapping(value = "add-todo", method = RequestMethod.GET)
	public String showNewTodo(ModelMap model) {
		String userName = getLoggedInUsername(model);
		Todo todo = new Todo(0, userName, "", LocalDate.now().plusYears(1), false);
		model.put("todo", todo);
		return "addTodo";
	}

	@RequestMapping(value = "add-todo", method = RequestMethod.POST)
	public String addNewTodo(ModelMap model, @Valid Todo todo, BindingResult result) {

		if (result.hasErrors()) {
			return "addTodo";
		}

		String userName = getLoggedInUsername(model);
		todo.setUserName(userName);
		todoRepository.save(todo);
		
//		todoService.addTodo(userName, todo.getDescription(), todo.getTargetDate(), todo.isDone());
		return "redirect:list-todos";
	}

	@RequestMapping(value = "delete-todo")
	public String deleteTodo(@RequestParam int id) {
		todoRepository.deleteById(id);
		return "redirect:list-todos";
	}

	@RequestMapping(value = "update-todo", method = RequestMethod.GET)
	public String showUpdateTodoPage(@RequestParam int id, ModelMap model) {
		Todo todo = todoRepository.findById(id).get();
		model.put("todo", todo);
		return "addTodo";
	}

	@RequestMapping(value = "update-todo", method = RequestMethod.POST)
	public String updateTodo(ModelMap model, @Valid Todo todo, BindingResult result) {

		if (result.hasErrors()) {
			return "addTodo";
		}

		String userName = getLoggedInUsername(model);
		todo.setUserName(userName);
		todoRepository.save(todo);

		return "redirect:list-todos";
	}

	private String getLoggedInUsername(ModelMap model) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();

	}
}
