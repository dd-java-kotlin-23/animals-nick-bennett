public abstract class Canis {

  public Canis() {
    System.out.println("In Canis constructor prologue");
    super();
    System.out.println("In Canis constructor epilogue");
  }

  {
    System.out.println("In Canis instance initialization");
  }

  static {
    System.out.println("In Canis static initialization");
  }

  public abstract void vocalize();

  public abstract void hunt();

  public static void describe() {
    System.out.println("Canis");
  }

}
