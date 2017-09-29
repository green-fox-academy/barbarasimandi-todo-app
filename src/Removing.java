import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Removing {



  public void remove(String indexString) {

    int index = Integer.parseInt(indexString);

    try {
      Path filePath = Paths.get("C:/greenfox/barbarasimandi-todo-app/src/tasks.txt");
      ArrayList<String> lines = new ArrayList<>(Files.readAllLines(filePath));

      lines.remove(lines.get(index - 1));
      Files.write(filePath, lines);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
