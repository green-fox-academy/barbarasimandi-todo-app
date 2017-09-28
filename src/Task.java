public class Task {
  String taskName;
  boolean completed;

  public Task(String name) {
    this.taskName = name;
  }

  public void complete() {
    this.completed = true;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + taskName;
  }

}
