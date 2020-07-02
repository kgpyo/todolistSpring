package com.example.todoslitApi.controller;

import java.util.List;

import com.example.todoslitApi.dto.Todo;
import com.example.todoslitApi.service.TodoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
    @Autowired
    private TodoService service;

    @GetMapping("/works")
    List<Todo> all() {
        return service.findAll();
    }

    @GetMapping("/works/{id}")
    Todo find(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping("/works")
    Todo save(@RequestBody Todo todo) {
        service.insert(todo.getContent());
        return todo;
    }

    @PutMapping("/works/{id}")
    Todo update(@PathVariable Long id, @RequestBody Todo todo) {
        todo.setId(id);
        service.update(todo);
        return todo;
    }

    @DeleteMapping("/works/{id}")
    int delete(@PathVariable Long id) {
        return service.delete(id);
    }
}