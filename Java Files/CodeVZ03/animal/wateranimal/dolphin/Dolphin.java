/**
 * @author Vincent Hendryanto H/13515089
 * Class Dolphin, mengatur konstruksi Dolphin
 */

package animal.wateranimal.dolphin;
import animal.wateranimal.WaterAnimal;

class Dolphin extends WaterAnimal {
  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan
   */
  Dolphin() {
    weight = 1;
    food_weight = 1;
    food_type = 1;
    type = 23;
    c_enemy = 0;
    sound = "*swims slowly*";
    code = "0";
  }
}


