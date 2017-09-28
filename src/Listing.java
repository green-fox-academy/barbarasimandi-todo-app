import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Listing {
  public void menu() {
    try {
      Path filePath = Paths.get("C:/greenfox/barbarasimandi-todo-app/src/Menu.txt");
      List<String> lines = Files.readAllLines(filePath);
      for (String s : lines) {
        System.out.println(s);
      }
    }
    catch (IOException ex) {
      System.out.println("Unable to read file: PrintUsage.txt");
    }
  }
  public void task() {
    try {
      Path filePath2 = Paths.get("C:/greenfox/barbarasimandi-todo-app/src/tasks.txt");
      List<String> lines2 = Files.readAllLines(filePath2);
      if (lines2.size() == 0) {
        System.out.println("No todos for today :)");
      } else {
        for (int i = 0; i < lines2.size(); i++) {
          System.out.println((i + 1) + " - " + lines2.get(i));
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
