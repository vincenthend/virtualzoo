/**
 * @author Vincent Hendryanto H/13515089
 * Class Salmon, mengatur konstruksi Salmon
 */
package animal;
public class Salmon extends WaterAnimal {
  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan
   */
  public Salmon() {
    super();
    weight = 1;
    foodWeight = 1;
    foodType = 2;
    type = 17;
    cEnemy = 2;
    sound = "blub blub";
    code = ':';
    enemyId = new int[cEnemy];
    enemyId[0] = 19;
    enemyId[1] = 21;
  }
}


