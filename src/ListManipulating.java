import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ListManipulating {

  boolean completed;
  Path filePath = Paths.get("C:/greenfox/barbarasimandi-todo-app/src/tasks.txt");

  public ListManipulating() {
    this.completed = false;
  }

  public void append(String input) {
    try {
      List<String> lines = new ArrayList<>();
      lines.add(input);
      Files.write(filePath, lines, StandardOpenOption.APPEND);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void remove(String indexString) {
    int index = Integer.parseInt(indexString);
    try {
      ArrayList<String> lines = new ArrayList<>(Files.readAllLines(filePath));
      lines.remove(lines.get(index - 1));
      Files.write(filePath, lines);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public boolean complete(String toBeCompleted) {
    int index = Integer.parseInt(toBeCompleted);
    return this.completed = true;

    /*try {
      Path filePath = Paths.get("C:/greenfox/barbarasimandi-todo-app/src/tasks.txt");
      ArrayList<String> lines = new ArrayList<>(Files.readAllLines(filePath));
      for (int i = 0; i < lines.size() - 1; i++) {
        if (completed) {
          lines.set(index - 1, "[x] " + lines.get(index-1));
        }
      }
      Files.write(filePath, lines);
    } catch (IOException e) {
      e.printStackTrace();
    }*/
  }
}

  /*@Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }
}*/