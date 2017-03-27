/**
 * @author Vincent Hendryanto H/13515089
 * Class Toucan, mengatur konstruksi Toucan
 */

package animal.airanimal.toucan;
import animal.airanimal.AirAnimal;

class Toucan extends AirAnimal {
  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan
   */
  Toucan() {
    weight = 1;
    food_weight = 1;
    food_type = 1;
    type = 7;
    c_enemy = 0;
    sound = "*flies away*";
    code = "&";
  }
}


