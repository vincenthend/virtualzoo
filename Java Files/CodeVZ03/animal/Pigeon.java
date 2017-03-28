/**
 * @author Vincent Hendryanto H/13515089
 * Class Pigeon, mengatur konstruksi Pigeon
 */
package animal;
public class Pigeon extends AirAnimal {
  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan
   */
  public Pigeon() {
    super();
    weight = 1;
    foodWeight = 1;
    foodType = 1;
    type = 3;
    cEnemy = 0;
    sound = "Coo Coo";
    code = '#';
  }
}


