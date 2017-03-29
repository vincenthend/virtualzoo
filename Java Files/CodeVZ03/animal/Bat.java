package animal;

/**
 * Class Bat, mengatur konstruksi Bat.
 *
 * @author Vincent Hendryanto H/13515089
 */
public class Bat extends AirAnimal {

  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan.
   */
  public Bat() {
    super();
    weight = 1;
    foodWeight = 1;
    foodType = 1;
    type = 5;
    countEnemy = 2;
    sound = "shriekkkkkk";
    code = '%';
    enemyId = new int[countEnemy];
    enemyId[0] = 2;
    enemyId[1] = 4;
  }
}


