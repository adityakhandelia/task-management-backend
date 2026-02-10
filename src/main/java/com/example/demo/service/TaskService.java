package com.example.demo.service;

import com.example.demo.exception.TaskNotFoundException;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Task;
import com.example.demo.repository.TaskRepository;
import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;
    public TaskService(TaskRepository taskRepository){
        this.taskRepository=taskRepository;
    }
    //CREATE
    public Task createTask(Task task){
        return taskRepository.save(task);
    }
    //READ ALL
    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }
    //READ BY ID
    public Task getTaskById(Long id){
        return taskRepository.findById(id).orElseThrow(()->new TaskNotFoundException(id));
    }
    //UPDATE
    public Task updateTask(Long id,Task updatedTask){
        Task existingTask=getTaskById(id);
        existingTask.setTitle(updatedTask.getTitle());
        existingTask.setDescription(updatedTask.getDescription());
        existingTask.setCompleted(updatedTask.getCompleted());
        return taskRepository.save(existingTask);
    }
    public void deleteTask(Long id){
        taskRepository.deleteById(id);
    }
}
