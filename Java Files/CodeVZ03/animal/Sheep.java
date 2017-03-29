package animal;

/**
 * Class Sheep, mengatur konstruksi Sheep.
 *
 * @author Vincent Hendryanto H/13515089
 */
public class Sheep extends LandAnimal {

  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan.
   */
  public Sheep() {
    super();
    weight = 1;
    foodWeight = 1;
    foodType = 1;
    type = 15;
    countEnemy = 0;
    sound = "Baaaaaaaaaa";
    code = '{';
  }
}


