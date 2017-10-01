public class Inspector {

  String[] args;
  Listing listing = new Listing();
  ListManipulating adding = new ListManipulating();
  ListManipulating removing = new ListManipulating();
  ListManipulating checking = new ListManipulating();

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
      try {
        removing.remove(args[1]);
      } catch (ArrayIndexOutOfBoundsException ex) {
        System.out.println("Unable to remove: no index provided");
      } catch (IndexOutOfBoundsException ex) {
        System.out.println("Unable to remove: index is out of bound");
      } catch (NumberFormatException ex) {
        System.out.println("Unable to remove: index is not a number");
      }
    }
    else if(args[0].equals("-c")) {
      checking.complete(args[1]);
    }
    else {
      System.out.println("Unsupported argument\n");
      listing.menu();
    }
  }
}


