/**
 * @author Vincent Hendryanto H/13515089
 * Class Chameleon, mengatur konstruksi Chameleon
 */

package animal.landanimal.chameleon;
import animal.landanimal.LandAnimal;

class Chameleon extends LandAnimal {
  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan
   */
  Chameleon() {
    weight = 1;
    food_weight = 1;
    food_type = 2;
    type = 16;
    c_enemy = 0;
    sound = "Scrook...";
    code = "}";
  }
}


