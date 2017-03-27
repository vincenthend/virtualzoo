/**
 * @author Vincent Hendryanto H/13515089
 * Class Canary, mengatur konstruksi Canary
 */

package animal;
public class Canary extends AirAnimal {
  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan
   */
  public Canary() {
    super();
    weight = 1;
    foodWeight = 1;
    foodType = 1;
    type = 4;
    cEnemy = 0;
    sound = "Kweee";
    code = '$';
  }
}


