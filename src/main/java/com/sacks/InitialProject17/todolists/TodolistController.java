package com.sacks.InitialProject17.todolists;

import java.util.List;

import com.sacks.InitialProject17.todolists.repositories.TodoListRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodolistController {
    @Autowired
    TodoListRepository repository;

    // GET
    // http:localhost:8080/lists
    @GetMapping("/lists")
    public List<TodoList> getAllLists() {
        return repository.findAll();
    }

    // POST
    @PostMapping("/lists")
    public void createTodoList(@RequestBody TodoList todoList) {
        repository.save(todoList);
    }

    // DELETE
    @DeleteMapping("/lists/{id}")
    public void deleteItem(@PathVariable long id) {
        repository.deleteById(id);
    }
}
