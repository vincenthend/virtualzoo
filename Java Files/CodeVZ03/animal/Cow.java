/**
 * @author Vincent Hendryanto H/13515089
 * Class Cow, mengatur konstruksi Cow
 */

package animal;
public class Cow extends LandAnimal {
  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan
   */
  public Cow() {
    super();
    weight = 1000;
    foodWeight = 2;
    foodType = 1;
    type = 10;
    cEnemy = 0;
    sound = "Mooo...";
    code = '+';
  }
}


