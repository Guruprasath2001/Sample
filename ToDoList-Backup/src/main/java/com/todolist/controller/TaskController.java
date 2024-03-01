package com.todolist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.todolist.entity.Task;
import com.todolist.serviceImpl.TaskServiceImpl;

@CrossOrigin(origins = "http://localhost:5500")

@RestController
@RequestMapping("/api/tasks") 
public class TaskController {

	@Autowired
	TaskServiceImpl taskService;

	@PostMapping
	ResponseEntity<Task> createTask(@RequestBody Task task) {
		Task createdTask = taskService.createTask(task);
		return new ResponseEntity<>(createdTask, HttpStatus.CREATED);
	}

	@GetMapping("/{id}/complete")
	public ResponseEntity<Task> completeTask(@PathVariable int id) {
		Task completedTask = taskService.completeTask(id);
		return new ResponseEntity<>(completedTask, HttpStatus.OK);
	}

	@GetMapping("/{id}/incomplete")
	public ResponseEntity<Task> incompleteTask(@PathVariable int id) {
		Task incompleteTask = taskService.incompleteTask(id);
		return new ResponseEntity<>(incompleteTask, HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<Task>> getAllTasks() {
		List<Task> tasks = taskService.getAllTasks();
		return new ResponseEntity<>(tasks, HttpStatus.OK);
	}

	@PutMapping("/{taskId}")
	public ResponseEntity<String> updateTask(@PathVariable int taskId, @RequestBody Task updatedTask) {
		try {
			updatedTask.setId(taskId);
			taskService.updateTask(updatedTask);
			return new ResponseEntity<>("Task updated successfully", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteTaskById(@PathVariable("id") int id) {
		taskService.deleteTaskById(id);
		return ResponseEntity.ok("Task deleted successfully with ID: " + id);
	}

}
