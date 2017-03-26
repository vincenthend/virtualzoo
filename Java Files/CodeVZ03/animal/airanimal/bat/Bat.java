/**
 * @author Vincent Hendryanto H/13515089
 * Class Bat, mengatur konstruksi Bat
 */

package animal.airanimal.bat;
import animal.airanimal.AirAnimal;

class Bat extends AirAnimal {
  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan
   */
  Bat() {
    weight = 1;
    food_weight = 1;
    food_type = 1;
    type = 5;
    c_enemy = 0;
    sound = "shriekkkkkk";
    code = "%";
  }
}


