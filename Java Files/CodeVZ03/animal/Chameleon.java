package animal;

/**
 * Class Chameleon, mengatur konstruksi Chameleon.
 *
 * @author Vincent Hendryanto H/13515089
 */
public class Chameleon extends LandAnimal {

  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan.
   */
  public Chameleon() {
    super();
    weight = 1;
    foodWeight = 1;
    foodType = 2;
    type = 16;
    countEnemy = 0;
    sound = "Scrook...";
    code = '}';
  }
}


