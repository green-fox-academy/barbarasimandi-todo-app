import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Adding {

  List<String> input;

  public void task(String input) {
    try {
      Path filePath = Paths.get("C:/greenfox/barbarasimandi-todo-app/src/tasks.txt");
      List<String> lines = new ArrayList<>();
      lines.add(input);
      Files.write(filePath, lines, StandardOpenOption.APPEND);

    } catch (IOException e) {
      e.printStackTrace();
    }
    }
}
