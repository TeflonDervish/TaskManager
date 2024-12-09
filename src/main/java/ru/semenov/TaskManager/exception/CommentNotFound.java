package ru.semenov.TaskManager.exception;

public class CommentNotFound extends RuntimeException {
  public CommentNotFound(String message) {
    super(message);
  }
}
