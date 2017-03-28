/**
 * @author Vincent Hendryanto H/13515089
 * Class Goldfish, mengatur konstruksi Goldfish
 */

package animal;
public class Goldfish extends WaterAnimal {
  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan
   */
  public Goldfish() {
    super();
    weight = 1;
    foodWeight = 1;
    foodType = 2;
    type = 20;
    cEnemy = 0;
    sound = "*glub glub*";
    code = '/';
  }
}


