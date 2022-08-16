package com.silas.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
//    @PostMapping
//    public Todo saveTodo(
//            @Validated @RequestBody Todo todo)
//    {
//        return todoRepository.save(todo);
//    }q

    @GetMapping("/todolist")
    public List<Todo> all(){
        // Using built in JPA repository findall method
        return todoRepository.findAll();
    }

    @PostMapping("/addtodo")
    public ResponseEntity<Todo> saveTodo(@RequestBody Todo todo) {
        return new ResponseEntity<>(todoRepository.save(todo), HttpStatus.CREATED);
    }


}
