package com.moduler.todo.controller;

import com.moduler.todo.entity.TodoEntity;
import com.moduler.todo.service.TodoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/todo")
public class TodoController {

    private final TodoService todoService;

    @GetMapping(value = "/hello", produces = MediaType.TEXT_HTML_VALUE)
    public String hello() {
        return "Hello";
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<TodoEntity> getAllTodos() {
        return todoService.getAllTodos();
    }

    @GetMapping("/{id}")
    public TodoEntity getTodoById(@PathVariable Long id) {
        return todoService.getTodoById(id);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public TodoEntity createTodo(@RequestBody TodoEntity todo) {
        return todoService.saveTodo(todo);
    }

}
