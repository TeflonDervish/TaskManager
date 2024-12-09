package ru.semenov.TaskManager.exception;

public class TaskNotFound extends RuntimeException {
  public TaskNotFound(String message) {
    super(message);
  }
}
