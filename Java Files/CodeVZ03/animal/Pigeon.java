package animal;

/**
 * Class Pigeon, mengatur konstruksi Pigeon.
 * @author Vincent Hendryanto H/13515089
 */
public class Pigeon extends AirAnimal {

  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan.
   */
  public Pigeon() {
    super();
    weight = 1;
    foodWeight = 1;
    foodType = 1;
    type = 3;
    countEnemy = 0;
    sound = "Coo Coo";
    code = '#';
  }
}


