/**
 * @author Vincent Hendryanto H/13515089
 * Class Goldfish, mengatur konstruksi Goldfish
 */

package animal.wateranimal.goldfish;
import animal.wateranimal.WaterAnimal;

class Goldfish extends WaterAnimal {
  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan
   */
  Goldfish() {
    weight = 1;
    food_weight = 1;
    food_type = 2;
    type = 20;
    c_enemy = 0;
    sound = "*glub glub*";
    code = "/";
  }
}


