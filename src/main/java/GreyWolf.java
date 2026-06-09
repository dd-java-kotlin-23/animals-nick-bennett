public sealed class GreyWolf extends Canis permits Dog {

  private final int x = getInitialValue();

  public GreyWolf() {
    System.out.println("In GreyWolf constructor prologue");
    super();
    System.out.println("In GreyWolf constructor epilogue");
  }

  {
    System.out.println("In GreyWolf instance initialization");
  }

  static {
    System.out.println("In GreyWolf static initialization");
  }

  private final int y = getInitialValue();

  @Override
  public void vocalize() {
    System.out.println("Awoooo!");
  }

  @Override
  public void hunt() {
    System.out.println("The wolf is hunting some deer");
  }

  public static void describe() {
    System.out.println("GreyWolf");
  }

  private int getInitialValue() {
    System.out.println("In GreyWolf.getInitialValue");
    return -1;
  }

}
