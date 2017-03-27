/**
 * @author Vincent Hendryanto H/13515089
 * Class Seal, mengatur konstruksi Seal
 */

package animal.wateranimal.seal;
import animal.wateranimal.WaterAnimal;

class Seal extends WaterAnimal {
  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan
   */
  Seal() {
    weight = 25;
    food_weight = 1;
    food_type = 2;
    type = 22;
    c_enemy = 0;
    sound = "Bawrk Bawrk!";
    code = "\";
  }
}


