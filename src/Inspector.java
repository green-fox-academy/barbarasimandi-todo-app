import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Inspector {

  String[] args;
  Listing listing = new Listing();
  Adding adding = new Adding();

  public void inspectArgs(String[] args) {
    if (args.length == 0) {
      listing.menu();
    }
    else if (args[0].equals("-l")) {
      listing.task();
    }
    else if (args[0].equals("-a")) {
      adding.task(args[1]);
    }
  }
  public void inspectDefault() {

  }
}


