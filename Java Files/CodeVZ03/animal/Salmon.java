package animal;

/**
 * Class Salmon, mengatur konstruksi Salmon.
 *
 * @author Vincent Hendryanto H/13515089
 */
public class Salmon extends WaterAnimal {

  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan.
   */
  public Salmon() {
    super();
    weight = 1;
    foodWeight = 1;
    foodType = 2;
    type = 17;
    countEnemy = 2;
    sound = "blub blub";
    code = ':';
    enemyId = new int[countEnemy];
    enemyId[0] = 19;
    enemyId[1] = 21;
  }
}


