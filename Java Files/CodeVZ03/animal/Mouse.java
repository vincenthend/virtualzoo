package animal;
/**
 * @author Vincent Hendryanto H/13515089
 * Class Mouse, mengatur konstruksi Mouse
 */
public class Mouse extends LandAnimal {
  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan
   */
  public Mouse() {
    super();
    weight = 2;
    foodWeight = 1;
    foodType = 1;
    type = 11;
    cEnemy = 1;
    sound = "Squeak-squeak";
    code = '~';
    cEnemy = 1;
    enemyId = new int[cEnemy];
    enemyId[0] = 9;
  }
}


