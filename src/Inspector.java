public class Inspector {

  String[] args;
  Listing listing = new Listing();
  Adding adding = new Adding();
  Removing removing = new Removing();

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

    else if (args[0].equals("-r")) {
      removing.remove(args[1]);
    }
  }
  public void inspectDefault() {

  }
}


