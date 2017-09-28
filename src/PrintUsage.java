import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PrintUsage {

  public static void main(String[] args) {

    if (args.length == 0) {
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

    else if (args[0].equals("-l")) {
      try {
        Path filePath2 = Paths.get("C:/greenfox/barbarasimandi-todo-app/src/EmptyList.txt");
        List<String> lines2 = Files.readAllLines(filePath2);
        if (lines2.size() == 0){
          System.out.println("No todos for today :)");
        }
        for (int i = 0; i < lines2.size(); i++) {
          System.out.println((i + 1) + " - " + lines2.get(i));
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
