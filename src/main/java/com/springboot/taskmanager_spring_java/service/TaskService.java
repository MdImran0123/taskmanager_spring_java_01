package com.springboot.taskmanager_spring_java.service;

import com.springboot.taskmanager_spring_java.entities.TaskEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class TaskService {
    private ArrayList<TaskEntity> tasks = new ArrayList<>();
    private int taskid = 1;
}
