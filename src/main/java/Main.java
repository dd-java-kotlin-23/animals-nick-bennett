import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  static void main() {

    List<Canis> roster = new ArrayList<>();
    roster.add(new Dog());
    roster.add(new Dog());
//    roster.add(new Coyote());
    roster.add(new GreyWolf());
    roster.add(new Beagle());

    Collections.shuffle(roster);

    for (Canis c : roster) {
      c.hunt();
      c.vocalize();
      switch (c) {
        case Dog _ -> Dog.describe();
        case GreyWolf _ -> GreyWolf.describe();
        default -> Canis.describe();
      }
      c.describe();
    }

  }

}
