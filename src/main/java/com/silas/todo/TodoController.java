package com.silas.todo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
public class TodoController {
    @GetMapping("/todolist")
    public List<Todo> all(){
        List<Todo> todoList = new ArrayList<>();
        Todo todo1 = new Todo();
        todo1.setId(1);
        todo1.setCompleted(false);
        todo1.setDeadline(new Date());
        todo1.setDescription("description");
        todo1.setTitle("todo1");
        todoList.add(todo1);

        Todo todo2 = new Todo();
        todo2.setId(2);
        todo2.setCompleted(false);
        todo2.setDeadline(new Date());
        todo2.setDescription("description2");
        todo2.setTitle("todo2");
        todoList.add(todo2);

        return todoList;
    }
}
