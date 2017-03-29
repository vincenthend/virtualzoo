package animal;

/**
 * Class Mouse, mengatur konstruksi Mouse.
 *
 * @author Vincent Hendryanto H/13515089
 */
public class Mouse extends LandAnimal {

  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan.
   */
  public Mouse() {
    super();
    weight = 2;
    foodWeight = 1;
    foodType = 1;
    type = 11;
    countEnemy = 1;
    sound = "Squeak-squeak";
    code = '~';
    countEnemy = 1;
    enemyId = new int[countEnemy];
    enemyId[0] = 9;
  }
}


