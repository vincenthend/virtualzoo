/**
 * @author Vincent Hendryanto H/13515089
 * Class Chicken, mengatur konstruksi Chicken
 */
package animal;
public class Chicken extends LandAnimal {
  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan
   */
  public Chicken() {
    super();
    weight = 2;
    foodWeight = 1;
    foodType = 3;
    type = 8;
    cEnemy = 0;
    sound = "Cock-a-doodle-doo!";
    code = '*';
  }
}


