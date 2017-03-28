/**
 * @author Vincent Hendryanto H/13515089
 * Class Mouse, mengatur konstruksi Mouse
 */
package animal;
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
    cEnemy = 0;
    sound = "Squeak-squeak";
    code = '~';
  }
}


