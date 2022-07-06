package com.silas.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;

    //Save operation
    @PostMapping
    public Todo saveTodo(
            @Validated @RequestBody Todo todo)
    {
        return todoRepository.save(todo);
    }

    @GetMapping("/todolist")
    public List<Todo> all(){
        return todoRepository.findAll();
    }
}
