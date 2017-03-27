/**
 * @author Vincent Hendryanto H/13515089
 * Class Pigeon, mengatur konstruksi Pigeon
 */

package animal.airanimal.pigeon;
import animal.airanimal.AirAnimal;

class Pigeon extends AirAnimal {
  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan
   */
  Pigeon() {
    weight = 1;
    food_weight = 1;
    food_type = 1;
    type = 3;
    c_enemy = 0;
    sound = "Coo Coo";
    code = "#";
  }
}


