package animal;

/**
 * Class Chicken, mengatur konstruksi Chicken.
 *
 * @author Vincent Hendryanto H/13515089
 */
public class Chicken extends LandAnimal {

  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan.
   */
  public Chicken() {
    super();
    weight = 2;
    foodWeight = 1;
    foodType = 3;
    type = 8;
    countEnemy = 0;
    sound = "Cock-a-doodle-doo!";
    code = '*';
  }
}


