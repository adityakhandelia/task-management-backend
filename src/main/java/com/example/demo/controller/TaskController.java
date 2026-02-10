package com.example.demo.controller;

import com.example.demo.service.TaskService;
import com.example.demo.entity.Task;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;
import io.swagger.v3.oas.annotations.Operation;



@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskService taskService;
    public TaskController(TaskService taskService){
        this.taskService=taskService;
    }
    @Operation(summary = "Create a new task")
    @PostMapping
    public Task createTask(@Valid @RequestBody Task task){
        return taskService.createTask(task);
    }
    @Operation(summary = "Get all tasks")
    @GetMapping
    public List<Task> getAllTasks(){
        return taskService.getAllTasks();
    }
    // READ BY ID
    @Operation(summary = "Get task by id")
    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id) {
        return taskService.getTaskById(id);
    }

    // UPDATE
    @Operation(summary = "Update task by id")
    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id,
                           @Valid @RequestBody Task task) {
        return taskService.updateTask(id, task);
    }

    // DELETE
    @Operation(summary = "Delete task by id")
    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return "Task deleted successfully";
    }

}
