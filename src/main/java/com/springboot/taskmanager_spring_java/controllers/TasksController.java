package com.springboot.taskmanager_spring_java.controllers;

import com.springboot.taskmanager_spring_java.entities.TaskEntity;
import com.springboot.taskmanager_spring_java.service.TaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    public final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
        
    }
}

@GetMapping()
public ResponseEntity<List<TaskEntity>> getTasks(){

}


