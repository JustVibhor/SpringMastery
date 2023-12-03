package com.justvibhor.springboot.learnSpringBoot.todo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Integer> {

	// As username is an attribute inside the todo bean, spring data jpa will
	// automatically provide a method to search by username
	public List<Todo> findByUsername(String username);
}
