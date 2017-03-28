/**
 * @author Vincent Hendryanto H/13515089
 * Class Dolphin, mengatur konstruksi Dolphin
 */
package animal;
public class Dolphin extends WaterAnimal {
  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan
   */
  public Dolphin() {
    super();
    weight = 1;
    foodWeight = 1;
    foodType = 1;
    type = 23;
    cEnemy = 0;
    sound = "*swims slowly*";
    code = '0';
  }
}


