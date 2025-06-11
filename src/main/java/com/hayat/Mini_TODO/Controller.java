package com.hayat.Mini_TODO;

import com.hayat.Mini_TODO.Todo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //means: this class handles Http requests
@RequestMapping("/todos") //means: this specifies the URL endpoints for this class
public class Controller {

    //Dependency Injection for business Logic
    private final TodoService todoService;

    //Uses constructor logic ensuring TodoService is properly managed
    public Controller(TodoService todoService){
        this.todoService = todoService;
    }

    // Handles Get/todos requests
    // calls all the Todos from TodoService to fetch all saved tasks
    @GetMapping
    public List<Todo> getTodos(){
        return todoService.getAllTodos();
    }

    // Handles Post/ todos
    @PostMapping
    public Todo addTodo(@RequestBody Todo todo){
        return todoService.addTodo(todo.getTask());
    }

    //Handles updates in the todo task status
    @PutMapping("/{id}")
    public void updateCompleted(@PathVariable int id, @RequestParam boolean completed){
        todoService.updateStatus(id, completed);
    }

    // Handles Delete/Todos
    @DeleteMapping("/{id}")
        public String deleteTodo(@PathVariable int id){
        return todoService.deleteTodo(id) ? "Deleted!": "Not Found!!";
        }
}
