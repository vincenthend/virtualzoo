/**
 * @author Vincent Hendryanto H/13515089
 * Class Whale, mengatur konstruksi Whale
 */

package animal;
public class Whale extends WaterAnimal {
  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan
   */
  public Whale() {
    super();
    weight = 1;
    foodWeight = 1;
    foodType = 2;
    type = 18;
    cEnemy = 0;
    sound = "wooooooooooooo";
    code = '<';
  }
}


