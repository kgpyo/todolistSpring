package com.example.todoslitApi.service;

import java.util.List;

import com.example.todoslitApi.dto.Todo;
import com.example.todoslitApi.repository.TodoMapper;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
    private final TodoMapper mapper;

    public TodoService(TodoMapper mapper) {
        this.mapper = mapper;
    }

    public List<Todo> findAll() {
        return mapper.findAll();
    }

    public Todo findById(Long id) {
        return mapper.findById(id);
    }

    public int update(Todo todo) {
        return mapper.update(todo.getId(), todo.isFinish(), todo.getContent());
    }

    public void insert(String content) {
        mapper.insert(content);
    }

    public int delete(Long id) {
        return mapper.delete(id);
    }
}