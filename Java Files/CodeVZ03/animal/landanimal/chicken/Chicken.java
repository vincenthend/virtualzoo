/**
 * @author Vincent Hendryanto H/13515089
 * Class Chicken, mengatur konstruksi Chicken
 */

package animal.landanimal.chicken;
import animal.landanimal.LandAnimal;

class Chicken extends LandAnimal {
  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan
   */
  Chicken() {
    weight = 2;
    food_weight = 1;
    food_type = 3;
    type = 8;
    c_enemy = 0;
    sound = "Cock-a-doodle-doo!";
    code = "*";
  }
}


