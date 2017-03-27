/**
 * @author Vincent Hendryanto H/13515089
 * Class Canary, mengatur konstruksi Canary
 */

package animal.airanimal.canary;
import animal.airanimal.AirAnimal;

class Canary extends AirAnimal {
  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan
   */
  Canary() {
    weight = 1;
    food_weight = 1;
    food_type = 1;
    type = 4;
    c_enemy = 0;
    sound = "Kweee";
    code = "$";
  }
}


