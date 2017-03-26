/**
 * @author Vincent Hendryanto H/13515089
 * Class Whale, mengatur konstruksi Whale
 */

package animal.wateranimal.whale;
import animal.wateranimal.WaterAnimal;

class Whale extends WaterAnimal {
  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan
   */
  Whale() {
    weight = 1;
    food_weight = 1;
    food_type = 2;
    type = 18;
    c_enemy = 0;
    sound = "wooooooooooooo";
    code = "<";
  }
}


