package com.moduler.todo.service;

import org.module.entity.TodoEntity;

import java.util.List;

public interface TodoService {

    List<TodoEntity> getAllTodos();

    TodoEntity getTodoById(Long id);

    TodoEntity saveTodo(TodoEntity todo);

}
