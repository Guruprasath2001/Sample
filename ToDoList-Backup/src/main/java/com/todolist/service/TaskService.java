package com.todolist.service;

import java.util.List;

import com.todolist.entity.Task;

public interface TaskService {

	Task createTask(Task task);

	Task completeTask(int id);

	Task incompleteTask(int id);

	List<Task> getAllTasks();

	void updateTask(Task task);

	void deleteTaskById(int id);
}