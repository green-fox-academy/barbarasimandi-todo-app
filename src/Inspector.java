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
      try {
        adding.append(args[1]);
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Unable to add: no task provided");
      }
    }
  }
  public void inspectDefault() {

  }
}


