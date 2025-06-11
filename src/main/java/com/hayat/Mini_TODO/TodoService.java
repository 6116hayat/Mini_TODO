package com.hayat.Mini_TODO;

import java.util.List;

import java.util.ArrayList;

@org.springframework.stereotype.Service
public class TodoService {

    // A list to store all the task in the list
    private final List<Todo> todos = new ArrayList<>();
    private int idCounter = 1; // a counter for the task id to be incremented

    public List<Todo> getAllTodos(){
        return  todos;
    }

    // Method for the new Todo
    public Todo addTodo(String task){
        Todo todo = new Todo();
        todo.setId(idCounter++);
        todo.setTask(task);
        todo.setCompleted(false);
        todos.add(todo);
        return todo;
    }

    // Put method : for the updating the task status
    public void updateStatus(int id, boolean completed){
        todos.stream()
                .filter(todo -> todo.getId() == id)
                .findFirst()
                .ifPresent(todo -> todo.setCompleted(completed));
    }

    // To delete the task
    public boolean deleteTodo(int id){
        return todos.removeIf(todo -> todo.getId() == id);
    }
}
