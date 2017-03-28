/**
 * @author Vincent Hendryanto H/13515089
 * Class Seal, mengatur konstruksi Seal
 */
package animal;
public class Seal extends WaterAnimal {
  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan
   */
  public Seal() {
    super();
    weight = 25;
    foodWeight = 1;
    foodType = 2;
    type = 22;
    cEnemy = 0;
    sound = "Bawrk Bawrk!";
    code = '\\';
  }
}


