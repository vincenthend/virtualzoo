package animal;

/**
 * Class Cow, mengatur konstruksi Cow.
 * @author Vincent Hendryanto H/13515089
 */
public class Cow extends LandAnimal {

  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan.
   */
  public Cow() {
    super();
    weight = 1000;
    foodWeight = 2;
    foodType = 1;
    type = 10;
    countEnemy = 0;
    sound = "Mooo...";
    code = '+';
  }
}


