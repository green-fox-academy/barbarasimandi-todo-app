import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PrintUsage {

  public static void main(String[] args) {

    try {
      Path filePath = Paths.get("C:/greenfox/barbarasimandi-todo-app/src/PrintUsage.txt");
      List<String> lines = Files.readAllLines(filePath);
      for (String s : lines) {
        System.out.println(s);
      }
    } catch (IOException ex) {
      System.out.println("Unable to read file: PrintUsage.txt");
    }
  }
}
