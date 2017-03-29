package animal;

/**
 * Class Canary, mengatur konstruksi Canary.
 *
 * @author Vincent Hendryanto H/13515089
 */
public class Canary extends AirAnimal {

  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan.
   */
  public Canary() {
    super();
    weight = 1;
    foodWeight = 1;
    foodType = 1;
    type = 4;
    countEnemy = 0;
    sound = "Kweee";
    code = '$';
  }
}


