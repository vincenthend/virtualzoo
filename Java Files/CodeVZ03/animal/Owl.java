package animal;

/**
 * Class Owl, mengatur konstruksi Owl.
 *
 * @author Vincent Hendryanto H/13515089
 */
public class Owl extends AirAnimal {

  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan.
   */
  public Owl() {
    super();
    weight = 1;
    foodWeight = 1;
    foodType = 2;
    type = 2;
    countEnemy = 0;
    sound = "HootHoot";
    code = '@';
  }
}


