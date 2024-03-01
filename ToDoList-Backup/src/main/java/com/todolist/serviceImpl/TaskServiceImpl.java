package com.todolist.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todolist.entity.Task;
import com.todolist.exception.TaskNotFoundException;
import com.todolist.repository.TaskRepository;
import com.todolist.service.TaskService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class TaskServiceImpl implements TaskService {

	@Autowired
	private TaskRepository taskRepository;

	@Override
	public Task createTask(Task task) {
		taskRepository.save(task);
		return task;
	}

	@Override
	public Task completeTask(int id) {
		return taskRepository.findById(id).map(task -> {
			task.setCompleted(true);
			taskRepository.save(task);
			return task;
		}).orElseThrow(() -> new TaskNotFoundException("Task with ID " + id + " not found"));
	}

	@Override
	public Task incompleteTask(int id) {
		return taskRepository.findById(id).map(task -> {
			task.setCompleted(false);
			taskRepository.save(task);
			return task;
		}).orElseThrow(() -> new TaskNotFoundException("Task with ID " + id + " not found"));
	}

	@Override
	public List<Task> getAllTasks() {
		return taskRepository.findAll();
	}

	@Override
	public void deleteTaskById(int id) {
		taskRepository.findById(id).ifPresentOrElse(task -> taskRepository.deleteById(id), () -> {
			throw new TaskNotFoundException("Task with ID " + id + " not found");
		});
	}

	@Override
	public void updateTask(Task updatedTask) {
	    int taskId = updatedTask.getId(); // Assuming you have a getId() method in your Task class

	    Task existingTask = taskRepository.findById(taskId)
	            .orElseThrow(() -> new TaskNotFoundException("Task with ID " + taskId + " not found"));

	    // Update the fields of the existing task with the values from the updated task
	    existingTask.setTitle(updatedTask.getTitle());
	    existingTask.setDescription(updatedTask.getDescription());
	    existingTask.setCompleted(updatedTask.getCompleted());

	    // Save the updated task
	    taskRepository.save(existingTask);
	}

}
