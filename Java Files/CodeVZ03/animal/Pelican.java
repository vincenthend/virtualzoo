/**
 * @author Vincent Hendryanto H/13515089
 * Class Pelican, mengatur konstruksi Pelican
 */

package animal;
public class Pelican extends AirAnimal {
  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan
   */
  public Pelican() {
    super();
    weight = 5;
    foodWeight = 1;
    foodType = 2;
    type = 1;
    cEnemy = 0;
    sound = "Kraoooo";
    code = '!';
  }
}


