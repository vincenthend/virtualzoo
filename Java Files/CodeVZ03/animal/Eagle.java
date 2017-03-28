package animal;

/**
 * Class Eagle, mengatur konstruksi Eagle.
 * @author Vincent Hendryanto H/13515089
 */
public class Eagle extends AirAnimal {

  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan.
   */
  public Eagle() {
    super();
    weight = 2;
    foodWeight = 1;
    foodType = 2;
    type = 6;
    countEnemy = 0;
    sound = "Squawk!";
    code = '^';
  }
}


