package com.moduler.todo.service.impl;

import com.moduler.todo.entity.TodoEntity;
import com.moduler.todo.repository.TodoRepository;
import com.moduler.todo.service.TodoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService {

    private final TodoRepository todoRepository;

    @Override
    public List<TodoEntity> getAllTodos() {
        return todoRepository.findAll();
    }

    @Override
    public TodoEntity getTodoById(Long id) {
        return todoRepository.findById(id).orElse(new TodoEntity());
    }

    @Override
    public TodoEntity saveTodo(TodoEntity todo) {
        return todoRepository.save(todo);
    }

}
