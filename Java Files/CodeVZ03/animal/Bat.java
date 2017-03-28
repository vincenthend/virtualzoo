/**
 * @author Vincent Hendryanto H/13515089
 * Class Bat, mengatur konstruksi Bat
 */
package animal;
public class Bat extends AirAnimal {
  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan
   */
  public Bat() {
    super();
    weight = 1;
    foodWeight = 1;
    foodType = 1;
    type = 5;
    cEnemy = 2;
    sound = "shriekkkkkk";
    code = '%';
    enemyId = new int [cEnemy];
    enemyId[0] = 2;
    enemyId[1] = 4;
  }
}


