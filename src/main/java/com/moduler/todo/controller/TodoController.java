package com.moduler.todo.controller;

import com.moduler.todo.service.TodoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.module.entity.TodoEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/todos")
public class TodoController {


    private final TodoService todoService;

    @GetMapping
    public List<TodoEntity> getAllTodos() {
        return todoService.getAllTodos();
    }

    @GetMapping("/{id}")
    public TodoEntity getTodoById(@PathVariable Long id) {
        return todoService.getTodoById(id);
    }

    @PostMapping
    public TodoEntity createTodo(@RequestBody TodoEntity todo) {
        return todoService.saveTodo(todo);
    }


}
